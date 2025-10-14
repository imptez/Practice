package bosscoder.maths;

public class RectangleOverlap {
    public static void main(String[] args) {
        int [] rec1 = {0,0,1,1}, rec2 = {1,0,2,1};
        System.out.println(isRectangleOverlap(rec1,rec2));
    }

    static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int width = Math.min(rec1[2], rec2[2]) - Math.max(rec1[0], rec2[0]);

        int height = Math.min(rec1[3], rec2[3]) - Math.max(rec1[1], rec2[1]);

        return ( width > 0 && height > 0 );
    }
}
