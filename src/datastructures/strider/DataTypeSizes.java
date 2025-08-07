package datastructures.strider;

public class DataTypeSizes {
    public static void main(String[] args) {
        dataTypeSize("Integer");
    }

    static int dataTypeSize(String str) {
        int size = 0;
        switch (str) {
            case "byte":
            case "Byte":
                size =(Byte.SIZE / 8);
                System.out.println("Size of byte: " + (Byte.SIZE / 8) + " bytes");
                break;
            case "short":
            case "Short":
                size =(Short.SIZE / 8);
                System.out.println("Size of short: " + (Short.SIZE / 8) + " bytes");
                break;
            case "char":
            case "Character":
                size =(Character.SIZE / 8);
                System.out.println("Size of char: " + (Character.SIZE / 8) + " bytes");
                break;
            case "int":
            case "Integer":
                size =(Integer.SIZE / 8);
                System.out.println("Size of int: " + (Integer.SIZE / 8) + " bytes");
                break;
            case "float":
            case "Float":
                size =(Float.SIZE / 8);
                System.out.println("Size of float: " + (Float.SIZE / 8) + " bytes");
                break;
            case "long":
            case "Long":
                size =(Long.SIZE / 8);
                System.out.println("Size of long: " + (Long.SIZE / 8) + " bytes");
                break;
            case "double":
            case "Double":
                size =(Double.SIZE / 8);
                System.out.println("Size of double: " + (Double.SIZE / 8) + " bytes");
                break;
            default:
                System.out.println("Not a valid datatype");
        }
        return size;
    }
}
