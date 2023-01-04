package addition;
import java.util.*;
class car{
	private
	int modelno;
	String name;
	double price;
	public
	void accept() {
		Scanner obj=new Scanner (System.in);
		System.out.println("enter modelno=");
		modelno=obj.nextInt();
		System.out.println("enter name=");
		name=obj.next();
		System.out.println("enter price=");
		price=obj.nextDouble();
	}
	void display() {
		System.out.print("\n"+modelno);
		System.out.print("\t"+name);
		System.out.print("\t"+price);
	}
}
public class Ca {
public static void main(String args[]) {
   car [] c=new car[5];
	int i,n;
	for(i=0;i<=4;i++) {
		c[i]=new car();
	}
	for(i=0;i<=4;i++) {
		c[i].accept();
	}
	System.out.print("\nmodelno\tname \tprice");
	for(i=0;i<=4;i++) {
		c[i].display();
	}
}

}
