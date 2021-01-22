/*
 * 3. Write  one argument function which will return opposite number.
 * Display the number in console.  Remember don't use static method.
 * 
 * Example: 
 * opposite number  example  10   output -10
 * -9  opposite 9 return means something. int
 */


public class WarmHW3 {

	public static void main(String[] args) {
		WarmHW3 test = new WarmHW3();
		int r =test.opposite(-9);
		System.out.println(r);
	}

	public  int opposite( int a){
		int result;
		result = -a;
		return result;
		
	}
		
}
