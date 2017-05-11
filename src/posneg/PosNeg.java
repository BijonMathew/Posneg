package posneg;

/*
 * Bijon Mathew
 * 9 May 2017
 * 
 */


public class PosNeg {

	public  static  boolean posNeg(int a, int b, boolean negative) {

		if (((a > 0 && b < 0) || (a < 0 && b > 0)) && negative == false)

		{
			return true;
		} else if (a < 0 && b < 0 && negative == true) {
			return true;

		} else {
			return false;
		}

	}

	public  static void  main(String[] args) {
		{
			// Test 1
			int a = 1;
			int b = -1;
			boolean result = posNeg(a, b, false);

			if (result == true) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}

		}

		{
			// Test 2
			int a = -1;
			int b = 1;
			boolean result = posNeg(a, b, false);

			if (result == true) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}

		}

		{
			// Test 3
			int a = 1;
			int b = 1;
			boolean result = posNeg(a, b, false);

			if (result == false) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}

		}

		{
			// Test 4
			int a = 1;
			int b = 1;
			boolean result = posNeg(a, b, false);

			if (result == false) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}

		}

		{
			// Test 5
			int a = -1;
			int b = -1;
			boolean result = posNeg(a, b, true);

			if (result == true) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}

		}

		{
			// Test 6
			int a = -1;
			int b = 1;
			boolean result = posNeg(a, b, true);

			if (result == false) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}

		}

		{
			// Test 7
			int a = 1;
			int b = 1;
			boolean result = posNeg(a, b, true);

			if (result == false) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}

		}

	}
}
