import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Test12 {


    public static void main(String[] args) throws Exception {
        TripDTO tripDTO = getTripDTO();
        String tripJson = ODSJsonUtil.convertObjectInJson(tripDTO);
        System.out.println(tripJson);
    }

    public static TripDTO getTripDTO() {
        TripDTO tripDTO = new TripDTO();
        tripDTO.setTripID("0f14d0ab-9605-4a62-a9e4-5ed26688389b");
        tripDTO.setVanID("van-number-12123");
        tripDTO.setCncFlag(true);
        tripDTO.setDerivedTripId("1232736");
        tripDTO.setDepotID("depotId1");
        tripDTO.setDepotName("Depot-Name");
        tripDTO.setDriver("Driver Andy");
        tripDTO.setVanDepartTime(new Date());
        tripDTO.setVanReturnTime(new Date());
        tripDTO.setCutOffType("A");
        tripDTO.setEndDateTime(new Date());
        tripDTO.setMarket("UK");
        tripDTO.setRetailCategory("GR");
        tripDTO.setVanID("172661527651327635");
        tripDTO.setStops(getStopDTOCollection());
        tripDTO.setHeader(getTripHeader());
        tripDTO.setPassiveCooled(true);
        return tripDTO;
    }

    public static Collection<TripDTO.StopDTO> getStopDTOCollection() {
        Collection<TripDTO.StopDTO> collection = new ArrayList<>();
        collection.add(getStopDTO());
        return collection;
    }

    public static TripDTO.StopDTO getStopDTO() {
        TripDTO.StopDTO stop = new TripDTO.StopDTO();
        stop.setStopID("12hdweq12");
        stop.setTripId("0f14d0ab-9605-4a62-a9e4-5ed26688389b");
        stop.setPlannedDepartureTime(new Date());
        stop.setDeliverysequencenum("1");
        stop.setDeliverySlotEndTime(new Date());
        stop.setDeliverySlotStartTime(new Date());
        stop.setPlannedArrivalTime(new Date());
        stop.setSlotDuration("20");
        stop.setDepotName("depot");
        stop.setPlannedDuration("0001H0M0S");
        stop.setBreakLength("10");
        stop.setVanReturnTime(new Date());
        stop.setVanDepartTime(new Date());
        stop.setShiftId("23762357236572635");
        stop.setVanId("VAN11");
        stop.setDrops(getDropCollection());
        return stop;
    }

    public static Set<TripDTO.DropDTO> getDropCollection() {
        Set<TripDTO.DropDTO> drops = new HashSet<>();
        drops.add(getDropDTO());
        return drops;
    }

    public static TripDTO.DropDTO getDropDTO() {
        TripDTO.DropDTO dropDTO = new TripDTO.DropDTO();
        dropDTO.setDropID("first-drop-if");
        dropDTO.setDropWeight(1.00);
        dropDTO.setWebOrderId("1212312323");
        dropDTO.setOsn("12");
        dropDTO.setType("HD");
        dropDTO.setCustomerInfo(getCustomerInfo());
        return dropDTO;
    }

    public static TripDTO.CustomerInfoDTO getCustomerInfo() {
        TripDTO.CustomerInfoDTO info = new TripDTO.CustomerInfoDTO();
        info.setEmail("popoye@gnail.com");
        return info;
    }


    public static TripDTO.ODSTripHeaderDTO getTripHeader() {
        TripDTO.ODSTripHeaderDTO headerDTO = new TripDTO.ODSTripHeaderDTO();
        headerDTO.setStoreName("4012");
        headerDTO.setStoreName("Amity");
        headerDTO.setHeaderText("header text");
        headerDTO.setNumberOfOrders(1);
        String[] osnRange = {"1", "20"};
        headerDTO.setOsnRange(osnRange);
        headerDTO.setTotalTrips(1);
        headerDTO.setTripNumber(1);
        return headerDTO;
    }
}
