package core;

import java.util.Scanner;

public class P010_Array {
	public static void main(String[] args) {
//		int a = 1, b = 2, c = 3, d = 4, e = 5, f = 6;
		int b = 13;
		System.out.println(b);
		int a[] = { 123, 542, 4563, 454, 455, 645, 74354, 845, 945, 1450 };

		for (int index = 0; index < a.length; index++) {
			System.out.println("value at array index : " + index + " is " + a[index]);
		}

		System.out.println("enter size of array : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int ar[] = new int[size];

		for (int index = 0; index < ar.length; index++) {
			System.out.print("enter element at a[" + index + "] : ");
			ar[index] = sc.nextInt();
		}

		System.out.println("======= final array =======");
		for (int index = 0; index < ar.length; index++) {
			System.out.println("enter element at a[" + index + "] : " + ar[index]);
		}

		System.out.println("summation of array ");
		int sum = 0;
		for (int index = 0; index < ar.length; index++) {
			System.out.println(sum);
			sum = sum + ar[index];
		}

		System.out.println("search operation =====");
		System.out.println("enter number to search in array : ");
		int num = sc.nextInt();
		
		int counter = 0;
		for (int index = 0; index < ar.length; index++) {
			if (num == ar[index]) {
				counter++;
			}
		}
		
		if(counter>0) {
			System.out.println("yes exist "+counter+" times");
		}
		else {
			System.out.println("not exist");
		}

	}
}
