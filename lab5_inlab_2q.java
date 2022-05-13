package naveen;
import java.util.*;
public class lab5_inlab_2q {
	 public static int monotoneIncreasingDigits(int N) {
	        char[] x = String.valueOf(N).toCharArray();

	        int mark = x.length;
	        for(int i = x.length-1;i>0;i--){
	            if(x[i]<x[i-1]){
	                mark = i-1;
	                x[i-1]--;
	            }
	        }
	        for(int i = mark+1;i<x.length;i++){
	            x[i] = '9';
	        }
	        return Integer.parseInt(new String(x));
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(monotoneIncreasingDigits(n));
		sc.close();

	}

}
