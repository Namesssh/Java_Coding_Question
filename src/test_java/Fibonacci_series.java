package test_java;

import java.util.Scanner;

public class Fibonacci_series {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth Number which you want");
		n = sc.nextInt();
		int a = 0;// first
		int b = 1;// second

		for (int i = 1; i <= n; i++) {
			System.out.println(a);
			int c = a + b;
			a = b;
			b = c;
			
		}
	}

}
