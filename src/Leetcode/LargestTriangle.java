
package Leetcode;

import java.util.Arrays;

/* DAILY CODE DAY #24 
 * @LeetCode: You have a list of points in the plane. Return the area of the 
 * largest triangle that can be formed by any 3 of the points.
 * Input: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]*/
public class LargestTriangle {
    public static double largestTriangleArea(int[][] points) {
        double max = 0.0; 
        int test = points.length;
        for (int i = 0; i < points.length - 2; i++) 
            for (int j = i + 1; j < points.length - 1; j++) 
                for (int k = j + 1; k < points.length; k++) 
                    max = Math.max(max, areaCal(points[i], points[j], points[k])); 
        return max; 
    }

    public static double areaCal(int[] pt1, int[] pt2, int[] pt3) {
        // Given the coordinates of the three vertices of any triangle, 
    	// the area of the triangle is given by
        return Math.abs(pt1[0] * (pt2[1] - pt3[1]) + pt2[0] * 
        		(pt3[1] - pt1[1]) + pt3[0] * (pt1[1] - pt2[1])) / 2.0; 
    }

	public static void main(String[] args) {
		int[][] arr = new int[][] {
				{ 0, 0 }, {0, 1},
				{ 1, 0 }, {0, 2},
				{ 2, 0 }
		};
		// Convert the arr-Array into an individual array for each point
		int[][] points = new int[arr.length][];
	      for (int i = 0; i < points.length; i++) {
	          points[i] = new int[arr[i].length];
	          for (int j = 0; j < points[i].length; j++) {
	             points[i][j] = arr[i][j];
	          }
	      }
	      System.out.println(Arrays.deepToString(points));
	      System.out.println(largestTriangleArea(points));
	}
}




