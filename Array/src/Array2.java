import java.util.*;
public class Array2 {
	public static void main(String[] args) {
	
		int [][] a=new int[3][3];
		int [][] b=new int[3][3];
		int [][] c=new int[3][3];
		int i,j;
		System.out.println("enter a matrix : ");
		Scanner obj=new Scanner(System.in);
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				a[i][j]=obj.nextInt();
			}
		}
		System.out.println("enter b matrix : ");
		
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				b[i][j]=obj.nextInt();
			}
		}
		
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print("\t"+c[i][j]);
			}
			System.out.print("\n");
		}
		
		
	}
}


