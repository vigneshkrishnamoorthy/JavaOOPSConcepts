package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HasMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap<String, String> values = new HashMap<String, String>();
		Map<String, String> values = new HashMap<String, String>();
		
		
		
		values.put("Name", "XXXX");
		values.put("Age", "20");
		values.put("DOB", "12Jan");
		values.put("Mobile", "452653256");
		values.put("Address", "first Floor");
		
		int lengthOfHasMap = values.size();
		System.out.println("Size of HasMap is :" +lengthOfHasMap);
		System.out.println("All the values in HashMap are:" +values);
		System.out.println(values.get("Name"));
		System.out.println(values.get(lengthOfHasMap));
		
		for(Map.Entry<String,String> data:values.entrySet())
			
		{
			 System.out.println("Values from Map are :" +data.getKey()+"  and the Value is "+data.getValue());
		}

	}

}
