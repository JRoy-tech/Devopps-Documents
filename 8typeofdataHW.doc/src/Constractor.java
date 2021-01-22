
public class Constractor {
	static int a, b;

	Constractor() {
		a = 10;
		b = 20;

	}

	public static void main(String args[]) {
		int c;

		Constractor test = new Constractor();
		c = a * b;
		System.out.println("Constractor" + c);
	}
}
