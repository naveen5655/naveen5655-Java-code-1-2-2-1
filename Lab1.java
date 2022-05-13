package naveen;
import java.util.*;
public class Lab1
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     ArrayList<String> al=new ArrayList<String>();
     int n = sc.nextInt();
     for(int i=0;i<n;i++)
    	 al.add(sc.next());
     Collections.sort(al);
     for(String i:al)
     System.out.print(i+" ");
     sc.close();
}
}