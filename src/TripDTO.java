import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Set;


public class TripDTO {
    private String tripID;
    private String vanID;
    private Boolean cncFlag;
    private String derivedTripId;
    private String depotID;
    private String depotName;
    private String driver;
    private Date vanDepartTime;
    private Date vanReturnTime;
    private String cutOffType;
    private Date endDateTime;
    private String market;
    private String retailCategory;
    private boolean passiveCooled;
    private Collection<StopDTO> stops;
    private ODSTripHeaderDTO header;

    @Override
    public String toString() {
        return "TripDTO{" +
                "tripID='" + tripID + '\'' +
                ", vanID='" + vanID + '\'' +
                ", cncFlag=" + cncFlag +
                ", derivedTripId='" + derivedTripId + '\'' +
                ", depotID='" + depotID + '\'' +
                ", depotName='" + depotName + '\'' +
                ", driver='" + driver + '\'' +
                ", vanDepartTime=" + vanDepartTime +
                ", vanReturnTime=" + vanReturnTime +
                ", cutOffType='" + cutOffType + '\'' +
                ", endDateTime=" + endDateTime +
                ", market='" + market + '\'' +
                ", retailCategory='" + retailCategory + '\'' +
                ", passiveCooled=" + passiveCooled +
                ", stops=" + stops +
                ", header=" + header +
                '}';
    }

    public String getTripID() {
        return tripID;
    }

    public void setTripID(String tripID) {
        this.tripID = tripID;
    }

    public String getVanID() {
        return vanID;
    }

    public void setVanID(String vanID) {
        this.vanID = vanID;
    }

    public Boolean getCncFlag() {
        return cncFlag;
    }

    public void setCncFlag(Boolean cncFlag) {
        this.cncFlag = cncFlag;
    }

    public String getDerivedTripId() {
        return derivedTripId;
    }

    public void setDerivedTripId(String derivedTripId) {
        this.derivedTripId = derivedTripId;
    }

    public String getDepotID() {
        return depotID;
    }

    public void setDepotID(String depotID) {
        this.depotID = depotID;
    }

    public String getDepotName() {
        return depotName;
    }

    public void setDepotName(String depotName) {
        this.depotName = depotName;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public Date getVanDepartTime() {
        return vanDepartTime;
    }

    public void setVanDepartTime(Date vanDepartTime) {
        this.vanDepartTime = vanDepartTime;
    }

    public Date getVanReturnTime() {
        return vanReturnTime;
    }

    public void setVanReturnTime(Date vanReturnTime) {
        this.vanReturnTime = vanReturnTime;
    }

    public String getCutOffType() {
        return cutOffType;
    }

    public void setCutOffType(String cutOffType) {
        this.cutOffType = cutOffType;
    }

    public Date getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getRetailCategory() {
        return retailCategory;
    }

    public void setRetailCategory(String retailCategory) {
        this.retailCategory = retailCategory;
    }

    public boolean isPassiveCooled() {
        return passiveCooled;
    }

    public void setPassiveCooled(boolean passiveCooled) {
        this.passiveCooled = passiveCooled;
    }

    public Collection<StopDTO> getStops() {
        return stops;
    }

    public void setStops(Collection<StopDTO> stops) {
        this.stops = stops;
    }

    public ODSTripHeaderDTO getHeader() {
        return header;
    }

    public void setHeader(ODSTripHeaderDTO header) {
        this.header = header;
    }

    public static class StopDTO {
        private String stopID;
        private String tripId;
        private Date plannedDepartureTime;
        private String deliverysequencenum;
        private Date deliverySlotEndTime;
        private Date deliverySlotStartTime;
        private Date plannedArrivalTime;
        private String slotDuration;
        private String depotName;
        private String plannedDuration;
        private String breakLength;
        private Date vanReturnTime;
        private Date vanDepartTime;
        private String shiftId;
        private String vanId;
        private Set<DropDTO> drops;

        @Override
        public String toString() {
            return "StopDTO{" +
                    "stopID='" + stopID + '\'' +
                    ", tripId='" + tripId + '\'' +
                    ", plannedDepartureTime=" + plannedDepartureTime +
                    ", deliverysequencenum='" + deliverysequencenum + '\'' +
                    ", deliverySlotEndTime=" + deliverySlotEndTime +
                    ", deliverySlotStartTime=" + deliverySlotStartTime +
                    ", plannedArrivalTime=" + plannedArrivalTime +
                    ", slotDuration='" + slotDuration + '\'' +
                    ", depotName='" + depotName + '\'' +
                    ", plannedDuration='" + plannedDuration + '\'' +
                    ", breakLength='" + breakLength + '\'' +
                    ", vanReturnTime=" + vanReturnTime +
                    ", vanDepartTime=" + vanDepartTime +
                    ", shiftId='" + shiftId + '\'' +
                    ", vanId='" + vanId + '\'' +
                    ", drops=" + drops +
                    '}';
        }

        public String getStopID() {
            return stopID;
        }

        public void setStopID(String stopID) {
            this.stopID = stopID;
        }

        public String getTripId() {
            return tripId;
        }

        public void setTripId(String tripId) {
            this.tripId = tripId;
        }

        public Date getPlannedDepartureTime() {
            return plannedDepartureTime;
        }

        public void setPlannedDepartureTime(Date plannedDepartureTime) {
            this.plannedDepartureTime = plannedDepartureTime;
        }

        public String getDeliverysequencenum() {
            return deliverysequencenum;
        }

        public void setDeliverysequencenum(String deliverysequencenum) {
            this.deliverysequencenum = deliverysequencenum;
        }

        public Date getDeliverySlotEndTime() {
            return deliverySlotEndTime;
        }

        public void setDeliverySlotEndTime(Date deliverySlotEndTime) {
            this.deliverySlotEndTime = deliverySlotEndTime;
        }

        public Date getDeliverySlotStartTime() {
            return deliverySlotStartTime;
        }

        public void setDeliverySlotStartTime(Date deliverySlotStartTime) {
            this.deliverySlotStartTime = deliverySlotStartTime;
        }

        public Date getPlannedArrivalTime() {
            return plannedArrivalTime;
        }

        public void setPlannedArrivalTime(Date plannedArrivalTime) {
            this.plannedArrivalTime = plannedArrivalTime;
        }

        public String getSlotDuration() {
            return slotDuration;
        }

        public void setSlotDuration(String slotDuration) {
            this.slotDuration = slotDuration;
        }

        public String getDepotName() {
            return depotName;
        }

        public void setDepotName(String depotName) {
            this.depotName = depotName;
        }

        public String getPlannedDuration() {
            return plannedDuration;
        }

        public void setPlannedDuration(String plannedDuration) {
            this.plannedDuration = plannedDuration;
        }

        public String getBreakLength() {
            return breakLength;
        }

        public void setBreakLength(String breakLength) {
            this.breakLength = breakLength;
        }

        public Date getVanReturnTime() {
            return vanReturnTime;
        }

        public void setVanReturnTime(Date vanReturnTime) {
            this.vanReturnTime = vanReturnTime;
        }

        public Date getVanDepartTime() {
            return vanDepartTime;
        }

        public void setVanDepartTime(Date vanDepartTime) {
            this.vanDepartTime = vanDepartTime;
        }

        public String getShiftId() {
            return shiftId;
        }

        public void setShiftId(String shiftId) {
            this.shiftId = shiftId;
        }

        public String getVanId() {
            return vanId;
        }

        public void setVanId(String vanId) {
            this.vanId = vanId;
        }

        public Set<DropDTO> getDrops() {
            return drops;
        }

        public void setDrops(Set<DropDTO> drops) {
            this.drops = drops;
        }
    }


    public static class DropDTO {

        private String dropID;

        private String osn;

        private double dropWeight;

        private String type;

        private CustomerInfoDTO customerInfo;

        private String webOrderId;

        @Override
        public String toString() {
            return "DropDTO{" +
                    "dropID='" + dropID + '\'' +
                    ", osn='" + osn + '\'' +
                    ", dropWeight=" + dropWeight +
                    ", type='" + type + '\'' +
                    ", customerInfo=" + customerInfo +
                    ", webOrderId='" + webOrderId + '\'' +
                    '}';
        }

        public String getDropID() {
            return dropID;
        }

        public void setDropID(String dropID) {
            this.dropID = dropID;
        }

        public String getOsn() {
            return osn;
        }

        public void setOsn(String osn) {
            this.osn = osn;
        }

        public double getDropWeight() {
            return dropWeight;
        }

        public void setDropWeight(double dropWeight) {
            this.dropWeight = dropWeight;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public CustomerInfoDTO getCustomerInfo() {
            return customerInfo;
        }

        public void setCustomerInfo(CustomerInfoDTO customerInfo) {
            this.customerInfo = customerInfo;
        }

        public String getWebOrderId() {
            return webOrderId;
        }

        public void setWebOrderId(String webOrderId) {
            this.webOrderId = webOrderId;
        }
    }


    public static class CustomerInfoDTO {

        private Long ID;

        private String email;

        private String customerFax;

        private String title;

        private String firstName;

        private String lastName;

        @Override
        public String toString() {
            return "CustomerInfoDTO{" +
                    "ID=" + ID +
                    ", email='" + email + '\'' +
                    ", customerFax='" + customerFax + '\'' +
                    ", title='" + title + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }

        public Long getID() {
            return ID;
        }

        public void setID(Long ID) {
            this.ID = ID;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getCustomerFax() {
            return customerFax;
        }

        public void setCustomerFax(String customerFax) {
            this.customerFax = customerFax;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }


    public static class ODSTripHeaderDTO {

        private String storeNumber;

        private String storeName;

        private String vanId;

        private int totalTrips;

        private int tripNumber;

        private String tripWeight;

        private Integer[] loadNumber;

        private int numberOfOrders;

        private String[] osnRange = new String[2];

        private boolean hasRemoteOrders;

        private Date departureDateTime;

        private Date returnDatetime;

        private String headerText;

        private Integer awaitingFinalDrops;

        private String shiftTemplateName;

        @Override
        public String toString() {
            return "ODSTripHeaderDTO{" +
                    "storeNumber='" + storeNumber + '\'' +
                    ", storeName='" + storeName + '\'' +
                    ", vanId='" + vanId + '\'' +
                    ", totalTrips=" + totalTrips +
                    ", tripNumber=" + tripNumber +
                    ", tripWeight='" + tripWeight + '\'' +
                    ", loadNumber=" + Arrays.toString(loadNumber) +
                    ", numberOfOrders=" + numberOfOrders +
                    ", osnRange=" + Arrays.toString(osnRange) +
                    ", hasRemoteOrders=" + hasRemoteOrders +
                    ", departureDateTime=" + departureDateTime +
                    ", returnDatetime=" + returnDatetime +
                    ", headerText='" + headerText + '\'' +
                    ", awaitingFinalDrops=" + awaitingFinalDrops +
                    ", shiftTemplateName='" + shiftTemplateName + '\'' +
                    '}';
        }

        public String getStoreNumber() {
            return storeNumber;
        }

        public void setStoreNumber(String storeNumber) {
            this.storeNumber = storeNumber;
        }

        public String getStoreName() {
            return storeName;
        }

        public void setStoreName(String storeName) {
            this.storeName = storeName;
        }

        public String getVanId() {
            return vanId;
        }

        public void setVanId(String vanId) {
            this.vanId = vanId;
        }

        public int getTotalTrips() {
            return totalTrips;
        }

        public void setTotalTrips(int totalTrips) {
            this.totalTrips = totalTrips;
        }

        public int getTripNumber() {
            return tripNumber;
        }

        public void setTripNumber(int tripNumber) {
            this.tripNumber = tripNumber;
        }

        public String getTripWeight() {
            return tripWeight;
        }

        public void setTripWeight(String tripWeight) {
            this.tripWeight = tripWeight;
        }

        public Integer[] getLoadNumber() {
            return loadNumber;
        }

        public void setLoadNumber(Integer[] loadNumber) {
            this.loadNumber = loadNumber;
        }

        public int getNumberOfOrders() {
            return numberOfOrders;
        }

        public void setNumberOfOrders(int numberOfOrders) {
            this.numberOfOrders = numberOfOrders;
        }

        public String[] getOsnRange() {
            return osnRange;
        }

        public void setOsnRange(String[] osnRange) {
            this.osnRange = osnRange;
        }

        public boolean isHasRemoteOrders() {
            return hasRemoteOrders;
        }

        public void setHasRemoteOrders(boolean hasRemoteOrders) {
            this.hasRemoteOrders = hasRemoteOrders;
        }

        public Date getDepartureDateTime() {
            return departureDateTime;
        }

        public void setDepartureDateTime(Date departureDateTime) {
            this.departureDateTime = departureDateTime;
        }

        public Date getReturnDatetime() {
            return returnDatetime;
        }

        public void setReturnDatetime(Date returnDatetime) {
            this.returnDatetime = returnDatetime;
        }

        public String getHeaderText() {
            return headerText;
        }

        public void setHeaderText(String headerText) {
            this.headerText = headerText;
        }

        public Integer getAwaitingFinalDrops() {
            return awaitingFinalDrops;
        }

        public void setAwaitingFinalDrops(Integer awaitingFinalDrops) {
            this.awaitingFinalDrops = awaitingFinalDrops;
        }

        public String getShiftTemplateName() {
            return shiftTemplateName;
        }

        public void setShiftTemplateName(String shiftTemplateName) {
            this.shiftTemplateName = shiftTemplateName;
        }
    }
}