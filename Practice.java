package naveen;
import java.util.*;
public class Practice {
   public static void main(String[] args)
   {
	   Scanner sc = new Scanner(System.in);
	   String c = sc.next();
	     String s = c.toLowerCase();
	      int count[] = new int[256];
	      int max=Integer.MIN_VALUE;
	      for(int i=0;i<s.length();i++) {
	    	  count[s.charAt(i)-'a']++;
	    	  if(max< count[s.charAt(i)-'a'])
	    		  max= count[s.charAt(i)-'a'];
	      }
	      System.out.println("max="+max);
	      for(int i=0;i<26;i++){
		       System.out.print((char)(i+'a')); 
	      }
	   sc.close();
   }
}
