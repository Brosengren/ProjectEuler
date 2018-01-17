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
public class Problem7 {
	/**
	 *
	 *
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can
	 * see that the 6th prime is 13.
	 *
	 * What is the 10 001st prime number?
	 *
	 */
	public static void main(String[] args){
		int pnum = 6;
		int num = 13;
		boolean prime = true;
		while(pnum < 10001){
			num++;
			
			for(int i = 2; i <= num / i; i++){
				if(num % i == 0){
					prime = false;
					break;
				}
			}
			
			if(prime){
				pnum++;
//				System.out.println("#" + pnum);	//print prime number position
//				System.out.println(num);		//print prime number
			}
			
			prime = true;
		}
		
		System.out.println(num);
	}
}
