package naveen;
import java.util.*;
public class inlab3_1Q {
  public static void main(String[] args)
  {
	  Scanner sc = new Scanner(System.in);
	  long T = sc.nextLong();
	  while(T-->0)
	  {
		  int n = sc.nextInt();
		  Vector<Integer> a = new Vector<Integer>();
		  for(int i=0;i<n;i++)
			  a.add(sc.nextInt());
		  int max = Collections.max(a);
		  if((max & 1)>0)
			  System.out.println(max+1);
		  else
			  System.out.println(max+2);
	  }
	  sc.close();
  }
}
