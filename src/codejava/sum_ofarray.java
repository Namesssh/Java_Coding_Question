package codejava;

public class sum_ofarray {
	
	public static void main(String[] args) {
		
		
		
		int array[]= {24,35,57,67};
		int sum =0;
		for(int i=0;i<array.length;i++) {
			sum =sum+array[i];	
			
			
		}		
		double average = (double) sum/array.length;		
		System.out.println("sum is " + sum); 
		System.out.println("Average is "+ average);
	}

}
