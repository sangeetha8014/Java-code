import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		x = scanner.nextInt();
		
		
		
		for(int i = 1 ; i <=n ; i++)	
		{	
			if(n % i == 0)				//condition for getting the factors of number n
			count=count+1;
		}
		if(count == 2)		                        //if factors are two then, number is prime else not
		System.out.println("Prime Number");
		else
		System.out.println("Not a Prime Number");
		sc.close();		                
		
	}
}
}
