package datastructures.strider;

public class Patterns {
    public static void main(String[] args) {

        pattern1(3);
    }

    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
