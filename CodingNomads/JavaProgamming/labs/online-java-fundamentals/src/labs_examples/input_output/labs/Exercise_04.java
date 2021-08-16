package labs_examples.input_output.labs;

/*
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 */

import java.io.*;
import java.lang.Boolean;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_04 {
    private static Object Integer;
    private static Object Boolean;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String readPath = scanner.nextLine();
        String writePath = scanner.nextLine();

        // read input file
        System.out.println("\nStart reading from file...\n");
        ArrayList<User> users = readFile(readPath);

        // open & write from output file
        System.out.println("\nStart writing to file...\n");
        writeFile(writePath, users);

        System.out.println("Done!");
    }

    private static void writeFile (String writePath, ArrayList<User> usersList) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(writePath))) {

            for (User user : usersList) {
                Field[] instanceMembers = user.getClass().getDeclaredFields();

                for (Field instanceMember : instanceMembers) {
                    writeCsvField(instanceMember, user, writer);
                }

                writer.newLine();
            }

        } catch (IOException writeError) {
            System.out.println("write error:");
            writeError.printStackTrace();
        }
    }

    private static ArrayList<User> readFile(String readPath) {
        ArrayList<User> users = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(readPath))) {
            String lineFromCSV;

            while ((lineFromCSV = reader.readLine()) != null) {
                String[] csvFields = lineFromCSV.split(",");
                users.add(mapCsvFieldsToInstance(csvFields));
            }

        } catch (IOException inOutError) {
            System.out.println("in/out error:");
            inOutError.printStackTrace();
        }

        return users;
    }

    private static void writeCsvField (Field instanceMember, User user, BufferedWriter writer ) {
        try {

            if (instanceMember.get(user).getClass().getName() == Integer) {
                writer.write((int)instanceMember.get(user) + ",");
            } else if (instanceMember.get(user).getClass().getName() == Boolean) {
                writer.write((boolean) instanceMember.get(user) + ",");
            } else {
                writer.write(instanceMember.get(user).toString() + ",");
            }

        } catch (IOException | IllegalAccessException e) {
            System.out.println("error in writing class field to CSV!");
            e.printStackTrace();
        }
    }

    private static User mapCsvFieldsToInstance(String[] csvFields) {
        // create new class instance
        User newUser = new User(
                java.lang.Integer.parseInt(csvFields[0]),
                csvFields[1],
                csvFields[2],
                java.lang.Boolean.parseBoolean(csvFields[3]),
                csvFields[4]
        );


        // print new instance
        System.out.println(newUser);
        return newUser;
    }
}

class User {
    int id;
    String name;
    String email;
    String role;
    Boolean admin;

    public User (int id, String name, String email, Boolean admin, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.admin = admin;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", admin=" + admin +
                ", role='" + role + '\'' +
                '}';
    }
}