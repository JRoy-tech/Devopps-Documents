
public class Equation {

	public static void main(String[] args) {

		int result1 = subtraction();
		int result2 = subtraction1();
		System.out.println(result1);
		System.out.println(result2);
		multification();
		divided();
		addition();
	}

	public static int subtraction() {
		int a = 10;
		int b = 15;
		int c = 20;

		return b - a;
	}

	public static int subtraction1() {
		int a = 10;
		int b = 15;
		int c = 20;

		return c - b;
	}

	public static void multification() {

		int a = 10;
		int b = 15;
		int c = 20;
		int result1 = a * b;
		int result2 = b * c;
		System.out.println(result1);
		System.out.println(result2);
	}

	public static void divided() {

		int a = 15;
		int b = 10;
		int c = 20;
		int result1 = a / b;
		int result2 = b / c;
		System.out.println(result1);
		System.out.println(result2);

	}

	public static void addition() {
		int a = 10;
		int b = 20;
		int c = 30;
		int result1 = a + b * c;
		System.out.println("total value" + result1);

	}

}
