
public class bank {

	public static void main(String[] args) {

		SavingAccount obj = new SavingAccount(100);
		int result = obj.accountbalance();

		System.out.println(result);
		obj.deposit(20);
		result = obj.accountbalance();
		System.out.println(result);

		obj.interest(10);
		result = obj.accountbalance();
		System.out.println(result);

		obj.widhraw(50);
		result = obj.accountbalance();
		System.out.println(result);
	}

}
