package inheritanceExample;

public class Loop9 {
	// 9. Do a math to add 20 to 40 all numbers and print the result.

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;

		for (i = 20; i <= 40; i++) {
			sum = i + sum;
			System.out.println(sum);
		}

	}

}
