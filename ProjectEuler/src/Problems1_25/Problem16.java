/*
 * Braden Rosengren
 * Progress through Project Euler
 * 2018, Feb 5
 */
package Problems1_25;

import java.math.BigInteger;

/**
 *
 * @author br16643
 */
public class Problem16 {

	/**
	 *
	 *
	 * 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
	 *
	 * What is the sum of the digits of the number 21000?
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger x = new BigInteger("2");
		x = x.pow(1000);
		String y = x.toString();
		int z = 0;
		for(int i = 0; i < y.length(); i++){
			z += Character.getNumericValue(y.charAt(i));
		}
		
		System.out.println(z);
	}
}
