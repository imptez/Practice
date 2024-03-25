import java.time.LocalTime;

public class LocalDateTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.parse("07:00");
        System.out.println(time.getHour() );
    }
}
