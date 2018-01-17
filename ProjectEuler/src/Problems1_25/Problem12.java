/*
 * Braden Rosengren
 * Progress through Project Euler
 * 2018, Jan 17
 */
package Problems1_25;

/**
 *
 * @author br16643
 */
public class Problem12 {

	/**
	 *
	 *
	 * The sequence of triangle numbers is generated by adding the natural
	 * numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 =
	 * 28. The first ten terms would be:
	 *
	 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
	 *
	 * Let us list the factors of the first seven triangle numbers:
	 *
	 * 1: 1 3: 1,3 6: 1,2,3,6 10: 1,2,5,10 15: 1,3,5,15 21: 1,3,7,21 28:
	 * 1,2,4,7,14,28
	 *
	 * We can see that 28 is the first triangle number to have over five
	 * divisors.
	 *
	 * What is the value of the first triangle number to have over five hundred
	 * divisors?
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int place = 1;
		long num = 0L;
		int div = 0;
		while(div <= 500){
			div = 0;
			num = 0;
			place++;
			for(int i = 0; i <= place; i++){
				num += i;
			}
			for(int i = 1; i <= num/i; i++){
				if(num%i == 0){
					div += 2;
				}
			}
			
		}
		System.out.println(num);
	}
}
