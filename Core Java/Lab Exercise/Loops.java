package core;

public class P006_Loops {
	public static void main(String[] args) {
		//1.for(init;condition;incre/decre){body}
		System.out.println("for loop");
		for(int i=11;i<=10;i++) {
			System.out.println(i);
		}
		
		System.out.println("while loop");
		//2.while(condition){body}
		int j= 11;
		while(j<=10) {
			System.out.println(j);
			j++;
		}
		
		//do{body} while(condition);
		System.out.println("do while loop");
		int k = 11;
		do {
			System.out.println(k);
			k++;
		}
		while(k<=10);
		
	}
}
