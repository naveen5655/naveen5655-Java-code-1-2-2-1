package naveen;
import java.util.*;
public class BC {
	  public static int lastDigit(int n)
	    {
	        while (n >= 10)
	            n /= 10;
	     
	        // return the first digit
	        return n;
	    }
	public static void main(String[] args) {
		String s = "123";
		int n = s.length();
		int sum=0;
		int num = Integer.parseInt(s);
		int sn1 = num;
		int sn3=num;
		int sn4=num;
		while(sn1>0)
		{
			sum += sn1 % 10;
			sn1 = sn1/10;
		}
		
		int reverse=0;
		while(sn3 != lastDigit(sn3))   
		{  
		int remainder = sn3 % 10;  
		reverse = reverse * 10 + remainder;  
		sn3 = sn3/10;  
		}  
		System.out.println("last="+lastDigit(sn3));
		int sn2 = n;
		while(sn2>0)
		{
			sum += sn2 % 10;
			sn2 = sn2/10;
		}		    
		for(int i=0;i<n;i++)
		{
			System.out.print(s.substring(0,i+1)+" ");
			int sn = Integer.parseInt(s.substring(0,i+1));
			sum += sn;
		}
		sum = sum + reverse;
		System.out.println("sum="+sum);
	
		
	}

}
