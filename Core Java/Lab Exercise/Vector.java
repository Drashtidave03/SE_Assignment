package core;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class P027_Vector {
	public static void main(String[] args) {
		Vector vr = new Vector();

		vr.add(12);
		vr.add("java");
		vr.add('h');
		vr.add(234555675);
		vr.add(45.45);
		vr.add(false);
		vr.add(12);
		System.out.println(vr);

		Enumeration em = vr.elements();
		while (em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
	}
}
