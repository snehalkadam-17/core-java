import java.util.*;
public class Arraylistexample {
public static void main(String[]args)
{
	ArrayList< String >al= new ArrayList < String >();
	al.add("ab");
	al.add("bc");
	al.add("cd");
	System.out.println(al);
	
	Collections.sort(al);
	System.out.println(al);
	
	ArrayList<String> al2= new ArrayList<String>();
	al2.add("Snehal");
	al2.add("Shiwani");
	
	//adding secong list element to the first list
	al.addAll(al2);
	System.out.println(al);
	
	al.remove(0);
	System.out.println("After invoking remove (object) method: ");
}
}
