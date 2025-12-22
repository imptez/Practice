package bosscoder.twoPointer;

public class ContainerMostWater {

    public static void main(String[] args) {
        //int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] height = {1, 1};
        System.out.println(getMaxWaterStored(height));
    }

    static int getMaxWaterStored(int[] input) {
        int i = 1;
        int j = input.length;
        int maxArea = Integer.MIN_VALUE;
        while (j > i) {
            int area = (j - i) * Math.min(input[i - 1], input[j - 1]);
            maxArea = Math.max(maxArea, area);
            if (input[i - 1] > input[j - 1]) {
                j--;
            } else {
                i++;
            }
        }
        return maxArea;
    }
}
