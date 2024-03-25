import com.opencsv.bean.CsvToBeanBuilder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test17 {

    public static void main(String[] args) throws FileNotFoundException {

        String batchName="PAYMENT_INFO_3";
        FileInputStream file =
                new FileInputStream("C:\\Users\\vn537tm\\Desktop\\ASDA_PAYMENTS\\Payments_Data\\"+ batchName + ".csv");
      //  CsvToBeanBuilder<InputFileRecord> beanBuilder =
        //        new CsvToBeanBuilder<>(new InputStreamReader(file));

        final List<InputFileRecord> inputFeedRecords = new ArrayList<>();
        inputFeedRecords.add(new InputFileRecord("0000016b-cc3b-40d1-a5e1-4c2c3fb07a86",
                "784e5bae-a4e0-406d-a7b9-cbd9f3fd8834",
                "Visa",
                "4033",
                "PIH.volt.VISA.CREDITCARD.4658588653304056.4033"));
        inputFeedRecords.add(new InputFileRecord("0000016b-cc3b-40d1-a5e1-4c2c3fb07a87",
                "784e5bae-a4e0-406d-a7b9-cbd9f3fd8834",
                "Visa",
                "4055",
                "PIH.volt.VISA.CREDITCARD.4658588653304056.4055"));
        inputFeedRecords.add(new InputFileRecord("0000016b-cc3b-40d1-a5e1-4c2c3fb07a88",
                "784e5bae-a4e0-406d-a7b9-cbd9f3fd8834",
                "Visa",
                "4066",
                "PIH.volt.VISA.CREDITCARD.4658588653304056.4066"));
        inputFeedRecords.add(new InputFileRecord("0000016b-cc3b-40d1-a5e1-4c2c3fb07a89",
                "784e5bae-a4e0-406d-a7b9-cbd9f3fd8834",
                "MasterCard",
                "4099",
                "PIH.volt.VISA.CREDITCARD.4658588653304056.4099"));
        inputFeedRecords.add(new InputFileRecord("0000016b-cc3b-40d1-a5e1-4c2c3fb07a90",
                "784e5bae-a4e0-406d-a7b9-cbd9f3fd8835",
                "Visa",
                "4088",
                "PIH.volt.VISA.CREDITCARD.4658588653304056.4088"));
        Map<String, List<InputFileRecord>> inputFeedRecordsMap = inputFeedRecords.stream()
                .collect(Collectors.groupingBy(InputFileRecord::getCustomerId));
        List<CustomerKafkaMessage> customerKafkaMessages = buildCustomerKafkaMessage(inputFeedRecordsMap);
        customerKafkaMessages.forEach(System.out::println);
    }


    public static List<CustomerKafkaMessage> buildCustomerKafkaMessage
            (Map<String, List<InputFileRecord>> inputFeedRecordsMap) {
        List<CustomerKafkaMessage> customerKafkaMessages = new ArrayList<>();
        for (String customerId : inputFeedRecordsMap.keySet()) {
            customerKafkaMessages.add( new CustomerKafkaMessage(customerId,
                    buildCardData(inputFeedRecordsMap.get(customerId))));
        }
        return customerKafkaMessages;
    }

    private static List<CustomerKafkaMessage.Card> buildCardData(List<InputFileRecord> inputFileRecords) {
        List<CustomerKafkaMessage.Card> cards= new ArrayList<>();
        inputFileRecords.forEach(inputFileRecord -> cards.add(new CustomerKafkaMessage.Card(inputFileRecord.getCardBrand(),
                inputFileRecord.getLastDigits(),
                inputFileRecord.getPaymentToken())));
        return cards;
    }
}
