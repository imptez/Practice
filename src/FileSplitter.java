import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileSplitter {

    public static void main(String[] args) {
        String inputFile = "C:\\Users\\vn537tm\\Downloads\\client-1.1.0_encoded.txt";   // Path of the input file
        String outputFile1 = "C:\\Users\\vn537tm\\Downloads\\client-1.1.0_encoded_Part_1.txt";  // First output file
        String outputFile2 = "C:\\Users\\vn537tm\\Downloads\\client-1.1.0_encoded_Part_2.txt";  // Second output file

        try {
            // Read the content of the input file as a single string
            String content = new String(Files.readAllBytes(Paths.get(inputFile)));

            // Find the middle point to divide the content
            int mid = content.length() / 2;

            // Split the content into two parts
            String part1 = content.substring(0, mid);
            String part2 = content.substring(mid);

            // Write the first part to the first output file
            writeToFile(outputFile1, part1);

            // Write the second part to the second output file
            writeToFile(outputFile2, part2);

            System.out.println("File has been successfully split into two files.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading/writing the files.");
            e.printStackTrace();
        }
    }

    // Method to write content to a file
    private static void writeToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file: " + fileName);
            e.printStackTrace();
        }
    }
}
