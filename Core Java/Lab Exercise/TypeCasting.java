package core;

public class P004_TypeCasting {
	public static void main(String[] args) {
		// 1.implicit
		// 2.explicit

//		byte b = 12;//1
//		int i = b;//4
//		System.out.println(i);
//		
//		int i1 =12657587;
//		byte b1 = (byte)i1;
//		

		int i = (int)1.56;//4
		System.out.println(i);
		double d = i;//8
		System.out.println("d = " + d);
		
		int a1 = 10;
		int b1 = 3;
		double c1 = (double)a1 / (double)b1;
		System.out.println("c = " + c1);

	}
}
