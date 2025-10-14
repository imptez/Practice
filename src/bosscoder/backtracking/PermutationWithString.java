package bosscoder.backtracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationWithString {

    public static void main(String[] args) {
        String str="abc";
        List<String> strList= new ArrayList<>();

        getPermutationWithoutSpaceComplexity(0,str.toCharArray(),strList);
        strList.forEach(System.out::println);
    }

    private static void getPermutationWithoutSpaceComplexity(int index, char[] charArray, List<String> strList) {
        if(index==charArray.length){
            StringBuilder sb= new StringBuilder();
            for(Character ch:charArray){
                sb.append(ch);
            }
            strList.add(sb.toString());
        }

        for(int i=index;i<charArray.length;i++){
            swap(index,i,charArray);
            getPermutationWithoutSpaceComplexity(index+1,charArray,strList);
            swap(index,i,charArray);
        }
    }

    private static void swap(int start,int end, char[] charArray){
        char ch=charArray[start];
        charArray[start]=charArray[end];
        charArray[end]=ch;
    }
}
