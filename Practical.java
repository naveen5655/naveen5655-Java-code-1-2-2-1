package naveen;
import java.util.*;
public class Practical {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    	System.out.println("1.reverse String \n2.String length\n3.Replace SubString\n4.frequence of specific character");
	    	switch(sc.nextInt())
	    	{
	    	case 1:
	    		System.out.println("enter String :");
	    		 String  s= sc.next();
	 	        char[] ch = s.toCharArray();
	 	        System.out.print("Reverse String: ");
	 	        for (int i = ch.length - 1; i >= 0; i--)
	 	            System.out.print(ch[i]);
	    	   break;
	    	case 2:
	    		System.out.println("enter String :");
	    		 String  s1= sc.next();
	    		 while(s1.length()<6) {
	    		 System.out.println("enter String length more than 6: ");
	    		 s1=sc.next();
	    		 }
	    		 System.out.println("String Length: "+s1.length());
	    		 break;
	    	case 3:
	    		System.out.println("enter String :");
	    		String s2 = sc.next();
	    		System.out.println("subString: "+s2.substring(0));
	    		String sub = s2.substring(0);
	    		System.out.println("enter to replace substring: ");
	    		String rs = sc.next();
	    		sub = sub.replaceAll(sub, rs);
	    		System.out.println("Replaced String: "+sub);
	    		break;
	    	case 4:
	    		System.out.println("enter String :");
	    		String s3 = sc.next();
	    		 char ch1[] = s3.toCharArray();
	    		System.out.println("enter char");
	    		int count=0;
	    		for(int i=0;i<s3.length();i++) {
	    		if(ch1[i]=='e')
	    			count++;
	    		}
	    		System.out.println("count="+count);
	    		break;
	    		
	    		}
	
	sc.close();	
	}

}


