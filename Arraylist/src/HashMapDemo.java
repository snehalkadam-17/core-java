import java.util.*;
public class HashMapDemo {
public static void main(String []args)
{
	HashMap<String,Integer> hm= new HashMap<String,Integer>();
	hm.put("a", new Integer (100));
	hm.put("b",new Integer(200));
	hm.put("c",new Integer(300));
	hm.put("d",new Integer(400));
	Set<Map.Entry<String,Integer>> st = hm.entrySet();
	for(Map.Entry<String,Integer> me:st)
	{
		System.out.println(me.getKey()+":");
		System.out.println(me.getValue());
	}
	
}
}
