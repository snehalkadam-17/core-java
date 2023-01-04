import java.util.*;

class Contact
{
	String First_Name;
	String Last_Name;
	String phone_no;
	public Contact(String fn,String ln,String pn)
	{
		First_Name=fn;
		Last_Name=ln;
		phone_no=pn;
	}
	public String toString()
	{
		return First_Name+" "+Last_Name+" ("+phone_no+")";
	}
}
public class PhoneBook {
public static void main(String []args)
{
	Contact c1= new Contact("Ricky","Pointing","9999999999");
	Contact c2=new Contact("Virat","Kohli","888888888");
	Contact c3=new Contact("David","Beckham","77777777");
	ArrayList < Contact > al=new ArrayList< Contact >();
	al.add(c1);
	al.add(c2);
	al.add(c3);
	System.out.println(al);
	
}
}
