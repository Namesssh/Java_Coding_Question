package codejava;

public class Second_largest_number {

	public static void main(String[] args) {
 
		int a[]= {1,2,3,5,48,49};
		//a[0]=1   a[i]
		//a[1]=2
		//a[2]=3
		//a[3]=5
		//a[4]=6
		//a[5]=7
		int highest = 0;//initialize
		int secondhighest=0;
		//System.out.println(a.length);
		for(int i=0;i<=a.length-1;i++) {
			//a[0]=1
			//a[1]=2
			//a[2]=3
			//a[3]=5
			//a[4]=6
			//a[5]=7
			if(a[i]>highest) {
				//1>0
				//2>1
				//3>2
				//5>3
				//6>5
				//7>6
				secondhighest=highest; // secondhig=0 ,secondhig=1 ,secn=2,secon=3,second=5,second=6
				
				highest= a[i];	//high=1//high=2 ,higi=3,high=5,high=6,high=7
			}
			else if (a[i]>secondhighest && a[i]<highest) {
				secondhighest=a[i];
			}			
		}
		System.out.println(secondhighest);

	}

}
