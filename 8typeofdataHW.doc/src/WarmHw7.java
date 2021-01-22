///7. Write a method which will add two numbers 
///and display the total in the following format.
///Let say you have two number 10 and 20
///Output
///10 + 20 = 30 
///300 + 200 = 500

public class WarmHw7 {

	public static void main(String[] args) {

		WarmHw7 object = new WarmHw7();

		// object.addition('a', 'b');
		object.addition(10, 20);

	}

	public void addition(int a, int b) {
		System.out.println(a + b);
	}
}
