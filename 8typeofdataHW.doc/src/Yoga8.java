/*
8. Write two separate methods addition(int x, int y)
and multiplication(int a, int b). 

The output will be in the following format.Your main method should display
the total.

Let say v1=10 and v2=20

addition(10,20)       -> the result of this method is 30
multiplication(10,20) -> the result of this method is 200.

*/

public class Yoga8 {

	public static void main(String[] args) {
		int v1 = 20;
		int v2 = 20;
		int result1 = add(v1, v2);
		int result2 = multipication(v1, v2);
		System.out.println("addition("+ v1 +"," + v2 +")       -> the result of this method is" + result1);
		System.out.println("multiplication("+ v1 +"," + v2 +")       -> the result of this method is" + result2);
	}

	public static int add(int v1, int v2) {
		int result;
		result = v1 + v2;
		return result;
	}

	public static int multipication(int v1, int v2) {
		int result;
		result = v1 * v2;
		return result;
	}

}
