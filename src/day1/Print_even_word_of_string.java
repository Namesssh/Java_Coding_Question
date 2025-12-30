package day1;

public class Print_even_word_of_string {

	public static void main(String[] args) {
		String str = "My name is Namesh Joshi";		
		String input[] =str.split(" ");//split the words
		//System.out.println(input[0]);
		
		for(String word:input) {
		int size = word.length();
		if(size%2==0) {
			System.out.println(word);
		}
//		else {
//			
//			System.out.println("odd");
		}
		
		
		

	}

}
