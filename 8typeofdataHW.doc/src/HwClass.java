
public class HwClass {

	public static void main(String[] args) {
	
		HwClass test = new HwClass();
		test.login("mike", "123", "20", "120 w 54th st");
	}

	
	
	public void login(String username, String password, String age, String adress){
		
	System.out.println("username "  + username);
	System.out.println("password "   + password); 
	System.err.println("my age "  + age  );
	System.err.println("my "  +     adress);
}
}