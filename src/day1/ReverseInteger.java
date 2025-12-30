
package day1;

public class ReverseInteger {
	
	
	public static void main(String[] args) {
		//input=123 output=321
		//if we divide tb tk jb tk quotient 0 na ho jaye
		
		
	int num=-123;
	int rev=0;
	int lastdigit;
		
		while(num!=0) {
			
			lastdigit = num%10;//give last digit
			rev=rev*10+lastdigit;//rev bana rahe hai
			num=num/10;
			
		}
		
System.out.println(rev);
		
		
	}

}

