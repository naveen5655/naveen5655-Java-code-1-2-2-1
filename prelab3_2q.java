package naveen;
import java.util.*;
public class prelab3_2q {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int m =sc.nextInt();
		int[] b = new int[m+1];
		for(int i=0;i<m;i++)
			b[i]=sc.nextInt();
		Set<Integer> c = new HashSet<Integer>();
		for(int i=0;i<m;i++)
		{
			if(b[i]!=a[i])
				c.add(b[i]);
		}
		for(int i:c)
		System.out.print(i+" ");
		sc.close();

	}

}
