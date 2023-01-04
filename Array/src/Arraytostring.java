import java.util.*;
public class Arraytostring {
public static void main(String args[]) {
	int [] a=new int[5];
	int i;
	Scanner obj=new Scanner (System.in);
	for(i=0;i<a.length;i++)
	{
		a[i]=obj.nextInt();
	}
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
			
}
}
