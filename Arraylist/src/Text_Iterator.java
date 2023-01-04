import java.util.*;
public class Text_Iterator {
public static void main (String [] args)
{
	ArrayList<String> ar= new ArrayList<String>();
	ar.add("ab");
	ar.add("bc");
	ar.add("cd");
	ar.add("de");
	Iterator it = ar.iterator();
	while(it.hasNext());
	{
		System.out.println(it.next()+" ");
	}
}
}
