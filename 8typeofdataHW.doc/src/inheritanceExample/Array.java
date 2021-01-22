package inheritanceExample;

public class Array {

	public static void main(String[] args) {
		String[] x = { "A", "B", "C", "D", "E", "F" };

		for (int i = 0; i < x.length; i++) {

			if (i % 2 == 0) {
				System.out.print(x[i] + " ");
			}

			else {
				System.out.println(x[i]);
			}

		}

	}
}
