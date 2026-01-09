package codejava;

public class stringoccu {

	public static void main(String[] args) {
		String s = "NameshJoshiHaldwaniNameshJoshi";
		
		for(int i=0;i<s.length();i++){	    
		char c = s.charAt(i);
		int count =0;
		
		
		
		for(int j=0;j<s.length();j++){
		    
		    if(s.charAt(j)==c){
		    	count++;
		}
		
		}
		
		
		System.out.print(count);
	}

	}

}
