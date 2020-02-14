package arrayList;

import java.util.ArrayList;

public class genericArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("zero");
		alist.add("one");
		alist.add("two");
		alist.add("three");
		alist.add("four");
		alist.add("five");
		alist.add("six");
		alist.add("seven");
		alist.add("eight");
		alist.add("nine");
		alist.add("ten");
		
		
		int lengthOfArrayList = alist.size();
		
		System.out.println("Size of Array List is :" +lengthOfArrayList);
		
		//System.out.println(alist.get(2));
		
		System.out.println("Second value is:  " +alist.get(lengthOfArrayList-2));
		
		for(int i=0;i<lengthOfArrayList;i++)
			
		{
			System.out.println("Value are :" +alist.get(i));
		}
			
			
		

	}

}
