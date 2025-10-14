package bosscoder.maths;

public class RectangleArea {
    public static void main(String[] args) {
        System.out.println(computeRectangleArea(-2, -2, 2, 2, 3, 3, 4, 4));
    }

    static int computeRectangleArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int areaOfSqrA = (ax2-ax1) * (ay2-ay1);
        int areaOfSqrB = (bx2-bx1) * (by2-by1);

        int left = Math.max(ax1, bx1);
        int right = Math.min(bx2, ax2);
        int bottom = Math.max(ay1, by1);
        int top = Math.min(ay2, by2);

        //If overlap
        int overlap = 0;
        if(right > left && top > bottom)
            overlap = (right - left) * (top - bottom);

        return areaOfSqrA + areaOfSqrB - overlap;
    }
}
