
package addition;

public class ST_Employee {
int eid;
String ename;
static String company_name="spark";
public void show()
{
	System.out.println("eid=" +eid+ "ename=" +ename+ "+company_name");
}
public static void main(String[] args) {
	ST_Employee se1=new ST_Employee();
	se1.eid=104;
	se1.ename="Abhijit";
	se1.show();
	ST_Employee se2=new ST_Employee();
	se2.eid=105;
	se2.ename="Ankit";
	se2.show();
}
}
