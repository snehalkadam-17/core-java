import java.util.*;
public class Secondsmallestlargest{
 public static void main(String[] args) {
int Elements[]=new int[]{3,6,9,2,4,8,5,10,15,12};
 int smallest=Elements[0];
 int largest=Elements[0];
 for(int i=1;i<Elements.length;i++) {
 if(Elements[i]>largest)largest=Elements[i];
 else if(Elements [i] < smallest)smallest=Elements[i];
}
System.out.println("Largest element is:"+largest);
System.out.println("smallest element is:"+smallest);

 }
}
