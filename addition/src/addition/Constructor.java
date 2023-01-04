package addition;
import java.util.*;
class cricketer
{
	String name;
	String team;
	int age;
	cricketer()
	{
		name="";
		team=" ";
		age=0;
	}
	cricketer(String n,String t,int a)
	{
		name=n;
		team=t;
		age=a;
	}
	cricketer(cricketer ckt)
	{
	name=ckt.name;
	team=ckt.team;
	age=ckt.age;
}
	cricketer(String n1,int a1 ){
		this.name=n1;
		this.age=a1;
	}
	public String toString()
	{
		return "name="+name+" team="+team+"  age="+age;
	}
}
public class Constructor {
		public static void main(String args[])
		{
			cricketer c1=new cricketer();
			c1.name="virat";
			c1.team="india";
			c1.age=43;
			System.out.println(c1);
			cricketer c2=new cricketer ("sachin","india",43);
			System.out.println(c2);
			cricketer c3=new cricketer(c2);
			System.out.println(c3);
			cricketer c4=new cricketer("dhoni",23);
			System.out.println(c4);
		}
	}
