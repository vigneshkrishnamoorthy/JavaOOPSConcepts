package dataType;

public class Variables {
	
	static int globalVariable = 100000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int localVariable = 100;
		
		System.out.println("Global int value is:"  +globalVariable);
		System.out.println("Local int value is:"  +localVariable);
		
		
		// Boolean - 1 Byte
		boolean pass = true;
		boolean fail = false;
		System.out.println("If the Student got good Mark:" +pass);
		System.out.println("If the Student didn't got good Mark:" +fail);
		
		// Character - 2 Byte
		char a = 'm';
		char b = 'n';
		char c = 65;
		System.out.println("Character of a is :" +a);
		System.out.println("Character of b is :" +b);
		System.out.println("Character of c is :" +c);
		
		//Byte - 1 byte
		byte mark = 127;
		System.out.println("Mark of student is:" +mark);
		
		
		// Short - 2 Byte
		short age = 32767;
		System.out.println("Age of Person is :" +age);
		
		
		// Integer - 4 Byte
		int a1 = 10;
		int b1 = 20;
		int c1 = 30;
		System.out.println("First Integer value is :" +a1);
		System.out.println("Second Integer value is :" +b1);
		System.out.println("Third Integer value is :" +c1);
		
		
		//Long - 8 Byte
		long sizeOfShip = 922337203;
		System.out.println("Size of Ship is :" +sizeOfShip);
		
				
		 //Float - 4byte
		float weightOfElephantinKGS = (float) 4444454.5454; 
		System.out.println("Weight of elephant is:"  +weightOfElephantinKGS);
		
		
		
		//Double - 8 byte
		double weightOfMountain = 54564654564.4878;
		System.out.println("Weight of Mountain is:" +weightOfMountain);
		
		
		
	
		
		
		
	
		
		
	}

}
