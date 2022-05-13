package naveen;
import java.util.*;
public class Hackerrank
{
    public static int max(int a[],int n)
    {
        int max1 = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(max1<a[i])
            max1=a[i];
        }
        return max1;
    }
    public static int min(int a[],int n)
    {
        int min1 = Integer.MAX_VALUE;
         for(int i=0;i<n;i++)
        {
            if(min1>a[i])
            min1=a[i];
        }
        return min1;
        
    }
    public static boolean same(int a[],int n)
    {
        int key = a[0];
        for(int i=1;i<a.length;i++){    
            if(a[i] == key){    
                return true;    
            }    
        }    
        return false;    
    }
       public static int solve(int a[],int n)
    {
        int count=0;
           int ans = max(a,n) - min(a,n); 
            int add = 0;
            if (ans <= 1 && ans >=0)
                add= 1;
            else if (ans >1 && ans < 5)
                add = 2;
            else
                add = 5;
            for(int i=0;i<n;i++)
            {
                if(a[i]!=max(a,n))
                a[i] += add;
            }      
            
            if(same(a,n))
             count++;

        return count;
    }
    public static void answer(int a[],int n)
    {
        if(same(a,n))
        	System.out.println(solve(a,n));
        else
        {
        	 System.out.println(solve(a,n));
        }
       
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        while(T-->0)
        {
            int n = sc.nextInt();
            int a[] = new int[n+1];
            for(int i=0;i<n;i++)
              a[i]=sc.nextInt();
            answer(a,n);
        }
        sc.close();
    }
}