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
public class Problem5 {

	/**
	 *
	 *
	 * 2520 is the smallest number that can be divided by each of the numbers
	 * from 1 to 10 without any remainder.
	 *
	 * What is the smallest positive number that is evenly divisible by all of
	 * the numbers from 1 to 20?
	 *
	 */
	public static void main(String[] args) {
		boolean notfin = true;
		int i = 0;
		while(notfin){
			i++;
			for(int j = 1; j < 21; j++){
				if(i % j != 0){
					break;
				}
				if(j == 20){
					System.out.println(i);
					notfin = false;
				}
			}
		}
	}
}
