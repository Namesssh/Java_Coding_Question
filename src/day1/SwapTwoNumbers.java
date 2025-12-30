package day1;

public class SwapTwoNumbers {

	public static void main(String[] args) {
	int a= 10;
	int b=20;
	System.out.println("a=" +a);
	System.out.println("b="+b);
	//a=20,b=10
	int temp;
	//initialze any one with temp so that one can stored in temp
	temp=a;
	a=b;
	b=temp;
	System.out.println("a=" +a);
	System.out.println("b="+b);
	
			
	//second method
	int a1=10;
	int b1=20;
	a1=a1+b1;
	b1=a1-b1;
	a1=a1-b1;
	
	
	System.out.println("a=" +a);
	System.out.println("b="+b);
			
	
	
	
	
	
	
	}
	
}
