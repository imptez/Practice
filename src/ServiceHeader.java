import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ServiceHeader",
        propOrder = {"headerAttributes"}
)
@XmlRootElement(
        name = "ServiceHeader"
)
public class ServiceHeader implements Serializable {
    private static final long serialVersionUID = 1L;
    private Map<String, Object> headerAttributes;

    public ServiceHeader() {
    }

    public ServiceHeader(Map<String, Object> headerAttributes) {
        this.headerAttributes = headerAttributes;
    }

    public Map<String, Object> getHeaderAttributes() {
        if (this.headerAttributes == null) {
            this.headerAttributes = new HashMap();
        }

        return this.headerAttributes;
    }

    public ServiceHeader setHeaderAttributes(Map<String, Object> headerAttributes) {
        this.headerAttributes = headerAttributes;
        return this;
    }

    public ServiceHeader addHeaderAttribute(String key, Object value) {
        this.getHeaderAttributes().put(key, value);
        return this;
    }

    public Object getHeaderAttribute(String key) {
        return this.getHeaderAttributes().get(key);
    }

    public boolean containsHeaderAttribute(String key) {
        return this.getHeaderAttributes().containsKey(key);
    }

    public Object removeHeaderAttribute(String key) {
        return this.getHeaderAttributes().remove(key);
    }

    public String toString() {
        return "ServiceHeader [headerAttributes=" + this.headerAttributes + "]";
    }
}
