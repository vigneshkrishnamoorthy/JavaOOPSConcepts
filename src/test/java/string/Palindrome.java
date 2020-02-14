package string;

import libraries.Scanner;

public class Palindrome {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original,reverse ="";
		
		System.out.println("Enter the first string for Palindrome");
		
		java.util.Scanner sca = new java.util.Scanner(System.in);
		original = sca.nextLine();
		int lengthOfString = original.length();
		
		for (int i =lengthOfString-1;i<=0;i--)
			
		{
			//reverse = reverse+original.charAt(i);
			
			reverse = reverse+original.charAt(i);
			System.out.println("reverse format of string is" +reverse);
			
		}
			
		
		if(original.equalsIgnoreCase(reverse))
			
		{
			System.out.println("its palindrome");
		}
			
		else 
		
		{
			System.out.println("Not a palidrome");
			
		}
		
		

	}

}
