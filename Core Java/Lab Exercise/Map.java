package core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P029_Map {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "c");// entry
		map.put("c++", 2);
		map.put(false, 'a');
		map.put(4325.354, "java");
		map.put(1, "dart");
		map.put(null, true);
		System.out.println(map);

		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
//			System.out.println(itr.next());
			Map.Entry entry = (Entry) itr.next();
			System.out.println("Key : " + entry.getKey());
			System.out.println("Value : " + entry.getValue());
		}

	}
}
