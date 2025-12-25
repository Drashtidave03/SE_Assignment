package core;
final class ABC{
	final int i=12;
	final public void change() {
//		i++;
		System.out.println(i);
	}
}
class ABCCall extends ABC{
	public void change() {
//		i++;
		System.out.println(i);
	}
}


public class P019_Final {
	public static void main(String[] args) {
		ABC a = new ABC();
		a.change();
		
		ABCCall a1 =new ABCCall();
		a.change();
	}
}
