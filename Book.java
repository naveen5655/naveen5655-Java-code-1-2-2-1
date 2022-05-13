package naveen;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Book
{
	static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static boolean Pal(String s)
    {
    	int begin=0;
    	int end=s.length()-1;
    	while(begin<end)
    	{
    		if(s.charAt(begin)!=s.charAt(end))
    			return false;
    		begin++;
    		end--;
    	}
    	return true;
    }
	public static void main(String[] args) {
	   // Scanner sc = new Scanner(System.in);
		FastReader sc = new FastReader();
	    long T = sc.nextLong();
	    while(T-->0)
	    {
	    	int n = sc.nextInt();
	    	int x = sc.nextInt();
	    	Vector<Integer> a = new Vector<Integer>();
	    	for(int i=0;i<n;i++)
	    		a.add(sc.nextInt());
	    	int max=Collections.max(a);
	    	int ind = a.indexOf(max);
	    	for(int i=0;i<=ind;i++)
	    	{
	    		   x += a.elementAt(i);
	    		
	    			
	    	}
	    	System.out.println(x);
	    }
	    //sc.close();
		
	}
}
