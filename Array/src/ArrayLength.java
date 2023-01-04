import java.util.*;
public class ArrayLength {
public static void main(String args[]) {
	Scanner obj=new Scanner(System.in);
	int [] a=new int[5];
	int i;
	System.out.println("Enter 5 elements of array");
	for(i=0;i<a.length;i++) {
		a[i]=obj.nextInt();
	}
	Arrays.sort(a);
	System.out.println("Display elements:");
	for(i=0;i<a.length;i++)
	{
		System.out.println("\t"+a[i]);
	}
}
}
