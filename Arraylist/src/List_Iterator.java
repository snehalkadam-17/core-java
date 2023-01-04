import java.util.*;
public class List_Iterator
{
	public static void main (String [] args)
	{
		ArrayList<String> ar= new ArrayList<String>();
		ar.add("ab");
		ar.add("bc");
		ar.add("cd");
		ar.add("de");
ListIterator litr = ar.listIterator();
while(litr.hasNext())
{
	System.out.println(litr.next()+" ");
}
while(litr.hasPrevious())
{
	System.out.println(litr.previous()+" ");
}
}
}