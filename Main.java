package naveen;
import java.util.*;
public class Main{
    long solve(long a[],long n,long s)
    {
       
        
    	 for(long i=0;i<n;i++)
         {
             
             s += a[(int) i];
         }
        return s;
      
    }
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         Main m = new Main();
         long n = sc.nextLong();
        long s=0;
        long[] a = new long[(int) (n+1)];
        for(long i=0;i<n;i++)
        {
            a[(int) i]=sc.nextLong();
        }
        System.out.println(m.solve(a, n, s));
           sc.close();
    }
    
}