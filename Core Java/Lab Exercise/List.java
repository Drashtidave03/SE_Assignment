package core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Laptop {
	private int ram;
	private String model;
	private double price;

	public Laptop() {
		super();
	}

	public Laptop(int ram, String model, double price) {
		super();
		this.ram = ram;
		this.model = model;
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", model=" + model + ", price=" + price + "]";
	}

}

public class P026_List {
	// <generics>
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(12);
		list.add("java");
		list.add(45.45);
		list.add(false);
		list.add('f');
		list.add(3464564565465l);
		list.add(12);
		System.out.println(list);
		list.add(435);
		System.out.println(list);
		list.remove(3);
		System.out.println(list);

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Laptop l1 = new Laptop(12, "dell", 87450);
		Laptop l2 = new Laptop(8, "hp", 87450);
		Laptop l3 = new Laptop(10, "lenovo", 87450);
		Laptop l4 = new Laptop(16, "asus", 87450);
		
		List<Laptop> laptopList = new ArrayList<Laptop>();
		laptopList.add(l1);
		laptopList.add(l2);
		laptopList.add(l3);
		laptopList.add(l4);
		
		for(Laptop l:laptopList) {
			System.out.println(l);
		}
	}
}
