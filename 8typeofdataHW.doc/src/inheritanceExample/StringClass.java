package inheritanceExample;

public class StringClass {

	public static void main(String[] args) {
		String st = "we are learning java";
		String st1 ="we";
		int res = st.length();
		System.out.println(res);
		
		for (int i = 0; i < res; i++) {
			System.out.print(st.charAt(i));
			
//			String res1 = st.substring(0, 5);
//			System.out.println(res1);
//		boolean res2 =st.equals(st1);
//		System.out.println(res2);
		}
	}

}
