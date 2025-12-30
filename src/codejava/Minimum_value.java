package codejava;

public class Minimum_value {

	public static void main(String[] args) {
		int array[]= {3,2,9,5,6,71};
		int min=array[0];//assume as first is minimum
		for(int i=0;i<array.length;i++) {
			if(min>array[i]) {
				min=array[i];
			}
			
		}
		System.out.println(min);
		
		

	}

}
