import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.DateTime;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.calendar.Calendar;
import com.google.api.services.calendar.CalendarScopes;
import com.google.api.services.calendar.model.Event;
import com.google.api.services.calendar.model.Events;

import java.io.*;
import java.security.GeneralSecurityException;
import java.util.*;

public class CalendarQuickstart {
    private static final String APPLICATION_NAME = "Google Calendar API Java Quickstart";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private static final String TOKENS_DIRECTORY_PATH = "tokens";

    /**
     * Global instance of the scopes required by this quickstart.
     * If modifying these scopes, delete your previously saved tokens/ folder.
     */
    private static final List<String> SCOPES = Collections.singletonList(CalendarScopes.CALENDAR_READONLY);
    private static final String CREDENTIALS_FILE_PATH = "/credentials.json";

    /**
     * Creates an authorized Credential object.
     *
     * @param HTTP_TRANSPORT The network HTTP Transport.
     * @return An authorized Credential object.
     * @throws IOException If the credentials.json file cannot be found.
     */
    private static Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws IOException {
        // Load client secrets.
        InputStream in = CalendarQuickstart.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
        if (in == null) {
            throw new FileNotFoundException("Resource not found: " + CREDENTIALS_FILE_PATH);
        }
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

        // Build flow and trigger user authorization request.
        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
                HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
                .setDataStoreFactory(new FileDataStoreFactory(new File(TOKENS_DIRECTORY_PATH)))
                .setAccessType("offline")
                .build();
        LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8888).build();
        return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
    }

    public static void main(String... args) throws IOException, GeneralSecurityException {
        TimePeriod newTimePeriod = new TimePeriod();
        DateTime startDate = newTimePeriod.startDate;
        DateTime endDate = newTimePeriod.endDate;
        List<Event> CalendarEvents = fetchCalendarEvents(startDate, endDate);

        printResults(CalendarEvents, startDate, endDate);
    }

    private static class TimePeriod {
        private final DateTime startDate = formatDate(takeUserInput());
        private final DateTime endDate = new DateTime(System.currentTimeMillis());

        // brute force ftw \,,/
        private DateTime formatDate(String dateInput) {
            String dateTemplate = "2021-07-12T00:00:00.000+02:00";
            return new DateTime(dateTemplate.replace("2021-07-12", dateInput));
        }
    }

    private static List<Event> fetchCalendarEvents(DateTime startDate, DateTime endDate) throws GeneralSecurityException, IOException {
        // Build a new authorized API client service.
        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        Calendar service = new Calendar.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
                .setApplicationName(APPLICATION_NAME)
                .build();

        List<Event> calendarEvents = new ArrayList<>();
        String pageToken = null;

        do {
            Events events = service
                    .events()
                    .list("primary")
                    .setMaxResults(10)
                    .setTimeMin(startDate)
                    .setTimeMax(endDate)
                    .setOrderBy("startTime")
                    .setSingleEvents(true)
                    .setPageToken(pageToken)
                    .execute();

            pageToken = events.getNextPageToken();
            calendarEvents.addAll(events.getItems());

        } while (pageToken != null);

        return calendarEvents;
    }

    private static void printResults(List<Event> CalendarEvents, DateTime startDate, DateTime endDate) {
        if (CalendarEvents.isEmpty()) {
            System.out.printf(
                    "\nNo events found in the period %s - %s\n\n",
                    trimDate(startDate),
                    trimDate(endDate)
            );
        } else {
            System.out.printf(
                    "\nEvents in the period %s - %s\n\n",
                    trimDate(startDate),
                    trimDate(endDate)
            );

            for (Event event : CalendarEvents) {
                System.out.printf("%s\n", event.getSummary());
            }
        }
    }

    private static String takeUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start date in format YYYY-MM-DD: ");
        return scanner.next();
    }

    private static String trimDate(DateTime date) {
        // strip time & timezone
        return date.toString().split("T")[0];
    }
}