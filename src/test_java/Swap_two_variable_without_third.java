package test_java;

public class Swap_two_variable_without_third {

	public static void main(String[] args) {
		
		
		int a=45;
		int b=30;
		
		System.out.println("value of a is: " +a);
		System.out.println("value of b is: " +b);
		a= a+b; //new a=75
		b=a-b;//new b =75-30=45 so we got b=a here
		a=a-b;//new b=45-75=30 so we got a=b
		
		
		System.out.println("Updated value of a: " +a);
		System.out.println("Updated value of b: " +b);
		

	}

}
