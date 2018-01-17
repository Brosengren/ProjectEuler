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
public class Problem3 {

	/**
	 *
	 *
	 * The prime factors of 13195 are 5, 7, 13 and 29.
	 *
	 * What is the largest prime factor of the number 600851475143 ?
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		long num = 600851475143L;
		int factor = 2;
		while (num > factor) {
			if (num % factor == 0) {
				num /= factor;
				System.out.println(factor);
				factor = 2;
			} else {
				factor++;
			}
		}
		System.out.println(num);
	}
}
