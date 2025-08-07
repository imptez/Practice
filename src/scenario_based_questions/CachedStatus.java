package scenario_based_questions;

public class CachedStatus {

    String status;

    long lastCheckedTime;

    public CachedStatus(String status, long lastCheckedTime) {
        this.status = status;
        this.lastCheckedTime = lastCheckedTime;
    }

    boolean isFinalStatus() {
        return status.equals("SUCCESS") || status.equals("FAILED");
    }

     boolean isCacheExpired(){
        return System.currentTimeMillis() - lastCheckedTime >3000;
    }

}
