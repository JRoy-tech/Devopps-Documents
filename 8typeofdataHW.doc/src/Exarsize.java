
//11) The number 7 is a truly great number. Given two int values, a and b, return true
//if either one is 7 or their sum or difference is 7. Otherwise return false.
//greatNumber(7,1)    -> true
//greatNumbe7r(3,4)    -> true
//greatNumber(13,6)  -> true
//greatNumber(1,5)    -> false

public class Exarsize {
	public static void main(String[] args) {

	}

	public boolean greatnumber(int a, int b) {
		int sum = a + b;
		int diff = a - b;
		if (sum == 7) {
			boolean result = true;
			return true;

		}
		return false;

	}
}
