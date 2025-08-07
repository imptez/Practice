package datastructures.strider;

import java.util.List;

public class SwitchExample {

    static double switchCase(int choice, List<Double> arr){
        switch (choice){
            case 1 :
                return Math.PI* arr.get(0)* arr.get(0);
            case 2:
                return arr.get(0)*arr.get(1);
            default:
                return 0;
        }
    }

    public static void main(String[] args) {

    }
}
