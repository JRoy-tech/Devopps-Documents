import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		// add elements to hashset
		// there is no order system,set doesnt allow duplicate elements
		hs.add("first");
		hs.add("second");
		hs.add("third");
		hs.add("fourth");
		hs.add("five");
		// hs.add("first");try to add duplicate element.
		System.out.println(hs);
		// calling size method & chaek size of hs
		// System.out.println("Is HashSet empty?" +hs.size());
		int res = hs.size();
		System.out.println(res);
		// System.out.println("Does HashSet contains first element?" +
		// hs.contains(res));
		hs.contains(res);
		System.out.println(res);
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
