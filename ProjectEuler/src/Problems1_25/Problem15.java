/*
 * Braden Rosengren
 * Progress through Project Euler
 * 2018, Jan. 30
 */
package Problems1_25;

import java.util.Arrays;

/**
 *
 * @author br16643
 */
public class Problem15 {

	/**
	 *
	 *
	 * Starting in the top left corner of a 2×2 grid, and only being able to
	 * move to the right and down, there are exactly 6 routes to the bottom
	 * right corner.
	 *
	 * How many such routes are there through a 20×20 grid?
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		int n = 0;
		long[] list1 = {1, 1};
		long[] list2 = {1, 1};
		
		while( n < 41 ){
			n++;
			list2 = new long[n];
			for(int i = 0; i < list2.length; i++){
				if(i == 0 || i == list2.length-1){
					list2[i] = 1;
				}
				else{
					list2[i] = list1[i-1] + list1[i];
				}
			}
			list1 = list2.clone();
			System.out.println(Arrays.toString(list1));
		}
		
	}
}
