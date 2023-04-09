package student_databaseapp;
import java.util.Scanner;
public class student_databaseapp {

	public static void main(String[] args) {
		
		//Ask the number of students
		System.out.println("Enter the number of students");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		student[] students=new student[n];  //creating n students

		for( int i=0;i<n;i++)
		{
			students[i]=new student();
			students[i].enroll();
			students[i].paytuition();
			System.out.println(students[i].showinfo());
		}
	}

}
