import java.util.*;
public class ArrayReverse {
public static void main(String args[]) {
	Scanner obj=new Scanner(System.in);
	int []a=new int[5];
	int i;
	System.out.println("Enter 5 elements of array:");
	for(i=0;i<=4;i++)
	{
		a[i]=obj.nextInt();
	}
	System.out.println("Display element:");
	for(i=4;i>=0;i--) {
		System.out.println("\t"+a[i]);
}
}
}
