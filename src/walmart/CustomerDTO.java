package walmart;

import java.util.List;


class CustomerDTO {

    private int customerId;
    private List<CardDetails> cardDetailsList;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public List<CardDetails> getCardDetailsList() {
        return cardDetailsList;
    }

    public void setCardDetailsList(List<CardDetails> cardDetailsList) {
        this.cardDetailsList = cardDetailsList;
    }

    public void filterFailedCards(){
        this.cardDetailsList.removeIf(cardDetails -> !"failure".equalsIgnoreCase(cardDetails.getStatus()));
    }












    static class CardDetails {
        private String cardNumber;
        private String status;

        public CardDetails(String cardNumber, String status) {
            this.cardNumber = cardNumber;
            this.status = status;
        }

        public String getCardNumber() {
            return cardNumber;
        }

        public void setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "CardDetails{" +
                    "cardNumber='" + cardNumber + '\'' +
                    ", status='" + status + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "customerId=" + customerId +
                ", cardDetailsList=" + cardDetailsList +
                '}';
    }
}