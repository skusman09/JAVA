package mapExample;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		
		//Map<Integer,String> map=new HashMap<>();
		Map<Integer,String> map=new TreeMap<>();
		Map<Integer,String> map1=new HashMap<>();
		map.put(91, "India");
		map.put(92, "Pak");
		map.put(93, "Sri Lanka");
		map.put(94, "Germany");
		map.put(95, "USA");
		System.out.println(map);
		map1.putIfAbsent(96, "UAE");
		map1.put(91, "India");
		map1.put(92, "Pak");
		map1.put(93, "Sri Lanka");
		map1.put(94, "Germany");
		map1.put(95, "USA");
		System.out.println(map1);
		System.out.println(map1.size());
		System.out.println(map.size());


	}

}
