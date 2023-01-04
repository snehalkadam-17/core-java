package addition;
import java.util.*;
class student
{
	private
	  int rollno;
	String name;
	double marks;
	
 public
    void accept()
    {
	 Scanner obj=new Scanner(System.in);
	 System.out.println("enter rollno = ");
	 rollno=obj.nextInt();
	 System.out.println("enter name= ");
	 name=obj.next();
	 System.out.println("enter marks= ");
	 marks=obj.nextDouble();
	 
    }
 void display()
 {
	 System.out.println("rollno= "+rollno);
	 System.out.println("name= "+name);
	 System.out.println("marks= "+marks);
 }
	
}

public class stud {
	public static void main(String[] args)
	{
		student s1=new student();
		s1.accept();
		s1.display();
		
		student s2=new student();
		s2.accept();
		s2.display();
		
		student s3=new student();
		s3.accept();
		s3.display();
		
	}

}
