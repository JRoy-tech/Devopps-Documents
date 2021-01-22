package inheritanceExample;

public class Array1 {

	public static void main(String[] args) {

		int[] x = { 13, 10, 15, 6, 9, 21 };

		for (int i = 0; i < x.length; i++) {

			if (x[i] % 2 == 1) {
				
				System.out.println(i);

			}

		}

	}

}
