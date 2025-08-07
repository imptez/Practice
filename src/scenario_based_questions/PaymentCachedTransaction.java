package scenario_based_questions;

import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class PaymentCachedTransaction {
    static Map<String, CachedStatus> cache = new ConcurrentHashMap<>();


    public static void main(String[] args) {
        buildCache();
        cache.forEach((s, cachedStatus) ->  System.out.println("The TX ID is "+s+" and status is " + getTransactionStatus(s)));
    }

    private static void buildCache() {
        for (int i = 0; i < 10; i++) {
          //  try {
                getTransactionStatus("TX00" + i);
               // Thread.sleep(1000);
          //  } catch (InterruptedException e) {
           //     throw new RuntimeException(e);}
            }
        }



    public static String getTransactionStatus(String txId) {

        CachedStatus cachedStatus = cache.get(txId);

        if (Objects.isNull(cachedStatus) || (!cachedStatus.isFinalStatus() && cachedStatus.isCacheExpired())) {
            String newStatus = new PaymentApi().fetchTransactionStatus(txId);
            cache.put(txId, new CachedStatus(newStatus, System.currentTimeMillis()));
        } else {
            return cachedStatus.status;
        }
        return null;
    }


    private static class PaymentApi {

        public String fetchTransactionStatus(String txId) {
            Random random = new Random();
            if (random.nextBoolean()) {
                return random.nextInt(10) % 2 == 0 ? "SUCCESS" : "FAILURE";
            }
                return random.nextInt(10) % 2 == 0 ? "PENDING" : "IN_PROGRESS";
        }
    }
}
