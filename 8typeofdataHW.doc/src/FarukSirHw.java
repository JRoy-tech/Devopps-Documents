//12) A sortSum method has two integer argument and return their
//sum result.
//However, sum in the range 10...19, are 
//forbidden, so in that case just return 20.
//sortSum(3,5)      -> 8
//sortSum(9,5)      -> 20
//sortSum(10,12)  -> 22

public class FarukSirHw {

	public static void main(String[] args) {
		int result=sortsum(10,12);
		System.out.println(result);
		}

	public static  int sortsum(int a , int b){
		
		int result =  a+b;
		
		if(result >10 && result >19){
			
		}
		return 20;
		
	}
		
}