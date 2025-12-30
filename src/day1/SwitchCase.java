package day1;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		int num1=20;
		int num2=30;
		String Operator ="*";
		
		switch(Operator) {
		
		case "+" : System.out.println(num1 + num2);
		break;
		
		case "-" : System.out.println(num1 - num2);
		break;
		case "*" : System.out.println(num1 * num2);
		break;
		default : System.out.println("Error");
		
		
		}
		
		
		
		

}
}