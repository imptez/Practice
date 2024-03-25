package walmart;

import java.util.List;

public class BatchExecutionDocument {

    private String batchName;

    private String profileId;

    private String migrationStatus;

    private List<CardData> cards;

    public BatchExecutionDocument(String batchName, String profileId, String migrationStatus, List<CardData> cards) {
        this.batchName = batchName;
        this.profileId = profileId;
        this.migrationStatus = migrationStatus;
        this.cards = cards;
    }

    public String getBatchName() {
        return batchName;
    }

    public String getProfileId() {
        return profileId;
    }

    public String getMigrationStatus() {
        return migrationStatus;
    }

    public List<CardData> getCards() {
        return cards;
    }

    @Override
    public String toString() {
        return "walmart.BatchExecutionDocument{" +
                "batchName='" + batchName + '\'' +
                ", profileId='" + profileId + '\'' +
                ", migrationStatus='" + migrationStatus + '\'' +
                ", cards=" + cards +
                '}';
    }
}
