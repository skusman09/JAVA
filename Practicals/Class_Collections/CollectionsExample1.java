// Class Example / Sir Example

package Class_Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class CollectionsExample1 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();

		list.add(34);
		list.add(35);
		list.add(14);
		list.add(456);
		list.add(123);

		Collections.sort(list);
		System.out.println(list);

		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);

		int index = Collections.binarySearch(list, Integer.valueOf(123));
		System.out.println(index);

		Collections.reverse(list);
		System.out.println(list);

		Collections.shuffle(list);
		System.out.println(list);

		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list));
		System.out.println(Collections.frequency(list, 34));

		LinkedList<Integer> newList = new LinkedList<>();
		Collections.copy(newList, list);
		System.out.println(newList);

		Collections.addAll(list, 11, 12, 13, 14, 15);
		System.out.println(list);

		Collections.swap(list, 0, 1);
		System.out.println(list);

	}

}
