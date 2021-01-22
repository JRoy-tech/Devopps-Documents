
import java.util.ArrayList;
import java.util.List;

public class CollectiongExample3 {

	public static void main(String[] args) {
		// Declaring ArrayList with generic <type>"Integer type"
		List<Integer> list = new ArrayList<Integer>();
		// Appending the new element at the end of the list
		for (int i = 1; i <= 10; i++)
			list.add(i);
		// printing elements
		System.out.println(list);
		// Remove elements atindex 3
		list.remove(3);
		list.remove(5);
		// Displaying ArrayList after deletion
		System.out.println(list);
		// Printing elements one by one
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i) + " ");

	}

}
