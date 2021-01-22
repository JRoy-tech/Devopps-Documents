
public class SaveingAccount12 {
	int cr;

	public SaveingAccount12(int y) {
		cr = y;

	}

	public void deposit(int x) {
		cr = cr + x;

	}

	public void withdraw(int x) {

		if (x > cr) {
			System.out.println("insufficant");
		} else {

			cr = cr - x;
			System.out.println();
		}

	}

	public int accountbalance() {

		return cr;
	}
}
