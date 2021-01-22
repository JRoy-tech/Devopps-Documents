
public class ChekingAccount {

	public static void main(String[] args) {

		SaveingAccount12 obj = new SaveingAccount12(10000);
		int result = obj.accountbalance();

		System.out.println("Balance Before Deposit:" + result);

		obj.deposit(5000);
		result = obj.accountbalance();
		System.out.println("Balance After Deposit:" + result);

		obj.withdraw(300);

		result = obj.accountbalance();

		System.out.println("Current balance is:" + result);
	}

}
