import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<Integer, String>();
		// add key-value pair to hashmap
		mp.put(1, "jhalak");
		mp.put(2, "tanjil");
		mp.put(3, "choti");
		mp.put(4, "zonayed");
		mp.put(5, "omar");
		System.out.println(mp);
		// getting value for the given key from hashmap
		// System.out.println("value of second :" +mp.get(2));
		String res = mp.get(3);
		System.out.println(res);
		// System.out.println("Is HashMap empty?" + mp.isEmpty());
		boolean result = mp.isEmpty();
		System.out.println(result);
		mp.remove(3);
		System.out.println(mp);
		System.out.println("Size of the Hashmap:" + mp.size());

		Set<Integer> keys = mp.keySet();
		for (Integer key: keys){
			System.out.println("value of "+key+ "is"    +mp.get(key));
			
		}
	}

}
