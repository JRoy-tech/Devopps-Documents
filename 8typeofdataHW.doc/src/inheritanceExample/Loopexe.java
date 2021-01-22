package inheritanceExample;

public class Loopexe {

	public static void main(String[] args) {
		int counter = 0;
		int y = 0;
		int[] x;
		x = new int[7];
		x[0] = 20;
		x[1] = 30;
		x[2] = 40;
		x[3] = 51;
		x[4] = 60;
		x[5] = 71;
		x[6] = 93;
		for (int a = 0; a < x.length; a++) {
			// System.out.println(a);
			if (x[a] % 2 == 1) {

				counter++;
				System.out.println(counter);
			}

		}

	}

}
