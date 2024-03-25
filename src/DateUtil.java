import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateUtil {

    public static void main(String[] args) throws ParseException {


        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.set(Calendar.YEAR, 2016);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DAY_OF_MONTH, 27);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 35);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);

        //This is required as Java Date JAN starts at 0.
        int MonthCon = cal.get(Calendar.MONTH) - 1;
        cal.set(Calendar.MONTH, MonthCon);
        Date d = cal.getTime();


        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssz");
        f.setTimeZone(TimeZone.getTimeZone("UTC"));
        System.out.println("UTC:    " + f.format(d));
        f.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        System.out.println("BST:    " + f.format(d));

        //Creates a BST calendar of the same UTC time
        String dateStrBST = f.format(d);

        SimpleDateFormat curFormater = new SimpleDateFormat();
        curFormater.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        Date dateObjBST = curFormater.parse(dateStrBST);


        System.out.println("BSTNewDate:    " + f.format(dateObjBST));


        Calendar calBST = Calendar.getInstance(TimeZone.getTimeZone("BST"));
        calBST.setTime(dateObjBST);

        System.out.println("Current TimeZone is : " + calBST.getTimeZone());

        int offset = calBST.get(Calendar.DST_OFFSET);
        System.out.println("Day Light Savings: " + offset);
      //  System.out.println("Transition Day: " + isDSTTransitionDay(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH)) + "   Transition Type: " + DSTtransitionType(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH)));
    }
}