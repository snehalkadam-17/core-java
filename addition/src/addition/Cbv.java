package addition;

public class Cbv {
public void cbv(int x) {
	x=100;
}
public static void main(String[] args) {
	int x=50;
	Cbv c1=new Cbv();
	c1.cbv(x);
	System.out.println(x);
}
}
