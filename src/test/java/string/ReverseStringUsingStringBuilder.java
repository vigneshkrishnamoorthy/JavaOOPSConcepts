package string;

import java.util.Scanner;

public class ReverseStringUsingStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the string to reverse it");
		Scanner sca1 = new Scanner(System.in);
		String originalString = sca1.nextLine();
		
		StringBuilder sb = new StringBuilder();
		sb.append(originalString);
		sb.reverse();
		System.out.println("Reversed string is  :" +sb);
		
		
		

	}

}
