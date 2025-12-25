package core;

interface inter1 {
	public void interface1Method();

	public static void staticInterface1() {
		System.out.println("static interface 1");
	}

}

interface inter2 extends inter1 {
	public void interface2Method();

	public static void staticInterface2() {
		System.out.println("static interface 2");
	}
}

interface inter3 {
	public void interface3Method();

	public static void staticInterface3() {
		System.out.println("static interface 3");
	}
}

class InterfaceCall implements inter2, inter3 {

	@Override
	public void interface1Method() {
		// TODO Auto-generated method stub
		System.out.println("interface 1");
	}

	@Override
	public void interface3Method() {
		// TODO Auto-generated method stub
		System.out.println("interface 3");
	}

	@Override
	public void interface2Method() {
		// TODO Auto-generated method stub
		System.out.println("interface 2");
	}
}

public class P020_Interface {
	public static void main(String[] args) {
		InterfaceCall i = new InterfaceCall();
		i.interface1Method();
		i.interface2Method();
		i.interface3Method();

		inter1.staticInterface1();
		inter2.staticInterface2();
		inter3.staticInterface3();
	}
}
