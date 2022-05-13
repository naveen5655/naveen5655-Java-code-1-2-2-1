package naveen;
import java.util.*;
public class Postlab3_2q {
	static double medianCal(int[]  a,int d)
	{
		double m=0;	
		if(d%2==1)
			m=a[((d+1)/2)-1];
		else
			m=(a[d/2-1]+a[d/2])/2;
	return m;
	 }
	static int solve(int[] a,int n, int d)
	{
		int count=0;
		for(int i=d+1;i<=n;i++)
		{
			double med = medianCal(a,d);
			if(a[i]>=2*med)
				count++;
		}
		return count;
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int d = sc.nextInt();
    	int[] a = new int[n+1];
    	for(int i=0;i<n;i++)
    		a[i]=sc.nextInt();
        System.out.println(solve(a,n,d));
    	sc.close();
    }
}
