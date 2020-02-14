package string;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter the first Sring");
		Scanner sca1 = new Scanner(System.in);
		String str1 =  sca1.nextLine();
		System.out.println("Enter the Second Sring");
		Scanner sca2 = new Scanner(System.in);
		String str2 =  sca2.nextLine();
		String str3 = removeSpaces(str1);
		String str4 = removeSpaces(str2);
		
	boolean booleanvalue = compare(str3,str4);
		
		if(booleanvalue==true)
		{
			System.out.println("String is Anagram");
		}
		
		else 
		{
			System.out.println("Its not a anagram");
			
		}
		
		
		

	}

	
	private static String removeSpaces(String str2) {
		// TODO Auto-generated method stub
		return null;
	}


	private static boolean compare(String str1, String str2) {
		// TODO Auto-generated method stub
		return false;
	}

}
