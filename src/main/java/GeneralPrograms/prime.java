package GeneralPrograms;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count =0;
		int num;
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter the Number to find whether its a prime or not");
		num = sca.nextInt();
		
		for (int i=1;i<=num;i++)
			
		{
			if(num%i==0)
			{
				count++;
			}
		}
		
		
		if(count==2)
			
		{
			System.out.println("Number is prime");
		}
		
		else 
		{
			System.out.println("Number is not a Prime");
			
		}
		
	}
	
	

}
