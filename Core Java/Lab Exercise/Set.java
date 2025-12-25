package core;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class P028_Set {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(12);
		set.add("java");
		set.add(435.34);
		set.add(false);
		set.add(3466747457l);
		set.add(4365.47f);
		set.add(12);
		System.out.println(set);

		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
