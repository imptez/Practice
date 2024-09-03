package walmart;

public class CardData  {
    private String piHash;

    private String nameOnTheCard;

    private String last4Digits;

    private String expiryDate;

    public CardData(String piHash, String nameOnTheCard, String last4Digits, String expiryDate) {
        this.piHash = piHash;
        this.nameOnTheCard = nameOnTheCard;
        this.last4Digits = last4Digits;
        this.expiryDate = expiryDate;
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

    public String getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "walmart.CardData{" +
                "piHash='" + piHash + '\'' +
                ", nameOnTheCard='" + nameOnTheCard + '\'' +
                ", last4Digits='" + last4Digits + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }
}
