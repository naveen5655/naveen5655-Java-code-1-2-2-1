package naveen;
import java.util.*;
public class Skill2 {
  public static void main(String[] args)
  {
	  Scanner sc = new Scanner(System.in);
	  int t= sc.nextInt();
	  while(t-->0) {
	  String s = sc.next();
	  String r = "";
	  int a[] = new int[100];
	  int b[] = new int[100];
	  for(int i=0;i<s.length();i++)
	  {
		  int asciiValue = s.charAt(i);
		  a[i]=asciiValue;
	  }
	  for(int i=s.length()-1;i>=0;i--)
	  {
		  r += s.charAt(i);
	  }
	  for(int i=r.length()-1;i>=0;i--)
	  {
		  int asciiValue = s.charAt(i);
		  b[i]=asciiValue;
	  }
	  int c[] = new int[100];
	  int d[] = new int[100];
	  for(int i=0;i<s.length();i++)
	  {
		 c[i]=Math.abs(a[i]-a[i+1]);
	  }
	  for(int i=0;i<r.length();i++)
	  {
		  d[i]=Math.abs(b[i]-b[i+1]);
	  }
	  for(int i=0;i<s.length();i++)
	  {
		  if(c[i]==d[i]) {
			  System.out.println("funny");
		      break;}
		  else {
			  System.out.println("not funny");
		     break;}
	  }
	  
	  
  }
	  sc.close();
  }
}
