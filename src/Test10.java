import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Test10 {

    public static void main(String[] args) {

        String storeNames = "[" +
                "{\"storeId\":\"M25\", \"storeName\":\"Makro Germiston\",\"storeType\":\"store\",\"activeStore\":\"true\"}," +
                "{\"storeId\":\"M26\", \"storeName\":\"Makro Germiston\",\"storeType\":\"store\",\"activeStore\":\"true\"}," +
                "{\"storeId\":\"M27\", \"storeName\":\"Makro Germiston\",\"storeType\":\"store\",\"activeStore\":\"true\"}," +
                "{\"storeId\":\"M28\", \"storeName\":\"Makro Germiston Liquor\",\"storeType\":\"DC\"}" +
                "]";


        List<StoreDataDto> storeValuesList = new ArrayList<>();
                //Arrays.asList(Objects.requireNonNull(JsonUtils.toObject(storeNames, StoreDataDto[].class)));
        Map<String, StoreDataDto> collect = storeValuesList.stream().collect(Collectors.toMap(StoreDataDto::getStoreId, value -> value));
        //  collect.forEach((s, storeDataDto) -> System.out.println("Key: " + s + " Value: " + storeDataDto.toString()));

        List<StoreDataDto> storeDataDtoList = storeValuesList.stream()
                .filter(storeDataDto -> Objects.nonNull(storeDataDto.isActiveStore()) && storeDataDto.isActiveStore())
                .collect(Collectors.toList());


        StoreDataDto storeDataDto = new StoreDataDto("M26", "Makro Germiston Liquor", "DC", null);

        if(Objects.nonNull(storeDataDto.isActiveStore()) && storeDataDto.isActiveStore()){
            System.out.println("this is interesting ");
        }else{
            System.out.println("this is not interesting  ");
        }
    }


}
