import java.util.Scanner;

class Student
{
    String usn,name,branch,phno;
    Student(String usn,String name,String branch,String phno)
    {
        this.usn=usn;
        this.name=name;
        this.branch=branch;
        this.phno=phno;
    }
	void display()
	{
		System.out.println(usn + "\t" +name + "\t" + branch + "\t" +phno + "\t");
	}	
	
}


public class P1A
{
	public static void main(String[] args)
    {
		Scanner ob = new Scanner(System.in);
		Scanner ob1 = new Scanner(System.in);
		
        System.out.println("Enter the number of Students:");
		int n=ob.nextInt();
		Student str[] = new Student[n];
		
        for(int i=0;i<n;i++)
		{
			System.out.println("Enter Student Details:\n" +(i+1));
			System.out.println("Enter the USN");
			String usn=ob1.nextLine();
			System.out.println("Enter the Name");
			String name=ob1.nextLine();
			System.out.println("Enter the Branch");
			String branch=ob1.nextLine();
			System.out.println("Enter the Phone Number");
			String phno=ob1.nextLine();
			str[i] = new Student(usn,name,branch,phno);
		}
	    
        for(int i=0;i<n;i++)
		{
			System.out.println("USN\t\t NAME\t\t BRANCH\t\t PHONE NUMBER\t\t");
	        str[i].display();
		}
	}
}
	
			
		
		
	

	

