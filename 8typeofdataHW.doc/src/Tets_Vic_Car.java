
public class Tets_Vic_Car implements Vichel, Car {

	@override
	public void disp() {
		System.out.println("disp()mwthod implement");

	}

	public static void main(String[] args) {

		Tets_Vic_Car ts = new Tets_Vic_Car();
		ts.disp();

	}

}
