package bosscoder.maths;

import java.util.Map;

public class DayOfTheWeek {
    static Map<Integer, String> immutableMap = Map.of(
            0, "Saturday", 1, "Sunday", 2, "Monday", 3, "Tuesday", 4, "Wednesday", 5, "Thrusday", 6, "Friday");
    public static void main(String[] args) {
       int day = 31, month = 8, year = 2019;
        System.out.println(dayOfTheWeek(day,month,year));
    }

    public static String dayOfTheWeek(int day, int month, int year) {
        if (month < 3) {
            month += 12;
            year -= 1;
        }

        int q = day;
        int m = month;
        int K = year % 100;     // Year within century
        int J = year / 100;     // Zero-based century

        int h = (q + (13 * (m + 1)) / 5 + K + (K / 4) + (J / 4) + (5 * J)) % 7;
        return immutableMap.get(h);
    }
}
