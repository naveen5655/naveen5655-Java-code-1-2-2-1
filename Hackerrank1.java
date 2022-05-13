package naveen;
import java.util.*;
import java.util.Map.Entry;
public class Hackerrank1{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      long k = sc.nextLong();
       Map<Integer,Integer> a = new HashMap<Integer,Integer>();
       for(int i=0;i<n;i++)
    	   a.put(sc.nextInt(), sc.nextInt());
       int s1 =0;
       Vector<Integer> b = new Vector<Integer>();
       int st = 0;
       int min = Integer.MAX_VALUE;
       for (Map.Entry<Integer, Integer> e : a.entrySet())
       {
    	   st += e.getKey();
   		if(e.getValue()==1 && min > e.getKey())
   			min = e.getKey();
   		if(e.getValue()==0)
   			s1 += e.getKey();
       }
       for(int i : a.keySet())
    	   
       Collections.sort(b);
       //int min = Collections.min(b);
       int diff = st - s1;
       int s2 = 0;
       Collections.sort(b,Collections.reverseOrder());
       for(int i=0;i<b.size();i++)
       {
    	   s2 += b.elementAt(i);
       }
    	System.out.println(s1+s2-k);
       sc.close();
}
}