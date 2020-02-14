package array;

public class twoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int studentAge[][] = new int[5][5];
		studentAge[0][0] = 6;		
		studentAge[0][1] = 7;
		studentAge[1][0] = 8;
		studentAge[1][1] = 9;
		
		int noOfStudents = studentAge.length;
		System.out.println("Number of Students are:" +noOfStudents);
		System.out.println("Student Age is:" +studentAge[0][2]);
		
	}

}
