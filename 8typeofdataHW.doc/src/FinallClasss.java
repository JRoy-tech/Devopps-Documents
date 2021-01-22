
public class FinallClasss {
	
	static int methodone(int i)
	{
		
		return methodone(i*=11);
	}
	static int methodtwo(int i)
	{
		
		return methodtwo(i/=11);
	}
	public static void main(String[] args) {
		
	int res=	methodone(11);
		System.out.println(res);

	}
}