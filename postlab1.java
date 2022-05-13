package naveen;
import java.util.*;
public class postlab1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String s1[] = new String[n+1];
		int count=0;
		for(int i=0;i<s1.length;i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
				count++;
		}
			System.out.print("["+"('"+s+"')"+","+count+"]");
		
		sc.close();
  
	}

}
