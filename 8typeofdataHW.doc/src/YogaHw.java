///1. Write a method which will calculate the
///difference between two numbers and return the result. 
///2. Based on the above program. 
///I would like to get the result of the below expression.
///result = (a-b)  +  (c-d)

public class YogaHw {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 40;
		int d = 60;

		// System.out.println \difference(a-b) + difference (c-d, d);

		// System.out.println( a-b);
		YogaHw yg = new YogaHw();
		int result = yg.difference(a, b) + yg.difference(c, d);
		System.out.println(result);

	}

	public int difference(int a, int b) {

		int result;

		return result = a - b;

	}

}
