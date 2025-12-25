package core;

class Employee {
	static {
		System.out.println("static block in employee class");
	}
	int id;
	String name;
	String address;
	double salary;
	static String cname = "XYZ";

	public Employee(int id, String name, String address, double salary) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public void showData() {
		System.out.println("id : " + id + " name : " + name + " address : " + address + " salary : " + salary+" c name : "+cname);
	}
	
	public static void call() {
		System.out.println("call in employee class : "+cname);
	}
}

public class P016_Static {
	static {
		System.out.println("static block in main class");
	}
	public static void main(String[] args) {
		System.out.println("main mehtod");
		Employee e1 = new Employee(1, "java", "ahmedabad", 5000.3630);
		Employee e2 = new Employee(2, "python", "ahmedabad", 5000.3630);
		Employee e3 = new Employee(3, "php", "ahmedabad", 5000.3630);
		
		e1.showData();
		e2.showData();
		e3.showData();
		
		Employee.call();
	}
}
