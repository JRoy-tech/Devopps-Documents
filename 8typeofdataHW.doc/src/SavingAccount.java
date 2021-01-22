
public class SavingAccount {
	int cr;

	public SavingAccount(int y) {
		cr = y;

	}

	public int accountbalance() {
		return cr;

	}

	public void deposit(int x) {

		cr = cr + x;
	}

	public void interest(int x) {
		cr = cr + cr * x / 100;
	}

	public void widhraw(int x) {
		cr = cr - x;

	}

}
