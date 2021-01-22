//9. Write a method which will return the square value of that number.
//Output
//5  output 25
//12 output 144

public class Yoga9 {

	public static void main(String[] args) {
		int number = 5;
		int result = square(number);
		System.out.println(number + " output  " + result);

	}

	public static int square(int a) {
		int result;
		result = a * a;
		return result;

	}
}
