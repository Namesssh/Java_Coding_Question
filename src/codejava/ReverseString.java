package codejava;

public class ReverseString {
	
	public static void main(String[] args) {
		
		
		String Input ="SDET";
		String Reverse="";//to store
		
		for(int i=Input.length()-1;i>=0;i--) {			
			Reverse =Reverse+Input.charAt(i);
			
			
		}
		System.out.println(Reverse);
	}

}
