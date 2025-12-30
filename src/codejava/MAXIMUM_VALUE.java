package codejava;

public class MAXIMUM_VALUE {

	public static void main(String[] args) {
	
		int array[]= {3,2,9,5,6,71};
		int max=array[0];//assume as first is minimum
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
			
		}
		System.out.println(max);
		
		

	}

}
