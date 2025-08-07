package datastructures.strider;

import java.util.List;

/**
 * Operation:
 * AutoCompleteSystem(["i love you", "island",
 * "ironman", "i love geeksforgeeks"], [5,3,2,2])
 *
 * The system have already tracked down the
 * following sentences and their corresponding
 * times:
 * "i love you" : 5 times
 * "island" : 3 times
 * "ironman" : 2 times
 * "i love geeksforgeeks" : 2 times
 *
 * Now, the user begins another search:
 *
 * Operation: input('i')
 * Output:
 * ["i love you", "island","i love
 *                        geeksforgeeks"]
 *
 * Explanation:
 * There are four sentences that have prefix
 * "i". Among them, "ironman" and "i love
 * geeksforgeeks" have same frequency. Since
 * ' ' has ASCII code 32 and 'r' has ASCII code
 *  114, "i love geeksforgeeks" should be in
 * front of "ironman". Also we only need to
 * output top 3 most frequent sentences, so
 * "ironman" will be ignored.
 *
 * Operation: input(' ')
 * Output: ["i love you","i love geeksforgeeks"]
 * Explanation:
 * There are only two sentences that have prefix
 * "i ".
 *
 * Operation: input('a')
 * Output: []
 * Explanation:
 * There are no sentences that have prefix "i a"
 *
 * Operation: input('#')
 * Output: []
 * Explanation:
 * The user finished the input, the sentence
 * "i a" should be saved as a historical
 * sentence in system. And the next input
 * will be counted as a new search.
 */
public class GFG {
    public static void main(String[] args) {

        AutoCompleteSystem autoCompleteSystem = new AutoCompleteSystem(new String[]{"i love you", "island",
                "ironman", "i love geeksforgeeks"}, new int[]{1, 3, 2, 4});
        List<String> result = autoCompleteSystem.input('i');
        result.forEach(System.out::println);
    }
}
