package core;

class Overload {
	public int add(int a,int b) {
		return a+b;
	}

	public int  add(int a,int b,int c) {
		return a+b+c;
	}

	public int add(int i,int j,int k, int l) {
		return i+j+k+l;
	}
}

class Parent{
	public void show() {
		System.out.println("show method in Parent class");
	}
	public void call() {
		System.out.println("call in parent");
	}
}
class Child extends Parent{
	public void show() {
		super.show();
		System.out.println("show method in Child class");
	}
//	public void call() {
//		System.out.println("call in child");
//	}
}

public class P015_Polymorphism {
	public static void main(String[] args) {
		Overload o = new Overload();
		int res = o.add(1, 2);
		System.out.println(res);
		
		int res1 = o.add(12, 34, 354);
		System.out.println(res1);
		
		Child c = new Child();
		c.show();
		c.call();
	}
}
