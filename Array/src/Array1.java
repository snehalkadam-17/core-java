import java.util.*;
public class Array1 {
public static void main(String args[]) {
	Scanner obj=new Scanner(System.in);
	int [] a=new int[5];
	int i;
	System.out.println("enter 5 element of array");
	for(i=0;i<=4;i++)
	{
	a[i]=obj.nextInt();	
	}
	System.out.println("Display elements:");
	for(i=0;i<=4;i++)
	{
		System.out.println("\t"+a[i]);
	}
}
}
