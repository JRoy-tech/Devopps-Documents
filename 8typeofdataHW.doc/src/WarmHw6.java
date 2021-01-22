///6. A robot method has two String arguments.\
///First argument will hold the greeting message and second argument will hold the user name. 
///The purpose of robot method is to display the greeting with user name.

///Output:
///Hi Admin.
///Hello Alam Hossain.
///Goodbye John.



public class WarmHw6 {

	public static void main(String[] args) {
		
		
		String firstargument =" Hello";
		String secondargument = "Alam Hossain";
		
		WarmHw6  object = new WarmHw6();
		object.robot(firstargument, secondargument);
		
		
			}
	public void robot(String firstargument, String secondargument){
		
		
		System.out.println(firstargument +" "+secondargument);
		
	}
}
	
	
	
	

