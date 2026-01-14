package test_java;

public class Shorting_of_Array {

	public static void main(String[] args) {
		
		int[]array = {30,45,1,23,67,89,78,43};	
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				
				if(array[i]>array[j]) {
					int temp = array[i];
					array[i]=array[j];
					array[j]=temp;				
				}			
			}
			System.out.print(array[i]+ " ");
		}
		

	}

}
