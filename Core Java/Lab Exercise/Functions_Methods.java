package core;
class Methods{
	//without return type without parameter
	public void abc() {
		System.out.println("abc method");
	}
//	without return type with parameter
	
	public void call(double i) {
		System.out.println("i = "+i);
	}
//	with return type without parameter
	public int  calling() {
		System.out.println("with return type without parameter");
		return 13;
	}
//	with return type with parameter
	public int getSquare(int i) {
		return i*i;
	}
}
public class P008_Functions_Methods {

	public static void showData() {
		System.out.println("show data method");
	}
	public static void main(String[] args) {
		showData();
		System.out.println("main method");
		
		Methods m = new Methods();
		m.abc();
		m.call(12);
		
		int flag = m.calling();
		System.out.println(flag);
		
	 	int res = m.getSquare(5);
	 	System.out.println(res);
	}
}
