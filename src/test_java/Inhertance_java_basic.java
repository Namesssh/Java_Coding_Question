package test_java;
class Personal{
	void Personaldetails(String name, String Address, long Phoneno) {
		System.out.println(name);
		System.out.println(Address);
		System.out.println(Phoneno);	
	}	
}

class Professional extends Personal{
	void Professionaldetails(String Designation,float Salary,String OfficeAddress) {
		System.out.println(Designation);
		System.out.println(Salary);
		System.out.println(OfficeAddress);		
	}	
}
public class Inhertance_java_basic {
	public static void main(String[] args) {
		Professional po = new Professional();
		po.Personaldetails("NameshJoshi", "Haldwani", 7078369066L);
		po.Professionaldetails("QA Automation", 1400000, "Noida");
	}
}
