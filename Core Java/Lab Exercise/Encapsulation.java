package core;

class Student {
	private int id;
	private String name;
	private double per;
	private long contact;

	Student() {

	}

	Student(int id, String name, double per, long contact) {
		this.id = id;
		this.name = name;
		this.per = per;
		this.contact = contact;
	}

	public void setId(int id) {
		System.out.println("id in set functions : " + id);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPer(double per) {
		this.per = per;
	}

	public double getPer() {
		return per;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public long getContact() {
		return contact;
	}

//	public void showData() {
//		System.out.println("id : " + id + " name : " + name + " per : " + per + " contact : " + contact);
//	}

	@Override
	public String toString() {
		return "id : " + id + " name : " + name + " per : " + per + " contact : " + contact;
	}
}

public class P018_Encapsulation {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(13);
		s.setName("JAVA");
		s.setPer(36.21);
		s.setContact(987654321);
//		s.showData();
		System.out.println(s);

		Student s1 = new Student(1, "python", 78.32, 456789321);
//		s1.showData();
//		s1.id = 12;
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getPer());
		System.out.println(s1.getContact());

		System.out.println(s1);
	}
}
