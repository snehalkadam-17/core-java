package addition;
import java.util.*;
class emp{
	public
	int eid,found=0;
	
	String ename, post;
	int salary;
	public
	void accept(){
		Scanner obj=new Scanner (System.in);
		System.out.println("Enter eid=");
		eid=obj.nextInt();
		System.out.println("Enter ename=");
		ename=obj.next();
		System.out.println("Enter post=");
		post=obj.next();
		System.out.println("Enter salary=");
		salary=obj.nextInt();
	}
	void display()
	{
		System.out.print("\n"+eid);
		System.out.print("\t"+ename);
		System.out.print("\t"+post);
		System.out.print("\t"+salary);
	}
	int search(int id)
	{
		if(eid==id)
		{
        System.out.println("emp eid="+eid);
        System.out.print("\t ename="+ename);
        System.out.print("\t salary="+salary);
        found=1;
		}
		if(found==1)
		{
			System.out.print("\n record found");
		}
		else
		{
			System.out.print("\n record not found");
		}
		return 0;
	}
}
public class EmpTable {
	public static void main(String[] args) {
		emp [] e=new emp[10];
		int i,search,key,max,n=0,id,choice;
		Scanner obj=new Scanner(System.in);
			System.out.println("enter no of records");
			n=obj.nextInt();
			for(i=0;i<3;i++)
			{
				e[i]=new emp();
			}
		    for(i=0;i<n;i++)
		    {
					e[i].accept();
				
		    }
		    do
		    {
		    	System.out.println("\n Enter your choice");
		    	
		    	System.out.println("\n Press 1 to display all the Employee records");
		    	System.out.println("\n Press 2 to Search records by using Employee Id ");
		    	System.out.println("\n Press 3 to Show Maximum Salary details.");
		    	System.out.println("\n Press 4 to Exit.\n");
		    	choice=obj.nextInt();
		    	switch(choice)
		    	{
		    	case 1:
		    	System.out.println("\n Employee Details\n");
		    	
		    	System.out.println("\nId\tName\tSalary\tRole");
                
		    	for(i=0;i<n;i++)
		    	{
		    		e[i].display();
		    	}
		    	break;
		    	case 2:
		    		System.out.println(" Enter Id to search:");
		    		id=obj.nextInt();
		    		for(i=0;i<n;i++)
		    		{
		    			e[i].search(id);
		    		}
		    		break;
		    	case 3:
		    		max=e[0].salary;
		    		for(i=0;i<n;i++)
		    			
		    		{
		    			if(max<e[i].salary)
		    			max=e[i].salary;
		    		}
		    		System.out.println("\n Maximum Salary="+max);
		    		break;
//		    	case 4:
//		    		exit(0);
//		    		break;
//		    		default:
//		    			System.out.println("invalid input");
		    	}
		    }
		    while(choice!=4);
		    }
}

