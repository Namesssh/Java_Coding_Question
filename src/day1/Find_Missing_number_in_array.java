package day1;

public class Find_Missing_number_in_array {

	public static void main(String[] args) {
		
		
		//we have some range means start and end
		int arr[]= {1,2,4,5,6};
		int totalnum=6;
		int sumofallnumber=(totalnum*(totalnum+1))/2;
		System.out.println(sumofallnumber);
		int sum=0;
		for(int i =0;i<arr.length;i++) {
			
			sum =sum+arr[i];	
		}
		System.out.println(sum);
		System.out.println("The missing Number is "+ (sumofallnumber-sum));
		
	}
	

}
