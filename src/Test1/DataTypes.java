package Test1;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HelloWorld");
		
		//----Data Types in Java---//
		
		int num1;
		int num2;
		
		num1=15;
		num2=20;
		
		int sum = num1+num2;
		int mul = num1*num2;
		float div = (float)num2/num1;
		
		System.out.println("Addition:" + sum);
		System.out.println("Multiplcation:" + mul);
		System.out.println("Division:" + div);
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the User: ");
		String name = scanner.next();
		
				
		System.out.println("Hello " + name);
		System.out.println("Lenght: " + name.length());
		System.out.println("Uppercase: " + name.toUpperCase());
		
		//---Arrays---///
		
		int myarray [] = {22,34,45,67,78};
		System.out.println("The first value of array :" + myarray[3]);
		
		String myarray1 [] = {"San","Piri","Krithik","Sahana","Paaru","Daksh"};
		System.out.println("My favourite name :" + myarray1[1]);
		

	}

}
