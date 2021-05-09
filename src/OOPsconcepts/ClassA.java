package OOPsconcepts;

public class ClassA {
	
	public static int Salary;
	public static String Name;
	protected static String OrgName;
	
	public ClassA() {
		
		System.out.println("Inside constructor");
	}
	public ClassA(int val1, String val2, String val3) {
		System.out.println("Inside Param constructor");
		
		this.Salary = val1;
		this.Name = val2;
		this.OrgName = val3;
	}
	public static void Display() {
		
		System.out.println("Name of Emp: " + Name);
		System.out.println("Name of Org: " + OrgName);
		System.out.println("Salary of Emp: " + Salary);

	}

}
