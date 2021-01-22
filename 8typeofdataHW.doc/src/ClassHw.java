// write a method with in arguement which will show 
//if the tv watcher is less then 18 yrs old, display "young watcher ",
//age is between 18-34 is prime watcher 
//age is between 34 to up is old watcher.
public class ClassHw {

	public static void main(String[] args) {
		watcher(18);
		watcher(19); 	
}
	
	public static void watcher(int age){
		
	if (age < 18){
		System.out.println("young watcher");
	}
	
	else if(age >=18 && age <=34){
		System.err.println("prime watcher");
	}
	
	else{
		System.err.println("old watcher");
	}
	}
	
}
