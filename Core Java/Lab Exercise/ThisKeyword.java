package core;

class Userr{
	int id;
	String name;
	String address;
	long contact;
	Userr(int id,String name,String address,long contact){
		System.out.println("cons  : id : "+id+" name : "+name+" address : "+address+" contact : "+contact);
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
	}
	
	public void showData() {
		System.out.println("functions :  id : "+id+" name : "+name+" address : "+address+" contact : "+contact);
	}
}
public class P013_ThisKeyword {
	public static void main(String[] args) {
		Userr u = new Userr(1,"JAVA","ahmedabad",9876543210l);
		u.showData();
	}
}
