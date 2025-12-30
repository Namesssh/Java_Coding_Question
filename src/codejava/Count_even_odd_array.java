package codejava;

public class Count_even_odd_array {

	public static void main(String[] args) {
		
		int array[]= {23,43,65,78,2,57,87};
		int even=0;
		int odd=0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {//why i have use percent as percent gives remainder and slash give quotient
				System.out.println(array[i]+ " even number ");
				even++;
			}else {
				System.out.println(array[i]+ " odd number ");
				odd++;
			}
			
			
			
		}
		
		System.out.println(" Total even number are " + even);
		System.out.println(" Total odd number are " + odd);

	}

}
