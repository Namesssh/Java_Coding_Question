package test_java;
class Encap {
	public int age = 25;
	private String name = "Namesh";

	void setname(String nam) {
		if (age >= 25) {
			name = nam;
		}
	}
	String getname() {
		return name;
	}
}
public class Encapsulation {
	public static void main(String[] args) {

		Encap encap = new Encap();
		encap.setname("chandra");
		System.out.println(encap.getname());

	}
}
