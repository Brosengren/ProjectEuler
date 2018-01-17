/*
 * Braden Rosengren
 * Progress through Project Euler
 * 2018, Jan. 10
 */
package Problems1_25;

/**
 *
 * @author br16643
 */
public class Problem10 {
	/**
	 *
	 *
	 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
	 *
	 * Find the sum of all the primes below two million.
	 *
	 */
	public static void main(String[] args){
		int num = 2;
		long sum = 0L;
		boolean prime = true;
		while(num < 2000000){
			for(int i = 2; i <= num/i; i++){
				if(num % i == 0){
					prime = false;
					break;
				}
			}
			if(prime){
				sum += num;
				System.out.println(num);
			}
			prime = true;
			num++;
		}
		System.out.println(sum);
	}
}
