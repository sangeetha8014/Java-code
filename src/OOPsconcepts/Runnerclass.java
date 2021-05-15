package OOPsconcepts;

public class Runnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*ClassA Emp1 = new ClassA(1000,"Sangee", "XYZ");
		ClassA Emp2 = new ClassA();
		
		/*Emp1.Name = "Sangee";
		Emp1.Salary = 1000;
		Emp1.OrgName = "Xyz";*/
		
		/*Emp1.Display();
		
		ClassB obj1 = new ClassB();
		obj1.Name = "Piri";
		obj1.Salary = 5000;
		obj1.OrgName = "IJK";
		
		obj1.Display(); 
		obj1.show();
		
		ClassC obj2 = new ClassC();
		
		obj2.run();*/
		
		/*MethodOverloading Obj3 = new MethodOverloading();
		Obj3.add(2,3);
		Obj3.add(2.3, 5.2);
		
		MethodOverridechild Obj4 = new MethodOverridechild();
		Obj4.display1();*/
		
		Abstractionchild Obj5 = new Abstractionchild();
		Obj5.method2();
		Obj5.method1();
		
		Interfacechild Obj6 = new Interfacechild();
		Obj6.method2();
	
		EncapsulationExample Obj7 = new EncapsulationExample();
		Obj7.setName("SANGEETHA");
		System.out.println(Obj7.getName());
	}

}
