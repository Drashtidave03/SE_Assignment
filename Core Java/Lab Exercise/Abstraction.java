package core;

abstract class RBI {
	public abstract void interest(); // declaration

	public abstract void HL();

	public static void repoRate() {
		System.out.println("+-4%");
	}

	public void call() {
		System.out.println("static method in abstract RBI class");
	}
}

class SBI extends RBI {

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("SBI interest : 3.5%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("SBI HL : 7%");
	}

}

class JAVA extends RBI {

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("JAVA interest : 4%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("JAVA HL : 8%");
	}

}

public class P017_Abstraction {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.interest();
		s.HL();
		s.call();
		JAVA j = new JAVA();
		j.interest();
		j.HL();
		j.call();
		SBI.repoRate();
		JAVA.repoRate();
		
	}
}
