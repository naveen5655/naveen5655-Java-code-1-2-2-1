package naveen;
import java.util.*;
public class lab5_pre2q {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a[] = new int[100];
    int i=0;
    int n=sc.nextInt();
    while(n!=0) {
    	a[i]=n;
    	i++;
    	n=sc.nextInt();
    }
    
    System.out.println("enter k");
	int k = sc.nextInt();
	if(a.length%k==0)
		System.out.println("YES");
	else
		System.out.println("NO");
	sc.close();
	

	}

}
