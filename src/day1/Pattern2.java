package day1;

public class Pattern2 {
	public static void main(String[] args) {
	for(int i=1;i<=7;i++) {
		for(int j=1;j<=4;j++) {
			
            if  (j == 1 || j == 4) {
            	System.out.print("*");
            } else if(j==2){
            	System.out.print("-");
            }
            else {
            	System.out.print("+");
            }
		}
		
		System.out.println();
		
	}

}
	
}
