import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import walmart.BatchExecutionDocument;
import walmart.CardData;

public class Test20 {

    public static void main(String[] args) throws ParseException {

// Given Date
        String date = "2024-01-01 00:00:00.0";
        // Function Call
        getExpiryDate(date);

    }

    public static void  getExpiryDate(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
        try {
            Date formattedDate = dateFormat.parse(date);
            String newDateStr = new SimpleDateFormat("yyyy-MM-dd").format(formattedDate);
            // Get an instance of LocalTime
            // from date
            LocalDate currentDate
                    = LocalDate.parse(newDateStr);

            // Get day from date
            String year =  String.valueOf(currentDate.getYear());

            // Get month from date
            String month = String.valueOf(currentDate.getMonthValue());

            StringBuilder sb=new StringBuilder();
            sb.append(year.substring(Math.max(year.length() - 2, 0))).append(month.length()>1?month:"0"+month);
            // Print the day, month, and year
            System.out.println("expiryDate " + sb);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static List<CardData> buildCardData(List<BatchExecutionDocument> batchExecutionDocuments) {
        List<CardData> cardDataList = new ArrayList<>();
        batchExecutionDocuments.forEach(batchExecutionDocument -> cardDataList.addAll(batchExecutionDocument.getCards()));
        return cardDataList;
    }

    private static void cardData(){
        CardData cardData1= new CardData("PIH.volt.VISA.CREDITCARD.5617910640286872.9130", "Visa", "1000", "0628");
        CardData cardData2= new CardData("PIH.volt.VISA.CREDITCARD.5617910640286872.9131", "Visa", "1000", "0628");
        List<CardData> cardDataList1 = Arrays.asList(cardData1,cardData2);
        BatchExecutionDocument batchExecutionDocument1 =
                new BatchExecutionDocument("InputRetoken","4567896546782","RETOKENISER_STEP_FAILURE",cardDataList1);

        CardData cardData11= new CardData("PIH.volt.VISA.CREDITCARD.5617910640286872.9132", "Visa", "1000", "0628");
        CardData cardData22= new CardData("PIH.volt.VISA.CREDITCARD.5617910640286872.9133", "Visa", "1000", "0628");
        List<CardData> cardDataList2 = Arrays.asList(cardData1,cardData2);
        BatchExecutionDocument batchExecutionDocument2 =
                new BatchExecutionDocument("InputRetoken","4567896546782","RETOKENISER_STEP_FAILURE",cardDataList2);
        List<BatchExecutionDocument> batchExecutionDocuments = Arrays.asList(batchExecutionDocument1,batchExecutionDocument2);

        Optional<List<CardData>> cardData = batchExecutionDocuments.stream()
                .collect(Collectors.groupingBy(BatchExecutionDocument::getProfileId))
                .values()
                .stream()
                .map(Test20::buildCardData)
                .findFirst();
        cardData.map(cardData3 -> cardData3);
    }


}
