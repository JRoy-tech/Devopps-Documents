package inheritanceExample;

public class LoopIfClass {

	public static void main(String[] args) {
		int y = 0;
		int[] x;
		x = new int[7];
		x[0] = 20;
		x[1] = 30;
		x[2] = 40;
		x[3] = 50;
		x[4] = 60;
		x[5] = 71;
		x[6] = 93;

		for (int a = 0; a < x.length; a++) {
			if (x[a] % 2 == 1) {
				// System.out.println(x[a]);
				y = y + x[a];

			}

		}

		System.out.println(y);

	}

}
