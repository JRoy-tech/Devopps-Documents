
public class WrapperClass {

	public static void main(String[] args) {

		int i = 10; // single value container

		Integer iref = new Integer(i);// boxed (constructing the object)

		int j = iref.intValue(); // unboxing(Extacting the value from object)

		Integer kRef = i; // autoboxing (integer kref = new integer(i);

		int l = kRef; // autoboxing

		// oops ->objects ! you can also pass by reference the orimitives

	}

}
