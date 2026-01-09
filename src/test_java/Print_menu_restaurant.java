package test_java;

import java.util.Scanner;

public class Print_menu_restaurant {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day: ");
		String day =sc.nextLine();
		
		
		switch(day){
		
		case "Monday" :{
			
			System.out.println("Today Menu: Dosa,Idli,Vada");	
		}break;
		
		case "Tuesday":{
			System.out.println("Rice,Rajma,kadi");
		}break;
	
		case "Wednesday":{
				
		System.out.println("Panner,Rice,roti");	
		
		}break;
		case "Thursday":{
			
			System.out.println("pasta,maggie,burger,pizza");	
			
			}break;
		
		case "Friday":{
			
			System.out.println("Mix veg,dalmakhni");	
			
			}break;
		}
		}
		
}
		
		
