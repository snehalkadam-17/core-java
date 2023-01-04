import java.util.*;
public class Integer10 {
public static void main(String args[]) {
	Scanner obj=new Scanner (System.in);
	int [] a=new int[5];
	for(int i=0;i<=a.length;i++) {
		System.out.println("enter the value of a["+i+"]");
		a[i]=obj.nextInt();
	}
	for(int i=0;i<a.length;i--)
	{
		System.out.print("The value of a[i] is ");
	}
}
}
