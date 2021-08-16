package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, read back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

class Exercise_02 {
    public static void main(String[]args) throws IOException {

        String fileInputPath = "/Users/boyankmetov/Downloads/Code/Java/CodingNomads/JavaProgamming/labs/online-java" +
                "-fundamentals/src/labs_examples/input_output/files/char_data.txt";
        String fileOutputPath = "/Users/boyankmetov/Downloads/Code/Java/CodingNomads/JavaProgamming/labs/online-java" +
                "-fundamentals/src/labs_examples/input_output/files/char_data_encrypted.txt";

        readAndEncrypt(fileInputPath, fileOutputPath);
        readAndDecrypt(fileInputPath);

        /* can be simplified to 1 function instead of 2:

            if fileOutputPath != null
                create printWriter
                encrypt
                write encrypted output
                close reader/writer
            else
                decrypt
                print decrypted output
                close reader only
       */
    }

    private static void readAndDecrypt (String fileInputPath) {
        try (BufferedReader bufferedReader =
                new BufferedReader(
                     new InputStreamReader(new FileInputStream(fileInputPath))))
        {
            int readChar;

            do {
                // decrypt & print
                readChar = bufferedReader.read();
                System.out.print(encryptChars(readChar, false));
            } while(readChar != -1);

        } catch (IOException error) {
            System.out.println("error reading file: " + error);
        }
    }


    private static void readAndEncrypt(String fileInputPath, String fileOutputPath) {
        int readChar;

        try (PrintWriter printWriter =
                new PrintWriter(new FileWriter(fileOutputPath));
            BufferedReader bufferedReader =
                new BufferedReader(
                        new InputStreamReader(new FileInputStream(fileInputPath))))
        {
            do {
                // encrypt & write
                readChar = bufferedReader.read();
                printWriter.write(encryptChars(readChar, true));

            } while(readChar != -1);

        } catch (IOException error) {
            System.out.println("Goddamn error: " + error);
        }
    }

    private static char encryptChars (int ch, boolean encrypt) {
        char character = (char) ch;

        if (encrypt) {
            return switch (character) {
                case 'a' -> (char) (ch - 52);
                case 'e' -> (char) (ch + 25);
                default -> (char) ch;
            };
        }

        return switch (character) {
            case '-' -> (char) (ch + 52);
            case '~' -> (char) (ch - 25);
            default -> (char) ch;
        };
    }
}


