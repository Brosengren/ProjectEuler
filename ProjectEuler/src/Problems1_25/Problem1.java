/*
 * Braden Rosengren
 * Progress through Project Euler
 * 2018
 */
package Problems1_25;

/**
 *
 * @author br16643
 */
public class Problem1 {

	/**
	 *
	 *
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
	 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
	 *
	 * Find the sum of all the multiples of 3 or 5 below 1000.
	 *
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		int result = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0) {
				result += i;
			} else if (i % 5 == 0) {
				result += i;
			}
		}
		System.out.println(result);
	}

}
