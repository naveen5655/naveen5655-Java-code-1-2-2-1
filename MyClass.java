package naveen;
import java.util.*;
public class MyClass{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans=0,i,m,ma,flag=0;
    int a[] = new int[n+1];
    for(i=0;i<n;i++)
    a[i]=sc.nextInt();
    for(i=0;i<n;i++)
    {
        m=a[i];
        ma=i;
        for(int j=i+1;j<n;j++)
        {
            if(m==a[j])
                ans=j-ma;
        }
    }
     if(ans <= 0)
    System.out.println("-1");
      else
          System.out.println(ans);
    sc.close();
  }
}