package naveen;
import java.util.*;
public class Inlab3_2Q {
   public static void main(String[] args)
   {
	   Scanner  sc = new Scanner(System.in);
	   int t = sc.nextInt();
	   while(t-->0) {
	   int n = sc.nextInt();
	   int a[] = new int[n+1];
	   for(int i=0;i<n;i++)
		   a[i]=sc.nextInt();
	   int total_sum=0,curr_sum=0;
	   for(int i=0;i<n;i++)
	   {
		   total_sum += a[i];
	   }
	   int flag=0;
	   for(int i=0;i<n;i++)
	   {
		   if(curr_sum==total_sum-curr_sum-a[i])
			   flag=1;
		       else
		    	   curr_sum += a[i];
		    
		       
	   }
	   if(flag==1)
		   System.out.println("YES");
	   else
		   System.out.println("NO");}
	   sc.close();
   }
}
