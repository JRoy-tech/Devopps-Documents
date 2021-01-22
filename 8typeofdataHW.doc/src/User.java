//Write a Savings Account program with "account balance", 
//"Interest", "deposit" functions.
// An User will use the program and display the user functionality.

public class User {

	public static void main(String[] args) {

		SaveingAccount obj = new SaveingAccount(100);
		int result = obj.accountbalance();
		System.out.println(result);
		// one time deposit.
		for (int i = 0; i < 30; i++) {
			obj.deposit(20);

		}
		result = obj.accountbalance();
		System.out.println(result);

		// for (int deposit = 1;deposit <=30;deposit= deposit+20){
		// System.out.println();
		// }

		System.out.println(result);
		//
		// obj.interest(10);
		// result = obj.accountbalance();
		// System.out.println(result);

		// for(int a=1;a<=30;a= a+30);{
		// System.out.println("jhalak")
		// }

	}

}