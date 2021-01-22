package inheritanceExample;

public class IfElseTest {

	public static void main(String[] args) {
		// create object
		IfElseTest obj = new IfElseTest();
		// calling method & put value
		String result = obj.teen(13);
		// printing consul
		System.out.println(result);
	}

	public String teen(int x) {// user define method
		// declare vari
		String st;
		if (x > 12 && x < 20) {

			st = "you are teen";
		} else {

			st = "you are not teen";
		}

		return st;

	}

}
