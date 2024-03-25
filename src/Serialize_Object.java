import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;

public class Serialize_Object {

    public static void main(String[] args) throws IOException,
            ClassNotFoundException {
        String Serialized_String = To_String(new Demo_Serialize());
        System.out.println(" The Serialized String ");
        System.out.println(Serialized_String);
        Demo_Serialize Original_object = (Demo_Serialize) From_String(Serialized_String);
        System.out.println("\n\nThe Original String");
        System.out.println(Original_object);


    }

    private static Object From_String(String s) throws IOException,
            ClassNotFoundException {
        byte[] Byte_Data = Base64.getDecoder().decode(s);
        ObjectInputStream Object_Input_Stream = new ObjectInputStream(new ByteArrayInputStream(Byte_Data));
        Object Demo_Object = Object_Input_Stream.readObject();
        Object_Input_Stream.close();
        return Demo_Object;
    }

    private static String To_String(Object Demo_Object) throws IOException {
        ByteArrayOutputStream Byte_Array_Output_Stream = new ByteArrayOutputStream();
        ObjectOutputStream Object_Output_Stream = new ObjectOutputStream(Byte_Array_Output_Stream);
        Object_Output_Stream.writeObject(Demo_Object);
        Object_Output_Stream.close();
        return Base64.getEncoder().encodeToString(Byte_Array_Output_Stream.toByteArray());
    }
}

class Demo_Serialize implements Serializable {

    private final static long serialVersionUID = 1;

    int i = Integer.MAX_VALUE;
    String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    Double d = new Double(-1.0);

    @Override
    public String toString() {
        return "Demo_Serialize{" +
                "i=" + i +
                ", s='" + s + '\'' +
                ", d=" + d +
                '}';
    }
}

