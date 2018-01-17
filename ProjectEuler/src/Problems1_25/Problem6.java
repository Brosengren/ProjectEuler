/*
 * Braden Rosengren
 * Progress through Project Euler
 * 2018, Jan. 9
 */
package Problems1_25;

/**
 *
 * @author br16643
 */
public class Problem6 {
	/**
	 *
	 *
	 * The sum of the squares of the first ten natural numbers is, 1^2 + 2^2 + ...
	 * + 10^2 = 385
	 *
	 * The square of the sum of the first ten natural numbers is, (1 + 2 + ... +
	 * 10)^2 = 55^2 = 3025
	 *
	 * Hence the difference between the sum of the squares of the first ten
	 * natural numbers and the square of the sum is 3025 − 385 = 2640.
	 *
	 * Find the difference between the sum of the squares of the first one
	 * hundred natural numbers and the square of the sum.
	 *
	 */
	
	public static void main(String[] args){
		int sqofsum = 0;
		int sumofsq = 0;
		
		for(int i = 1; i <= 100; i++){
			sqofsum += i;
			sumofsq += i * i;
		}
		
		sqofsum = sqofsum * sqofsum;
		System.out.println(sqofsum);
		System.out.println(sumofsq);
		
		int result = sqofsum - sumofsq;
		System.out.println(result);
	}

}
