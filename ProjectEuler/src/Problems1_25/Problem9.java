/*
 * Braden Rosengren
 * Progress through Project Euler
 * 2018, Jan. 9
 */
package Problems1_25;

import static java.lang.Math.sqrt;

/**
 *
 * @author br16643
 */
public class Problem9 {
	/**
	 *
	 *
	 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
	 * which, a2 + b2 = c2
	 *
	 * For example, 32 + 42 = 9 + 16 = 25 = 52.
	 *
	 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	 * Find the product abc.
	 *
	 */
	public static void main(String[] args){
		int a = 1;
		int b = 1;
		int c = 1;
		int c2 = 1;
		
		
		while(a + b + c != 1000){
			b++;
			
			for(a = 1; a < b; a++){
				c2 = a*a + b*b;
				c = (int)(sqrt(c2));
				
				System.out.print(a + "  " + b + "  ");
				System.out.println(c);
				System.out.println(c2);
				
				if(c * c == c2){
					if(a + b + c == 1000){
						System.out.println("GOT IT");
						break;
					}
				}
			}
		}
		System.out.println("a -- " + a);
		System.out.println("b -- " + b);
		System.out.println("c -- " + c);
		System.out.println(a * b * c);
	}
}
