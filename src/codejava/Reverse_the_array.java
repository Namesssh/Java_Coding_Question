package codejava;

public class Reverse_the_array {

	public static void main(String[] args) {
	 int num[]= {34,36,78,98,45,23};
	 int start=0;
	 int end=num.length-1;
	 
	 for(int i=0;i<=num.length-1;i++) {
		 System.out.print(num[i]+ " ");
		 
	 }
	 System.out.println();
	 while (start<end) {
		 int temp=num[start];
		 num[start]=num[end];
		 num[end]=temp;
		
		 
		 start++;
		 end--;
	 
	 
	 }
	 
	 for(int i=0;i<=num.length-1;i++) {
		 System.out.print(num[i]+ " ");
	 }
	}

}
