import java.util.*;
public class Input10 {
public static void main(String args[]) {

	int [] a=new int[10];
	int j;
	
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the no of elements");
	//i=obj.nextInt();
	
	System.out.println("Array elements are:");
	for(j=0;j<5;j++){
		a[j]=obj.nextInt();
	}
		System.out.println("Array elements are");
		for( j=0;j<5;j++){
			System.out.println(a[j]);
	}
}
}
