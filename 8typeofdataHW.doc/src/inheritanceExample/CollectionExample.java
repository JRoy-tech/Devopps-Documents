package inheritanceExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExample {

	public static void main(String[] args) {
		// List parent
		// Arraylist child

		// angle backed means geniric type,when u need import ctrl + shift + o
		List<String> list = new ArrayList<String>();

		// integer type object , rapper class
		list.add("10");
		list.add("20");
		list.add("30");
		System.out.println(list);
		// size-1
		int res = list.size();

		System.out.println(res);

		list.remove(res - 1);
		System.out.println(list);
		list.add("100");
		list.add("200");
		list.add("300");
		System.out.println(list);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			if (it.next() == "200")

				it.remove();

		}
		System.out.println(list);

	}

}
