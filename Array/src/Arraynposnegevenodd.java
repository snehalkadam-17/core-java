import java.util.*;
public class Arraynposnegevenodd {
public static void main(String args[]) {
	Scanner obj=new Scanner(System.in);
	int n,l,p=0,c=0,o=0,e=0,z=0;
	for(l=1;l<=20;l++) {
		System.out.println("Enter a number");
		n=obj.nextInt();
		if(n>o)
		{
			p++;
		}
		if(n<0) {
			c++;
		}
		if(n%2==0) {
			e++;
		}
		if(n%2!=0) {
			o++;
		}
		if(n==0) {
			z++;
		}
	}
	System.out.println("positive no"+p);
	System.out.println("negative no"+c);
	System.out.println("odd no"+o);
	System.out.println("even no"+e);
	System.out.println("zero no"+z);
	
}
}
