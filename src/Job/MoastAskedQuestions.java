package Job;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoastAskedQuestions {

    /**
     * Q #1) Write a Java Program to reverse a string without using String inbuilt function.
     */

    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    /**
     * Q #2) Write a Java Program to swap two numbers without using the third variable.
     */

    private static void swapVariable() {
        int a = 10;
        int b = 20;
        System.out.println("First variable previous to swap = " + a);
        System.out.println("Second variable previous to swap = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("First variable previous to swap = " + a);
        System.out.println("Second variable previous to swap = " + b);
    }

    /**
     * Q #3) Write a Java Program to count the number of words in a string using HashMap.
     */

    private static void countWords(String s) {
        List<String> words= Arrays.stream(s.split("\\s+")).toList();
        Map<String, Long> wordMap = words.stream()
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        wordMap.forEach((s1, aLong) -> System.out.println("The Word is "+s1+" the count is "+aLong));
    }

    /**
     * Number is prime or not
     *
     */

    public static boolean

    isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }

    /**
     * Q #6) Write a Java Program to find whether a string or number is palindrome or not.
     */

    private static void isPallindrome(){
       String str="MADAM";
       if(str.equalsIgnoreCase(palindromeReverse(str))){
           System.out.println("The string "+str+ " is palindrome");
           return;
       }
        System.out.println("The string "+str+ " is not palindrome");
    }

    private static String palindromeReverse(String str){
        if(str.isEmpty()){
            return str;
        }
        return palindromeReverse(str.substring(1))+str.charAt(0);
    }

    /**
     * Q #7) Write a Java Program for the Fibonacci series in recursion.
     */

    private static int getFibonacci(int n){//5
        if(n <= 1){
            return n;
        }
        else{
            return getFibonacci(n-1)+getFibonacci(n-2);
        }
    }

    /**
     * Q #9) Write a Java Program to find the duplicate characters in a string.
     */

    private static void getDuplicateCharacter(){
        String str="bhaabccdeefh";
        char[] ch= str.toCharArray();
        Set<Character> chunique= new TreeSet<>();
        for(Character chNew:ch){
            if(!chunique.add(chNew)){
                System.out.println(chNew);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Calling method reverseString(\"DOG\")");
        System.out.println(getReverseString("DOG"));
        System.out.println("Calling method swapVariable()");
        swapVariable();
        System.out.println("Calling method countWords()");
        getCountOfWords(" Ramu has a black dog black dog ramu ");
        System.out.println("Calling method isPrime()");
        System.out.println("The number 29 isPrime "+isPrime(29));
        System.out.println("Calling method isPallindrome()");
        isPallindrome();
        System.out.println("Calling method getFibonacci()");
        System.out.println(getFibonacci(6));
        System.out.println("Calling method getDuplicateCharacter()");
        String str="bhaabccdeefh";
        duplicateCharacter(str);
        getDuplicateCharacter();

    }

    public static void duplicateCharacter(String str){
        str.chars().mapToObj(value -> (char) value)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(value -> value.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }

    public static void getCountOfWords(String str){
        System.out.println("String is ..."+str);
        String[] split = str.split("\\s");
        System.out.println(Arrays.stream(split)
                .filter(s -> !s.isEmpty())
                .count());
    }

    public static String getReverseString(String str){
        if(str.isEmpty()){
            return str;
        }
        return getReverseString(str.substring(1)) + str.charAt(0);
    }




}
