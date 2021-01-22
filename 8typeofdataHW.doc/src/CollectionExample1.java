
//creating arraylist,adding,removing list

import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;

public class CollectionExample1 {

	public static void main(String[] args) {
		// angle baget means geniric type/creat object
		List<String> list = new ArrayList<String>();
		list.add("10");// calling add method,adding list
		list.add("20");
		list.add("30");
		list.add("40");
		list.add("50");
		System.out.println(list);
		int result = list.size();// calling size method & chake size of list
		System.out.println(result);
		list.add("100");// againg adding number on list
		list.add("200");
		list.add("300");
		list.add("400");
		list.add("500");
		System.out.println(list);
		Iterator it = list.iterator();// iterator create object
		while (it.hasNext()) {// iterator have 2 method here hasnest/next
			if (it.next() == "200")
				it.remove();// calling remove method to remove number 200
			System.out.println(list);
		}

	}

}
