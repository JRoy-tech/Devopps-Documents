/*
	12) A sortSum method has two integer argument and return their
	sum result.
	However, sum in the range 10...19, are 
	forbidden, so in that case just return 20.
	sortSum(3,5)    -> 8
	sortSum(9,5)    -> 20
	sortSum(10,12)  -> 22
*/


public class SortSum {
	public static void main(String[] args) {
		int output =sortSum(10,10); //11  -> 20  // 3,5  -> 8  // 10,10 -> 20
		System.out.println(output);
	}
	public static int sortSum(int x, int y){

		int result = x +y;
		if(result>=10 && result <=19){
			result =20;
		}
		return result;
	}

}
