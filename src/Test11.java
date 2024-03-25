import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test11 {

    static Map<BigDecimal, SDRSItemConfig> sdrsItemConfigMap;

    public static void main(String[] args) throws Exception {
        String config = "[{\"upc\":\"224780000402\", \"price\":\"0.40\",\"win\":\"6913749\"}," +
                "{\"upc\":\"224780000403\", \"price\":\"0.30\",\"win\":\"6913750\"}," +
                "{\"upc\":\"224780000401\", \"price\":\"0.20\",\"win\":\"6913748\"}]";

      sdrsItemConfigMap = Stream.of(Objects.requireNonNull(ODSJsonUtil.convertJsonInObject(config, SDRSItemConfig[].class)))
                .collect(
                        Collectors.toMap(
                                SDRSItemConfig::getPrice, Function.identity()));
        Test11.sdrsItemConfigMap.forEach((s, storeDataDto) -> System.out.println("Key: " + s + " Value: " + storeDataDto.toString()));

    }


    public static class SDRSItemConfig {
        String upc;
        BigDecimal price;
        String win;

        public String getUpc() {
            return upc;
        }

        public void setUpc(String upc) {
            this.upc = upc;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        public String getWin() {
            return win;
        }

        public void setWin(String win) {
            this.win = win;
        }

        @Override
        public String toString() {
            return "SDRSItemConfig{" +
                    "upc='" + upc + '\'' +
                    ", price=" + price +
                    ", win='" + win + '\'' +
                    '}';
        }
    }
}
