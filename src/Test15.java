import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test15 {
    public static void main(String[] args) throws ParseException {
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = simpleDateFormat.parse("12-01-2018");
        System.out.println(date);
    }
}
