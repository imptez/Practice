package walmart;

public class CardData  {
    private String piHash;

    private String cardBrand;

    private String last4Digits;

    private String expiryDate;

    public CardData(String piHash, String cardBrand, String last4Digits, String expiryDate) {
        this.piHash = piHash;
        this.cardBrand = cardBrand;
        this.last4Digits = last4Digits;
        this.expiryDate = expiryDate;
    }

    public String getPiHash() {
        return piHash;
    }

    public String getCardBrand() {
        return cardBrand;
    }

    public String getLast4Digits() {
        return last4Digits;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "walmart.CardData{" +
                "piHash='" + piHash + '\'' +
                ", cardBrand='" + cardBrand + '\'' +
                ", last4Digits='" + last4Digits + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }
}
