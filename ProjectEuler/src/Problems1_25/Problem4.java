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
public class Problem4 {

	/**
	 *
	 *
	 * A palindromic number reads the same both ways. The largest palindrome
	 * made from the product of two 2-digit numbers is 9009 = 91 × 99.
	 *
	 * Find the largest palindrome made from the product of two 3-digit numbers.
	 *
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int p = 0;
		int finala = 0;
		int finalb = 0;
		int max = 0;

		for (a = 999; a > 99; a--) {
			for (b = 999; b > 99; b--) {

				p = a * b;
				String str = Integer.toString(a * b);

				for (int i = 0; i < (str.length()); i++) {

					if (str.charAt(i) != str.charAt((str.length() - 1 - i))) {
						break;
					}

					if (i >= (str.length() / 2)) {
						if (p > max) {
							max = p;
							finala = a;
							finalb = b;
						}

					}
				}

			}
		}
		System.out.println(max);
		System.out.println(finala);
		System.out.println(finalb);

	}
}
