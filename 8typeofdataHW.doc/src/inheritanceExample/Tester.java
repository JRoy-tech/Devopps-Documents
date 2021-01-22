package inheritanceExample;

public class Tester {

	public static void main(String[] args) {

		ComTest1 ct = new ComTest1();
		int c = ct.add(10, 20);
		System.out.println(c);
		c = ct.subtraction(20, 10);
		System.out.println(c);
		
		ComTest ctp = new ComTest();
		c = ctp.add(10, 20);
		System.out.println(c);
		
		
	}

}
