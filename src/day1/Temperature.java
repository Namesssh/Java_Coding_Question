package day1;

public class Temperature {

	public static void main(String[] args) {
	 int Temperature = 10;
	 int Weather = 1; //if sunny than its 1 otherwise cloudy
	 
	 
	 if(Temperature < 8 && Weather ==0) {
	        if (Temperature <8 && Weather ==1) {
	        	if(Temperature > 10 && Weather == 0) {
	        		if(Temperature >10 && Weather == 1) {
	        			
	        		}else {
	        			System.out.println("cold day in evening but normal at afternoon");
	        		}
	        	}else {
	        		System.out.println("Cold day but adjustable");
	        	}
	        }else {
	        	System.out.println("Normal Day");
	        }
		 
	 }else {
		 System.out.println("Cold Day");
	 }
	 }
	 
	 

	}


