package day1;

import java.util.Scanner;

public class Scannerclass1 {

	public static void main(String[] args) {
//age
		//name
		//address
		//phone number
		//email
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Age");
		int age =sc.nextInt();
		sc.nextLine();
		System.out.print("Enter your Name");
		String name =sc.nextLine();
		System.out.print("Enter your Address");
		String address = sc.nextLine();
		System.out.print("Enter your phonenumber");
		int phoneno = sc.nextInt();
		
		
		System.out.println("age is" + age);
		System.out.println("name is" + name);
		System.out.println("address is" + address);
		System.out.println("Phonenumber is" + phoneno);
		
		
		

	}

}
