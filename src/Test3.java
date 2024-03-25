import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Test3 {

    public static void main(String[] args) throws IOException {
        LocalDateTime dt = LocalDateTime.now();
      DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
      System.out.println(getOurDate(new Date()));
      System.out.println(LocalDateTime.now().atZone(ZoneOffset.systemDefault())
              .withZoneSameInstant(ZoneOffset.UTC).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
    }

  public static String getOurDate(Date date) {
    try {

      String formatedDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(date);
      return formatedDate;
    } catch (Exception e) {
      System.out.println("Error");
    }
    return null;
  }

}
