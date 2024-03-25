import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import java.util.TimeZone;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XmlToObject {
    /*
    public static void main(String[] args) throws ParseException {

        try {

            File file = new File("employee.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Employee que= (Employee) jaxbUnmarshaller.unmarshal(file);
            System.out.println(que.getId()+" "+que);
           *//* System.out.println(que.getId()+" "+que.getQuestionname());
            System.out.println("Answers:");
            List<Answer> list=que.getAnswers();
            for(Answer ans:list)
                System.out.println(ans.getId()+" "+ans.getAnswername()+"  "+ans.getPostedby());*//*

        } catch (JAXBException e) {
            e.printStackTrace();
        }

//        String dateTime="2023-01-09T04:24:52.541624";
//        SimpleDateFormat sdf = new SimpleDateFormat();
//        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
//        System.out.println(dateTime);
//        System.out.println(stringToDate(dateTime));
//        System.out.println( stringToDateFormat(dateTime));
    }

    public static Date stringToDate(String dateString) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
            sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
            return sdf.parse(dateString);
        } catch (ParseException e) {
            return new Date(0);
        }
    }

    public static Date stringToDateFormat(String dateString) {

        try {
            SimpleDateFormat format = new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ss");
            return format.parse(dateString);
        } catch (ParseException e) {
            return new Date(0);
        }
    }
    */
}  