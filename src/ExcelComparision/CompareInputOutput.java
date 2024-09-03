package ExcelComparision;

import com.opencsv.bean.CsvToBeanBuilder;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class CompareInputOutput {


    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(CompareInputOutput.class.getName());
        String inputFilePath = "C:\\Users\\vn537tm\\Desktop\\ASDA_PAYMENTS\\Payments_Data_BATCH\\PAYMENT_INFO_A3_100.csv";
        String outputFilePath = "C:\\Users\\vn537tm\\Desktop\\ASDA_PAYMENTS\\Payments_Data_BATCH\\PAYMENT_INFO_A3_100_output.csv";

        try {
            CsvToBeanBuilder<InputFileRecord> inputBeanBuilder = new CsvToBeanBuilder<>(readAndPrintFileD(inputFilePath));
            final List<InputFileRecord> inputFeedRecords = inputBeanBuilder
                    .withType(InputFileRecord.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build().parse();

            CsvToBeanBuilder<OutputFileRecord> outputBeanBuilder = new CsvToBeanBuilder<>(readAndPrintFileD(inputFilePath));
            final List<OutputFileRecord> outputFeedRecords = outputBeanBuilder
                    .withType(OutputFileRecord.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build().parse();

            List<InputFileRecord> records = inputFeedRecords.stream()
                    .filter(manager -> outputFeedRecords.stream()
                            .noneMatch(account -> Objects.equals(account.getCustomerId(), manager.getCustomerId())))
                    .collect(Collectors.toList());
            records.forEach(System.out::println);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to read  file: {0}", e.getMessage());
            return;
        }

    }

    /**
     * Reads the lines from a file and prints the second line.
     *
     * @param filePath The path to the file.
     * @throws IOException If an I/O error occurs.
     */
    public static List<String> readAndPrintFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        List<String> lines = new ArrayList<>();
        String line = null;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }

        reader.close();
        return lines.subList(1,2 );
    }

    public static InputStreamReader readAndPrintFileD(String filePath) throws IOException {
        return new InputStreamReader(new FileInputStream(filePath));
    }
}

