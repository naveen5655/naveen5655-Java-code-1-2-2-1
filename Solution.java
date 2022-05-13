package naveen;
import java.util.*;
import java.io.*;
public class Solution{
		 public static int countCollisions(String directions) {
			 int c = 0;
			 int d=0;
			 int n = directions.length();
			 for(int i=0;i<directions.length()-2;i++)
			 {
	             if(directions.charAt(i+1)==directions.charAt(i))
	                 continue;
	             else{
					 if(directions.charAt(i+1)=='s')
						 c++;
					 else if ((directions.charAt(i+1)=='R' ||  directions.charAt(i+1)=='L'))
						 c +=2;  }
			 }
				 
			 if(directions.charAt(n-1)!='s' && directions.charAt(n-1)=='s')
				 c++;
			 else if( (directions.charAt(n-1)=='R' &&  directions.charAt(n-2)=='L')|| (directions.charAt(n-1)=='L' &&  directions.charAt(n-2)=='R'))
				 c +=2; 
		 
			 
			 return c;
		        
		    
	}
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);           
        String directions = "RLRSLL";
        int ans = countCollisions(directions);
      
        System.out.println(countCollisions(directions));
    	sc.close();
    }
}
