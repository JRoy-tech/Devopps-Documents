package inheritanceExample;

public class TestClass {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 50; i = i + 1) {

			if((i%5==0)&&(i!=25)){
			//if (i % 5 == 0) {

			}

			else {
				System.out.println(i);
				sum = sum + i;

			}

		}

		System.out.println(sum);
	}

}
