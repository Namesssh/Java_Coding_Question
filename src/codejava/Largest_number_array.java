

package codejava;

public class Largest_number_array {
	
	
	public static void main(String[] args) {
		
		int array[]= {21,23,45,76};
		int largest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

		System.out.println(largest);
		
	}

}
