package day1;

public class Pattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=6;i++) {//for rw
			for (int j=1; j <= i; j++) {//for colums
				
				if(j==1 || j==i || i==6) {
					
					System.out.print("*");	
					
				}else {
					System.out.print(" ");	
				}
				
			}
			
			System.out.println();	
		}
		
		
	}
	
}
