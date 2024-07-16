package stack;
import stack.NextSmall;
public class Histogram {

    public static int MaxArea(int[] nextsmallToLeft, int[] nextsmallToRight, int[] heights) {
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int width = nextsmallToRight[i] - nextsmallToLeft[i] - 1;
            int area = heights[i] * width;
            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        NextSmall ng = new NextSmall();
        // calling the functions to calculate nextsmallToLeft and nextsmallToRight 
        int[] nextsmallToLeft = ng.NextSmallToLeft(heights);
        int[] nextsmallToRight = ng.NextSmallToRight(heights);
        // calling the function to calculate the area of the histogram
        int area = MaxArea(nextsmallToLeft, nextsmallToRight, heights);
        System.out.println("The maximum area of the histogram is: " + area);
    }
    
}
