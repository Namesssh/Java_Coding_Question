package codejava;

import java.util.Scanner;

public class Sum_of_naturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Natural Number");
		int naturalno =sc.nextInt();
		int sum =0;
		for(int i =0;i<=naturalno;i++) {
			sum =sum+i;		
		}
		
		System.out.print(sum + " sum is ");	
	}

}
