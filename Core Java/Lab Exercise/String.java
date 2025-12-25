package core;

public class P012_String {
	public static void main(String[] args) {
		char c[] = {'J','A','V','A'};
		
		String s = new String("j");
		System.out.println(s);
		
		System.out.println(c);
		String c1 = "java";
		System.out.println(c1);
		
		String name = "hello users 3465$^&&";
		System.out.println(name.length());
		
		System.out.println(name.charAt(10));
		
		String s1 = "java";
		System.out.println("upper case : "+s1.toUpperCase());
		String s2 = "JAVA";
		
		System.out.println(s1.concat(s2));
		System.out.println(s1);
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		
		String s3 = "      java       ";
		System.out.println(s3);
		System.out.println(s3.trim());
		
		String s4 = " ";
		System.out.println(s4.isBlank());
		System.out.println(s4.isEmpty());
	}
}
