package Job;

import java.util.ArrayList;
import java.util.List;

public class SkeletonMatcher {

    public static void main(String[] args) {
        String word = "hello";
        String[] skeletons = {"h--l", "he-lo", "g-llo", "m-llo", "--llo", "hello"};
        // outPut={"he-lo","hello"};

        List<String> matchingSkeletons = findMatchingSkeletons(word, skeletons);

        System.out.println("Matching skeletons: " + matchingSkeletons);
    }

    public static List<String> findMatchingSkeletons(String word, String[] skeletons) {
        List<String> matchingSkeletons = new ArrayList<>();

        for (String skeleton : skeletons) {
            if (matchesSkeleton(word, skeleton)) {
                matchingSkeletons.add(skeleton);
            }
        }

        return matchingSkeletons;
    }

    private static boolean matchesSkeleton(String word, String skeleton) {
        if (word.length() != skeleton.length()) {
            return false; // Lengths must be the same
        }

        for (int i = 0; i < word.length(); i++) {
            if (skeleton.charAt(i) != '-' && word.charAt(i) != skeleton.charAt(i)) {
                return false; // Mismatch found
            }
        }

        return true; // No mismatches
    }
}
