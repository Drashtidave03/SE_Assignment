package core;

import java.util.Scanner;

class Call {
	public void data() {
		System.out.println("data function in call class");
	}
}

public class P009_UserInput {
	public static void main(String[] args) {
//		int a = 12;
//		int b = 23;
//		System.out.println(a+b);

		Call c = new Call();
		c.data();

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a = ");
		int a = sc.nextInt();

		System.out.println("enter b = ");
		int b = sc.nextInt();

		System.out.println(a + b);
		
		System.out.println("enter double value = ");
		double d = sc.nextDouble();
		
		System.out.println("d = "+d);

	}
}
