import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

public class MyDTO {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSSSSS")
    private Date myDate;

    // Constructors, getters, and setters
    public MyDTO() {}

    public Date getMyDate() {
        return myDate;
    }

    public void setMyDate(Date myDate) {
        this.myDate = myDate;
    }
}
