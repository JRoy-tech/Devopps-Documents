package inheritanceExample;

public class div3 {
	// 10. Add all number from 1 to 100 that are divided by 3 only and print the
	// result.

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;

		for (i = 1; i <= 100; i++) {
			sum = sum + i;
			if (sum % 3 == 0) {
				System.out.println(sum);
			}

		}

	}

}
