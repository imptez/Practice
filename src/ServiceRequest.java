import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ServiceRequest",
        propOrder = {"header", "payload"}
)
@XmlRootElement(
        name = "ServiceRequest"
)
public class ServiceRequest<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    @XmlElement(
            name = "header",
            required = false
    )
    private ServiceHeader header;
    private T payload;

    public ServiceRequest() {
    }

    public ServiceRequest(ServiceHeader header, T payload) {
        this.header = header;
        this.payload = payload;
    }

    public T getPayload() {
        return this.payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }

    public ServiceHeader getHeader() {
        if (this.header == null) {
            this.header = new ServiceHeader();
        }

        return this.header;
    }

    public ServiceHeader setHeader(ServiceHeader header) {
        this.header = header;
        return this.header;
    }

    public String toString() {
        return "ServiceRequest [header=" + this.header + ", payload=" + this.payload + "]";
    }
}
