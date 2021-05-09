package OOPsconcepts;

public class Runnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassA Emp1 = new ClassA(1000,"Sangee", "XYZ");
		ClassA Emp2 = new ClassA();
		
		/*Emp1.Name = "Sangee";
		Emp1.Salary = 1000;
		Emp1.OrgName = "Xyz";*/
		
		Emp1.Display();
		
		ClassB obj1 = new ClassB();
		obj1.Name = "Piri";
		obj1.Salary = 5000;
		obj1.OrgName = "IJK";
		
		obj1.Display(); 
		obj1.show();
		
		ClassC obj2 = new ClassC();
		
		obj2.run();
		
	}

}
