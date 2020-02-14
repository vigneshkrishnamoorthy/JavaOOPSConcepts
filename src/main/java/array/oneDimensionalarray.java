package array;

public class oneDimensionalarray {
	
	public static void main(String[] args)
	{
		
		// Delclaring Array
		
		int studentRank[] = new int[5];
		studentRank[0] = 10;
		studentRank[1] = 20;
		studentRank[2] = 30;
		studentRank[3] = 40;
		studentRank[4] = 50;
		
		int lengthofArray = studentRank.length;
		
		System.out.println("Length of array is: "+lengthofArray);
		
		for (int i=0;i<=lengthofArray-1;i++)
			
		{
			System.out.println("List of student rank is:" +studentRank[i]);
		}
		
	}

}
