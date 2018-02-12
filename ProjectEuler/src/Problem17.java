/*
 * Braden Rosengren
 * Progress through Project Euler
 * 2018, Feb 5
 */

/**
 *
 * @author br16643
 */
public class Problem17 {

	/**
	 *
	 *
	 * If the numbers 1 to 5 are written out in words: one, two, three, four,
	 * five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
	 *
	 * If all the numbers from 1 to 1000 (one thousand) inclusive were written
	 * out in words, how many letters would be used?
	 *
	 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and
	 * forty-two) contains 23 letters and 115 (one hundred and fifteen) contains
	 * 20 letters. The use of "and" when writing out numbers is in compliance
	 * with British usage.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 0;
		long count = 0L;
		for (int i = 1; i <= 1000; i++) {
			count += ones(i % 10);
			count += tens(i/10 % 10);
			count += huns(i/100 % 10);
			count += thou(i/1000 % 10);
			System.out.println(i + "   " + count);
		}
		
	}

	static int ones(int x) {
		switch (x % 10) {
			case 1:
				return 3;
			case 2:
				return 3;
			case 3:
				return 5;
			case 4:
				return 4;
			case 5:
				return 4;
			case 6:
				return 3;
			case 7:
				return 5;
			case 8:
				return 5;
			case 9:
				return 4;
		}
		return 0;
	}

	static int tens(int x) {
		switch (x) {
			case 1:
				return 4;
			case 2:
				return 6;
			case 3:
				return 6;
			case 4:
				return 5;
			case 5:
				return 5;
			case 6:
				return 5;
			case 7:
				return 7;
			case 8:
				return 6;
			case 9:
				return 6;
		}
		return 0;
	}

	static int huns(int x) {
		switch (x) {
			case 1:
				return 3+7;
			case 2:
				return 3+7;
			case 3:
				return 5+7;
			case 4:
				return 4+7;
			case 5:
				return 4+7;
			case 6:
				return 3+7;
			case 7:
				return 5+7;
			case 8:
				return 5+7;
			case 9:
				return 4+7;
		}
		return 0;
	}
	
	static int thou(int x){
		switch (x) {
			case 1:
				return 3+8;
			case 2:
				return 3+8;
			case 3:
				return 5+8;
			case 4:
				return 4+8;
			case 5:
				return 4+8;
			case 6:
				return 3+8;
			case 7:
				return 5+8;
			case 8:
				return 5+8;
			case 9:
				return 4+8;
		}
		return 0;
	}

}
