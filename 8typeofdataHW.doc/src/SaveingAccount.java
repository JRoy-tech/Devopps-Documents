//Write a Savings Account program with 
//"account balance", 
//"Interest", "deposit" functions.
// An User will use the program 
//and display the user functionality.

public class SaveingAccount {

	private int cr; // instatnt variable

	public SaveingAccount(int y) { // constarctor
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

}