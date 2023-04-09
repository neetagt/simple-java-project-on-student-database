package student_databaseapp;
import java.util.Scanner;
public class student {
	
	private String fname;
	private String lname;
	private int gradeyear;
	private String studentID;
	private String courses;
	private int tuitionbal;
	private static int coursefee=600;
	private static int sid=1000;
	
	//constructor
	public student()
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter your firstname: ");
		this.fname=in.nextLine();
		System.out.print("Enter your lastname: ");
		this.lname=in.nextLine();
		System.out.print("Enter your gradeyear: ");
		this.gradeyear=in.nextInt();
		setStudID();
		
		sid++;
	}
	
	//generate an id
	private String setStudID()
	{
		sid++;
		this.studentID=gradeyear+""+sid;
		return this.studentID;
	}
	//enroll in courses
	public void enroll()
	{
		do 
		{
			System.out.print("Enter course to enroll (0 to quit): ");
			Scanner in=new Scanner(System.in);
			String course=in.nextLine();
			if(!course.equals("0"))
			{
				courses=courses+"\n"+course;
				tuitionbal=tuitionbal+coursefee;
			}
			else
			{
				break;
			}
		}while(1!=0);
	}
	//view balance
	public void viewbal()
	{
		System.out.println("Your balance is: "+tuitionbal);
	}
	//pay tuition
	public void paytuition()
	{
		viewbal();
		System.out.print("Enter your payment $");
		Scanner in=new Scanner(System.in);
		int payment=in.nextInt();
		tuitionbal-=payment;
		System.out.println("Thank you for your payment of $"+payment);
		viewbal();
	}
	//show status
	public String showinfo()
	{
		return "Name: "+fname+" "+lname+
				"\nGradeyear: "+gradeyear+
				"\nStudent ID: "+studentID+
				"\nCourses Enrolled: "+courses+
				"\nBalance: $"+tuitionbal;
	}
}
