package day1;

public class Find_sum_array {

	public static void main(String[] args) {
		
		int array[]= {21,21,34,45};
		int sum =0;
		for(int i =0; i<=array.length-1;i++) {
			//System.out.println(array[i]);
			sum=sum+array[i];
			
		}
		System.out.println(sum);
		

	}

}
