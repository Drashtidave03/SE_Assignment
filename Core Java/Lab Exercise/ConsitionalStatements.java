package core;

public class P005_ConsitionalStatements {
	public static void main(String[] args) {
		// 1.Simple if
		int a = 12;
		int b1 = 12;
		if (a > 10) {
			System.out.println("a is greater than 10");
		}

		if (a == b1) {
			System.out.println("a and b are same");
		}

		// 2.if else
		int b = 12;
		if (b < 10) {
			System.out.println("b is less than 10");
		} else {
			System.out.println("b is greater than 10");
		}

		// 3.nested if
		int age = 45;
		if (age > 18) {
			System.out.println("yes age is greater than 18");
			if (age < 55) {

				System.out.println("you are eligible");
			} else {
				System.out.println("age is greater than 18 but not less than 55");
			}
		}

		else {
			System.out.println("age is less than 18");
		}

		// 4.else if ladder
		int m = 88;
		if (m < 35) {
			System.out.println("fail");
		} else if (m >= 35 && m <= 60) {
			System.out.println("D grade");
		} else if (m >= 61 && m <= 70) {
			System.out.println("C grade");
		} else if (m >= 71 && m <= 80) {
			System.out.println("B grade");
		} else if (m >= 81 && m <= 90) {
			System.out.println("A grade");
		} else if (m >= 91 && m <= 100) {
			System.out.println("A+ grade");
		} else {
			System.out.println("invalid input");
		}

		// 5.switch case
		System.out.println("1.English 2. Hindi 3.Gujarati");
		int choice = 1;
		switch (choice) {
		case 1:
			System.out.println("you selected english");
			break;
		case 2:
			System.out.println("you selected hindi");
			break;

		case 3:
			System.out.println("you selected gujarati");
			break;

		default:
			System.out.println("invalid input");
		}

	}
}
