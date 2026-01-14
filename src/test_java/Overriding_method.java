package test_java;
class div_multi{	
void division(int a, int b) {
		System.out.println(a/b);		
	}
	
void division(int a, double b) {
	System.out.println(a/b);
	
}		
void division(double a, double b) {
	System.out.println(a/b);	
}

void multiply(int a, int b) {
	System.out.println(a*b);
	
}
void multiply(double a, double b) {
	System.out.println(a*b);
	
}
void multiply(int a, double b) {
	System.out.println(a*b);
}

void multiply(int a, int b, double c) {
	System.out.println(a*b*c);

}
}

public class Overriding_method {	
	public static void main(String[] args) {
		
		div_multi dv = new div_multi();//object
		dv.division(2.5, 3.5);//calling method
		dv.multiply(4,6);
		dv.multiply(2,5,5.5);
		dv.division(20, 10);		
	}
}
