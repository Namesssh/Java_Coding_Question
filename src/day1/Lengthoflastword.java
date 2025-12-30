package day1;

public class Lengthoflastword {

	public static void main(String[] args) {
	
		String s="    Hello   World  ";
		s=s.trim();
		System.out.println(s);
		int count =0;
		char inputarray[]=s.toCharArray();
		for(int i= inputarray.length-1;i>=0;i--) {
			
			if(inputarray[i]!= ' ') {
				count =count+1;
				
			}else {
				if(count >0) {
					System.out.println(count);
					break;
					
				}
			}
			
			
			
		}
		
		
		

	}

}
