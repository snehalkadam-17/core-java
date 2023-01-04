package addition;

public class Cbr {
int x=10;
int y=20;
public void CallByReference(Cbr t) {
	t.x=100;
	t.y=50;
}
public static void main(String[] args) {
	Cbr ts=new Cbr();
	System.out.println("before "+ts.x+" "+ts.y);
	ts.CallByReference(ts);
	System.out.println("After "+ts.x+" "+ts.y);
}
}
