package Job;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatConverter {
    public static void main(String[] args) {
        // Input date string in any format
       String inputDate = "2024-03-05T00:34:45.582+00:00"; // Example date
        //String inputDate = "2025-02-28";

        // Define the input format (format of the input date string)
        DateTimeFormatter inputFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

        //DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Parse the input date string into a LocalDate object
        LocalDateTime dateTime = LocalDateTime.parse(inputDate, inputFormatter);

        System.out.println("Input Date: " + dateTime);


        // Define the output format (format to which you want to convert)
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");

        // Format the LocalDate object into the desired output format
        String outputDate = dateTime.format(outputFormatter);

        // Print the converted date
        System.out.println("Converted Date: " + outputDate);
    }


}

