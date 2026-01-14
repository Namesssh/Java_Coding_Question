package test_java;

public class Factorial_of_any_number {

	public static void main(String[] args) {
		int m=7;
		int fact=1;
		
		for(int i=1;i<=m;i++) {
			fact =fact*i;
			System.out.println(fact);//this tells the sol loop wise
		}
		
		System.out.print("factoral of n is: " + fact);//gives the overall sol
		
	}

}
