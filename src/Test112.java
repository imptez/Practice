import java.util.ArrayList;
import java.util.List;

public class Test112 {


    /**
     * In a workshop, only one machine is available to process jobs. You are given N jobs, each with a start and end time represented by two arrays: start[i] and end[i], where start[i] is the start time of the i-th job and end[i] is the end time.
     *
     * Determine the maximum number of non-overlapping jobs that can be processed on the machine if it can handle only one job at a time.
     *
     *
     * Example
     * Input:
     * Start = [1, 3, 0, 5, 8, 5]
     * End =   [2, 4, 9, 7, 9, 9]
     *
     * Output: 4
     *
     * Explanation:
     * The jobs that can be scheduled are:
     * (1,2), (3,4), (5,7), and (8,9).
     * @param args
     */
    public static void main(String[] args) {
      int[] start = {1, 3, 0, 5, 8, 5};
     int[] end =   {2, 4, 9, 7, 9, 9};
        System.out.println(getNonOverLapping(start,end));
    }

    static int getNonOverLapping(int[] start,int[] end){

        int endPointer=0;
        List<Integer> temp= new ArrayList<>();
        temp.add(start[0]);
        for(int i=1;i<start.length;i++){
            if(start[i]-end[endPointer]>0){
                temp.add(start[i]);
                endPointer=i;
            }
        }
      return temp.size();
    }



}
