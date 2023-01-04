import java.util.*;
public class Arrayeachloop {
public static void main(String args[]) {
	int [] a=new int[5];
	int i;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter 5 element of array:");
	for(i=0;i<a.length;i++) {
		a[i]=obj.nextInt();
	}
	for(int x:a)//for each loop
	{
		System.out.println(x);
		
	}
}
}
