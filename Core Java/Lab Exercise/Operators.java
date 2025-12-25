package core;

public class P002_Operators {
	public static void main(String[] args) {
		// 1.Assignment -> = , += , -= , *= , /=
		int a = 2;
		a += 12; // a= a+12
		System.out.println("a  = " + a);
		int b = 34;

		a += b; // a =a+b
		System.out.println("a = " + a);

		a -= 10;
		System.out.println("a = " + a);

		a *= 3;
		System.out.println("a = " + a);

		// 2.Arithmetic -> +,-,*,/,%
		System.out.println(1 + 2);
		System.out.println(1 - 2);
		System.out.println(1 * 2);
		System.out.println(1 / 2);
		System.out.println(10 % 3);
		
		//conditional ->  > ,>= ,< ,<= , ==
		System.out.println(10>9);//true
		System.out.println(10>=9);//true
		System.out.println(10<9);//false
		System.out.println(10<=10);//true
		System.out.println(10==10);
		
		//unary -> ++,--
		
		int i =12;
		i++; // i = i+1
	
		System.out.println(i);//13
		
		
		//i++ -> post increment
		//++i -> pre
		int j = i++;
		System.out.println("j = "+j);
		System.out.println("i = "+i);
		
		
		//logical -> &&, ||, !
		
	}
}
