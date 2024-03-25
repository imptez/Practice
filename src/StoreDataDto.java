public class StoreDataDto {
    private String storeId;
    private String storeName;
    private String storeType;
    private Boolean activeStore;

    public StoreDataDto(String storeId, String storeName, String storeType, Boolean activeStore) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.storeType = storeType;
        this.activeStore = activeStore;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    public Boolean isActiveStore() {
        return activeStore;
    }

    public void setActiveStore(Boolean activeStore) {
        this.activeStore = activeStore;
    }

    @Override
    public String toString() {
        return "StoreDataDto{" +
                "storeId='" + storeId + '\'' +
                ", storeName='" + storeName + '\'' +
                ", storeType='" + storeType + '\'' +
                ", activeStore=" + activeStore +
                '}';
    }
}

