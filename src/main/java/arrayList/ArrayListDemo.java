package arrayList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList alist = new ArrayList();
		alist.add(7458);
		alist.add("mngh");
		alist.add('d');
		alist.add(45.14);
		
		int lengthOfArraList = alist.size();
		System.out.println("Length of array list is:  "+lengthOfArraList);
		
		System.out.println("Value of Second element is: "+alist.get(2));
		/*System.out.println("Length of Array list is:"+lengthOfArraList);
		 * 
		 *
		System.out.println(alist.get(0));*/ // ----> to get the specific Value
		
		//Normal for Loop
		
		/*for(int i =0; i<lengthOfArraList;i++)
		{
			System.out.println(alist.get(i));
		}
		
		*/
		
		// Enhanced For Loop
		
		/*for(Object abc: alist)
			
		{
			System.out.println("Values are:" +abc);
			
		}*/
		
		
		Iterator itr = alist.iterator();
		
		
		while (itr.hasNext()) 
		
		{
			Object value = itr.next();
			System.out.println("The Values are:"+value);
			
			
			
		}
		
		
	}

}
