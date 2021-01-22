
public class TestReturnType3 extends Test2ReturnType {

	public static void main(String[] args) {

		TestReturnType3 obj = new TestReturnType3();
		obj.add(15, 10);
		obj.sub(50, 25);
		obj.mul(5, 50);
		obj.div(50, 2);

	}

	public void add_display(int x, int y) {
		int result = add(x, y);
		System.out.println("The additon of " + x + " and " + y + " = " + result);
		;

	}

	public void sub_display(int x, int y) {
		int result = sub(x, y);
		System.out.println("The subtraction of " + x + " and " + y + " = " + result);
		;
	}

	public void mul_display(int x, int y) {
		int result = (x * y);
		System.out.println("The multification of " + x + " and " + y + " = " + result);
		;
	}

	public void div_display(int x, int y) {
		int result = (x / y);
		System.out.println("The divsion of " + x + " and " + y + " = " + result);
		;
	}
}
