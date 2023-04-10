package setExample;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		//Set<Integer> set=new HashSet<>();
		Set<Integer> set=new TreeSet<>(Comparator.reverseOrder());

		set.add(10);
		set.add(20);
		set.add(5);
		set.add(15);
		set.add(10);
		System.out.println(set);

	}

}
