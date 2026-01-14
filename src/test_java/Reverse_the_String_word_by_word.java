package test_java;

public class Reverse_the_String_word_by_word {

	public static void main(String[] args) {
		String str = "Java Automation test";
		String rev[] =str.split(" ") ;//for word by word we need to use string.split function
			
		for(int i=rev.length-1;i>=0;i--) {
			
			System.out.print(rev[i] + " ");
			
		}

	}

}
