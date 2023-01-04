import java.util.*;
public class LargestNo {		
public static void main(String args[]) {

			int a[]= {10,20,25,45,56,67};
			int size=a.length;
			Arrays.sort(a);
			System.out.println("sorted array:"+Arrays.toString(a));
			int res=a[size-2];
			System.out.println("2nd largest elements is::"+res);
		}
	}

