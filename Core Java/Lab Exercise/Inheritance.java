package core;
//1.single
class A {
	A(){
		System.out.println("class A : default cons");
	}
	public void classA() {
		System.out.println("class A function");
	}
}
class B extends A{
	public void classB() {
		System.out.println("class B function");
	}
}

//2.multilevel
class C extends B{
	public void classC() {
		System.out.println("class C function");
	}
}

//3.hierarchical
class D extends A{
	public void classD() {
		System.out.println("class D function");
	}
}
public class P014_Inheritance {
	public static void main(String[] args) {
		A a = new A();
		a.classA();
		
		B b = new B();
		b.classA();
		b.classB();
		
		C c= new C();
		c.classA();
		c.classB();
		c.classC();
	}
}
