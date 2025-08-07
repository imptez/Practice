package bosscoder.arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height));
    }

    static int trap(int[] height) {
        int n = height.length;
        int waterTrapped = 0;
        for (int i = 0; i < n; i++) {
            int leftMax = 0;
            int rightMax = 0;

            for (int x = 0; x <=i; x++) {
                leftMax = Math.max(height[x], leftMax);
            }
            for (int y = i; y < n; y++) {
                rightMax = Math.max(height[y], rightMax);
            }
            waterTrapped = waterTrapped + (Math.min(rightMax, leftMax) - height[i]);
        }

        return waterTrapped;
    }
}
