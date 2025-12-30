package methods;

import java.util.Scanner;

public class Calcultorusingscnannerclass {

	static void calculator() {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter value of a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=a+b;
		int sub=a-b;
		System.out.println("sum of a and b is "+ sum);
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		calculator();

	}

}
