import java.util.*;
public class ForEachDemo {
	public static void main (String [] args)
	{
		ArrayList<String> ls= new ArrayList<String>();
		ls.add("a");
		ls.add("b");
		ls.add("c");
		ls.add("d");
		for (String str : ls)
		{
			System.out.println(str+" ");
		}
}
}
