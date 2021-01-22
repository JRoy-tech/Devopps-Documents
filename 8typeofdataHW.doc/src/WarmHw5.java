
///. A method has two String type arguments like
 ///String a = "This is second argument";
/// String b = "This is first argument";
 ///This method will display the argument values in the following way.
///Output:
 ///Second argument: This is second argument.
///Frist argument : This is first argument.

public class WarmHw5 {
	
	
public static void main(String[] args) {
	String a = "This is first argument";
	String b = "This is second argument";
	
	WarmHw5  object = new WarmHw5();
	object.stringDisplay(a, b);
	}


public void stringDisplay(String a, String b){
	
	System.out.println("Second argument: " + b +".");
	System.out.println("First argument: " +a +".");
	

}
	
}
