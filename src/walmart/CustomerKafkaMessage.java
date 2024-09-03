package walmart;

import java.util.List;


public class CustomerKafkaMessage {

    String customerId;
    List<Card> cards;

    public CustomerKafkaMessage(String customerId, List<Card> cards) {
        this.customerId = customerId;
        this.cards = cards;
    }

    public String getCustomerId() {
        return customerId;
    }

    public List<Card> getCards() {
        return cards;
    }

    @Override
    public String toString() {
        return "walmart.CustomerKafkaMessage{" +
                "customerId='" + customerId + '\'' +
                ", cards=" + cards +
                '}';
    }

    public static class Card{
        private String piHash;

        private String nameOnTheCard;

        private String last4Digits;

        private String expiryDate;

        public Card(String piHash, String nameOnTheCard, String last4Digits , String expiryDate) {
            this.piHash = piHash;
            this.nameOnTheCard = nameOnTheCard;
            this.last4Digits = last4Digits;
            this.expiryDate = expiryDate;
        }

        public String getExpiryDate() {
            return expiryDate;
        }

        public String getPiHash() {
            return piHash;
        }

        public String getNameOnTheCard() {
            return nameOnTheCard;
        }

        public String getLast4Digits() {
            return last4Digits;
        }

        @Override
        public String toString() {
            return "Card{" +
                    "piHash='" + piHash + '\'' +
                    ", nameOnTheCard='" + nameOnTheCard + '\'' +
                    ", last4Digits='" + last4Digits + '\'' +
                    '}';
        }
    }
}
