package set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		LinkedHashSet<String> values = new LinkedHashSet<String>();
		
		values.add("apple");
		values.add("Ball");
		values.add("cat");
		values.add("Dog");
		values.add("last");
		
		
		int lengthOfLinkedHasSet = values.size();
		System.out.println("Size of LinkedHashSet is :" +lengthOfLinkedHasSet);
		//In List we cannot print using index
		System.out.println(values);
		
		// Converting the Set in to List , as we cannot print the value using Index & to pring using Index, we are converting List to Set.
		ArrayList<String> alist = new ArrayList<String>(values);
		System.out.println("Last value of Linked Hashset values are:  "+alist.get(lengthOfLinkedHasSet-2));
		//System.out.println("Value of last  element is :" +alist.get(lengthOfLinkedHasSet-1));
		//System.out.println("Value of last element is :" +(lengthOfLinkedHasSet-1));
		
				
		
		//Iterator itr = new Iterator()
		
		Iterator itr = values.iterator();
		
		{
			while(itr.hasNext())
				
			{
				
				Object value = itr.next();
				System.out.println("The value of Linked list is:" +value);
			
			
			}
			
		};
		
		
		
		
		
	}

}
