package core;

class User {
	User() {
		System.out.println("defualt cons");
	}

	User(int i) {
		System.out.println("int i = " + i);
	}
	
	User(double i,int j,boolean flag) {
		System.out.println("double i = " + i+" : int j = "+j+" : flag = "+flag);
	}
	
	public void call() {
		System.out.println("call function in user class");
	}
}

class User1{
	User1(User u){
		System.out.println("user 1 copy cons : "+u);
	}
}

public class P011_Constructor {
	public static void main(String[] args) {
		User u1 = new User();
		u1.call();
		
		User u2 = new User(12.46,98,true);
		
		User1 u3 = new User1(u1);

	}
}
