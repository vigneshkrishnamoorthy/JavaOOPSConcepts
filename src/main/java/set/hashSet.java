package set;

import java.util.HashSet;
import java.util.Set;

public class hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> values = new HashSet<String>();
		values.add("Apple");
		values.add("Ball");
		//values.add(78455);
		values.add("1");
		values.add("XCD");
		values.add("A");
		values.add("hjgasdhasg");
		
		
		
		int lengthOfHasSet = values.size();
		System.out.println("Size of HashSet is:"  +lengthOfHasSet);
		
		// Directly printing the Values
		//System.out.println(values);
		
		
		//Print using for loop
		for (int i=0; i<lengthOfHasSet; i++)
			
		{
			System.out.println("Values stored is HashSet is:" +values);
		}
		
		
		//Printing the values using Enhanced For Loop
	/*	for(String e: values)
		{
			
			System.out.println(e);
		}
		*/
		
	}

}
