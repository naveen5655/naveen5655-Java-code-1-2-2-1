package naveen;
import java.util.*;
public class spoj
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		long testcases = sc.nextLong();
		while(testcases-->0)
		{
			int n = sc.nextInt();
			int cows = sc.nextInt();
			int[] a = new int[n+1];
			for(int i=0;i<n;i++)
			 a[i]=sc.nextInt();
			Arrays.sort(a);
			int l=a[0];
			int h=a[n-1]-a[0];
			int ans=1;
			while(l<=h)
			{
				int mid=(l+h)/2;
				int ind=a[0];
				int c=1;
				for(int i=1;i<n;i++)
				{
					if(a[i]-ind>=mid)
					{
						ind=a[i];
						c++;
					}
					if(c==n)
					break;
				}
				if(cows==c)
				{
					ans=mid;
					l=mid+1;
				}
				else
				h=mid-1;
			}
			System.out.println(ans-1);
		}
		
		sc.close();
		
	}
}
