package codejava;

public class Array_is_sorted_increasing_ORDER {

	public static void main(String[] args) {
		 int array[]= {2,45,1,35,67,48};
		 
		 
		 for(int i=0;i<array.length;i++) {
			 for(int j=i+1;j<array.length;j++) {
				 if(array[i]>array[j]) {
					 int temp =array[i];
					 array[i]=array[j];					 
					 array[j]= temp;					 
					 
				 }
				 
				 
			 }
			 
		 }		 
		 
for(int i=0;i<array.length;i++) {
	System.out.print(array[i]+ " ");
}
	}

}
