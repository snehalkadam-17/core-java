package addition;

public class Calculate {
void sum(int a,int b) {
	System.out.println("sum is"+(a+b));
}
void sum(double a,double b) {
	System.out.println("sum is"+(a+b));
}
public static void main (String[] args) {
	Calculate Cal=new Calculate();
	Cal.sum(8,5);
	Cal.sum(4.6,3.8);
}
}
