package labs_examples.input_output.labs;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 */

class Example {
    public static void main(String[] args) throws IOException {

        FileReader fileReader;
        FileWriter fileWriter;
        int readChars;

        String fileReadPath = "/Users/boyankmetov/Downloads/Code/Java/CodingNomads/JavaProgamming/labs/online-java-fundamentals/src/labs_examples/input_output/files/byte_data";
        String fileWritePath = "/Users/boyankmetov/Downloads/Code/Java/CodingNomads/JavaProgamming/labs/online-java" +
                "-fundamentals/src/labs_examples/input_output/files/byte_data_copy";

        // open files
        fileReader = new FileReader(fileReadPath);
        fileWriter = new FileWriter(fileWritePath);

        // read file
        while ((readChars = fileReader.read()) != -1) {

            // write data
            fileWriter.write(readChars);
            readChars = fileReader.read();
        }

        // close connections
        fileReader.close();
        fileWriter.close();
    }
}