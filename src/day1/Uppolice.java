package day1;

public class Uppolice {
	public static void main(String[] args) {
		
	int WrittenExam =1;//if clear exam than 1 otherwise 0
	int Physical =0;//if clear physical than 1 otherwise 0
	int Medical =0;//if clear medical than 1 otherwise 0
	
	if(WrittenExam == 1) {
		if(Physical == 1) {	
			if(Medical == 1) {
				System.out.println("Candidate Got Selected");
			}else {
				System.out.println("Failed in Medical");
			}				
		}else {
			System.out.println("Falied in Physical");
		}		
	}		
	else {
		System.out.println("Failed in Written Exam");
	}
	

		
		
		
		
	}

}
