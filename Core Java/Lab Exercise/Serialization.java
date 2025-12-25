package core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	private int id;
	private String name;
	private double salary;
	private String address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}

}

public class P024_Serialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		Employee e = new Employee(1, "java", 987654.32, "ahmedabad");

//		FileOutputStream fos = new FileOutputStream("emp.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(e);
//		oos.flush();
//		oos.close();
//		fos.close();
//		System.out.println("data written");

		FileInputStream fis = new FileInputStream("emp.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		int i = ois.available();
		System.out.println(i);
		
		Employee e1 = (Employee) ois.readObject();
		System.out.println(e1);

		ois.close();
		fis.close();
	}
}
