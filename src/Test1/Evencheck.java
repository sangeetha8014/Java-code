package Test1;

import java.util.Scanner;

public class Evencheck {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int x;
		do
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number: ");
			x = scanner.nextInt();
		
			if (x / 2 == 0) {
		System.out.println("Number is Evennumber");
			}
			else {
			System.out.println("Number is odd");
			
		}
		while (x!=0);

	  }

	}
}

