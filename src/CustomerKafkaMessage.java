import java.util.List;
import lombok.Builder;
import lombok.Data;


public class CustomerKafkaMessage {

    String customerId;
    List<Card> cards;

    public CustomerKafkaMessage(String customerId, List<Card> cards) {
        this.customerId = customerId;
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "CustomerKafkaMessage{" +
                "customerId='" + customerId + '\'' +
                ", cards=" + cards +
                '}';
    }

    public static class Card{
        private String piHash;

        private String cardBrand;

        private String last4Digits;

        public Card(String piHash, String cardBrand, String last4Digits) {
            this.piHash = piHash;
            this.cardBrand = cardBrand;
            this.last4Digits = last4Digits;
        }

        @Override
        public String toString() {
            return "Card{" +
                    "piHash='" + piHash + '\'' +
                    ", cardBrand='" + cardBrand + '\'' +
                    ", last4Digits='" + last4Digits + '\'' +
                    '}';
        }
    }
}
