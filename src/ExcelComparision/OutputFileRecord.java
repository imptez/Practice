package ExcelComparision;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;


public class OutputFileRecord {

    @CsvBindByName(column = "ID", required = false)
    @CsvBindByPosition(position = 0)
    private String id;

    @CsvBindByName(column = "ACCOUNT_ID_FK", required = true)
    @CsvBindByPosition(position = 1)
    private String customerId;

    @CsvBindByName(column = "ADDRESS_ID_FK", required = false)
    @CsvBindByPosition(position = 2)
    private String addressIdFK;

    @CsvBindByName(column = "CARD_BRAND", required = false)
    @CsvBindByPosition(position = 3)
    private String cardBrand;

    @CsvBindByName(column = "LAST_DIGITS", required = false)
    @CsvBindByPosition(position = 4)
    private String lastDigits;

    @CsvBindByName(column = "EXPIRY_DATE", required = false)
    @CsvBindByPosition(position = 5)
    private String expiryDate;

    @CsvBindByName(column = " NAME_ON_CARD ", required = false)
    @CsvBindByPosition(position = 6)
    private String nameOnCard;

    @CsvBindByName(column = "ISSUING_BANK", required = false)
    @CsvBindByPosition(position = 7)
    private String issuingBank;

    @CsvBindByName(column = "CARD_TYPE", required = false)
    @CsvBindByPosition(position = 8)
    private String cardType;

    @CsvBindByName(column = "PAYMENT_GATEWAY_VERSION", required = false)
    @CsvBindByPosition(position = 9)
    private String paymentGatewayVersion;

    @CsvBindByName(column = "CREATED_AT", required = false)
    @CsvBindByPosition(position = 10)
    private String createdAt;

    @CsvBindByName(column = "MODIFIED_AT", required = false)
    @CsvBindByPosition(position = 11)
    private String modifiedAt;

    @CsvBindByName(column = "LAST_UPDATED_BY", required = false)
    @CsvBindByPosition(position = 12)
    private String lastUpdatedBy;

    @CsvBindByName(column = "IS_DEFAULT", required = false)
    @CsvBindByPosition(position = 13)
    private String isDefault;

    @CsvBindByName(column = "BANNER", required = false)
    @CsvBindByPosition(position = 14)
    private String banner;

    @CsvBindByName(column = "ALIAS", required = false)
    @CsvBindByPosition(position = 15)
    private String alias;

    @CsvBindByName(column = "REFERENCE_ID", required = false)
    @CsvBindByPosition(position = 16)
    private String referenceId;

    @CsvBindByName(column = "IS_DELETED", required = false)
    @CsvBindByPosition(position = 17)
    private String isDeleted;

    @CsvBindByName(column = "VERSION", required = false)
    @CsvBindByPosition(position = 18)
    private String version;

    @CsvBindByName(column = "REWARDS_CARD", required = false)
    @CsvBindByPosition(position = 19)
    private String rewardsCard;

    @CsvBindByName(column = "FRAUD_CHECK_TOKEN", required = false)
    @CsvBindByPosition(position = 20)
    private String fraudCheckToken;

    @CsvBindByName(column = "BANK_CODE", required = false)
    @CsvBindByPosition(position = 21)
    private String bankCode;

    @CsvBindByName(column = "ALLOW_PAYOUT", required = false)
    @CsvBindByPosition(position = 22)
    private String allowPayout;

    @CsvBindByName(column = "ALLOW_CHARGE", required = false)
    @CsvBindByPosition(position = 23)
    private String allowCharge;

    @CsvBindByName(column = "ORG_TXN_ID", required = false)
    @CsvBindByPosition(position = 24)
    private String orgTxnId;

    @CsvBindByName(column = "LAST_TXN_ID_UPDATE_AT", required = false)
    @CsvBindByPosition(position = 25)
    private String lastTxnToUpdateAt;

    @CsvBindByName(column = "IS_USED", required = false)
    @CsvBindByPosition(position = 26)
    private String isUsed;

    @CsvBindByName(column = "NICK_NAME", required = false)
    @CsvBindByPosition(position = 27)
    private String nickName;

    @CsvBindByName(column = "Worldline Token", required = false)
    @CsvBindByPosition(position = 28)
    private String worldlineToken;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAddressIdFK() {
        return addressIdFK;
    }

    public void setAddressIdFK(String addressIdFK) {
        this.addressIdFK = addressIdFK;
    }

    public String getCardBrand() {
        return cardBrand;
    }

    public void setCardBrand(String cardBrand) {
        this.cardBrand = cardBrand;
    }

    public String getLastDigits() {
        return lastDigits;
    }

    public void setLastDigits(String lastDigits) {
        this.lastDigits = lastDigits;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public String getIssuingBank() {
        return issuingBank;
    }

    public void setIssuingBank(String issuingBank) {
        this.issuingBank = issuingBank;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getPaymentGatewayVersion() {
        return paymentGatewayVersion;
    }

    public void setPaymentGatewayVersion(String paymentGatewayVersion) {
        this.paymentGatewayVersion = paymentGatewayVersion;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getRewardsCard() {
        return rewardsCard;
    }

    public void setRewardsCard(String rewardsCard) {
        this.rewardsCard = rewardsCard;
    }

    public String getFraudCheckToken() {
        return fraudCheckToken;
    }

    public void setFraudCheckToken(String fraudCheckToken) {
        this.fraudCheckToken = fraudCheckToken;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getAllowPayout() {
        return allowPayout;
    }

    public void setAllowPayout(String allowPayout) {
        this.allowPayout = allowPayout;
    }

    public String getAllowCharge() {
        return allowCharge;
    }

    public void setAllowCharge(String allowCharge) {
        this.allowCharge = allowCharge;
    }

    public String getOrgTxnId() {
        return orgTxnId;
    }

    public void setOrgTxnId(String orgTxnId) {
        this.orgTxnId = orgTxnId;
    }

    public String getLastTxnToUpdateAt() {
        return lastTxnToUpdateAt;
    }

    public void setLastTxnToUpdateAt(String lastTxnToUpdateAt) {
        this.lastTxnToUpdateAt = lastTxnToUpdateAt;
    }

    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getWorldlineToken() {
        return worldlineToken;
    }

    public void setWorldlineToken(String worldlineToken) {
        this.worldlineToken = worldlineToken;
    }

    @Override
    public String toString() {
        return "OutputFileRecord{" +
                "id='" + id + '\'' +
                ", customerId='" + customerId + '\'' +
                ", addressIdFK='" + addressIdFK + '\'' +
                ", cardBrand='" + cardBrand + '\'' +
                ", lastDigits='" + lastDigits + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", nameOnCard='" + nameOnCard + '\'' +
                ", issuingBank='" + issuingBank + '\'' +
                ", cardType='" + cardType + '\'' +
                ", paymentGatewayVersion='" + paymentGatewayVersion + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", modifiedAt='" + modifiedAt + '\'' +
                ", lastUpdatedBy='" + lastUpdatedBy + '\'' +
                ", isDefault='" + isDefault + '\'' +
                ", banner='" + banner + '\'' +
                ", alias='" + alias + '\'' +
                ", referenceId='" + referenceId + '\'' +
                ", isDeleted='" + isDeleted + '\'' +
                ", version='" + version + '\'' +
                ", rewardsCard='" + rewardsCard + '\'' +
                ", fraudCheckToken='" + fraudCheckToken + '\'' +
                ", bankCode='" + bankCode + '\'' +
                ", allowPayout='" + allowPayout + '\'' +
                ", allowCharge='" + allowCharge + '\'' +
                ", orgTxnId='" + orgTxnId + '\'' +
                ", lastTxnToUpdateAt='" + lastTxnToUpdateAt + '\'' +
                ", isUsed='" + isUsed + '\'' +
                ", nickName='" + nickName + '\'' +
                ", worldlineToken='" + worldlineToken + '\'' +
                '}';
    }
}

