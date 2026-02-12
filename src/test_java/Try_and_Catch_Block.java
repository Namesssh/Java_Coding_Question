package test_java;

import java.util.Scanner;

public class Try_and_Catch_Block {
//string carry space but number doest carry space when enter
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		String name;
		//int age=0 default value
		//String name=null; default value		
		try {
		System.out.println("Enter your Age");	
			age =sc.nextInt();
			
		}catch(Exception e) {
			System.out.println("Enter your age again");
			sc.nextLine();
			age=sc.nextInt();
			//integer and string ke beech mei sc.nextline ka use 		
		}
		try {
			sc.nextLine();	
		System.out.println("Enter Your Name");
		//sc.nextLine();
	    name=sc.nextLine();
		}catch(Exception e) {

			System.out.println("Enter your Name again");
			sc.nextLine();
			name=sc.nextLine();			
		}
		System.out.println(age);
		System.out.println(name);
	}

}
