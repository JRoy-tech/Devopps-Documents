
//11) The number 7 is a truly great number. Given two int values, a and b, return true
//if either one is 7 or their sum or difference is 7. Otherwise return false.
//greatNumber(7,1)    -> true
//greatNumbe7r(3,4)    -> true
//greatNumber(13,6)  -> true
//greatNumber(1,5)    -> false

public class IfElseHw {

	public static void main(String[] args) {

		IfElseHw test = new IfElseHw();
		boolean res = test.greatnumber(13, 6);
		System.out.println(res);

	}

	public boolean greatnumber(int a, int b) {

		int sum = a + b;
		int diff = a - b;
		boolean result;
		if (sum == 7) {
			result = true;

		} else if (diff == 7) {
			result = true;
		} else {
			result = false;
		}

		return result;

	}
}
