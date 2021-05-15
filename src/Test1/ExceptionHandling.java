package Test1;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 15;
		int b = 5;
		
		try {
			int result = a/b;
			
		}catch(ArithmeticException e) {
			
			System.out.println("Arthimetic Exception Handler");
						
		}
		catch(Exception e) {
			
			System.out.println("Exception Handler");
			
		}	finally {
			System.out.println("Try catch Executed successfully");
		}
			System.out.println("Hello");
			System.out.println("After error");

			int myarray [] = {2,56,43,65};
			
			try {
				
				System.out.println("The second valus in array: " +myarray[43]);
				
			}catch(ArrayIndexOutOfBoundsException e) {
				
				System.out.println("AOB Exception Handler");
			}
	}

}
