package bosscoder.maths;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int columnNumber = 701;
        System.out.println(convertToTitle(columnNumber));
    }

    static String convertToTitle(int columnNumber) {
        StringBuilder sb= new StringBuilder();

       while(columnNumber>0){
           columnNumber--;
           sb.append((char)(columnNumber%26+65));
           columnNumber/=26;
       }
       return sb.reverse().toString();
    }
}
