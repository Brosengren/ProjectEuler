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
public class Problem14 {

	/**
	 *
	 *
	 * The following iterative sequence is defined for the set of positive
	 * integers:
	 *
	 * n → n/2 (n is even) n → 3n + 1 (n is odd)
	 *
	 * Using the rule above and starting with 13, we generate the following
	 * sequence: 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
	 *
	 * It can be seen that this sequence (starting at 13 and finishing at 1)
	 * contains 10 terms. Although it has not been proved yet (Collatz Problem),
	 * it is thought that all starting numbers finish at 1.
	 *
	 * Which starting number, under one million, produces the longest chain?
	 *
	 * NOTE: Once the chain starts the terms are allowed to go above one
	 * million.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 113383;
		int max = 1;
		int maxnum = 0;
		long num = 0L;
		int cnt;
		while(i < 1000000){
			num = i;
			cnt = 1;
			while(num != 1){
				if(num%2 == 0){
					num /= 2;
				}
				else{
					num = (3 * num) + 1;
				}
				cnt++;
			}
			
			if(cnt+1 > max){
				max = cnt+1;
				maxnum = i;
	
			}
			i++;
			
		}
		System.out.println("cnt " + max);
		System.out.println("num " + maxnum);

		
		
	}
}
