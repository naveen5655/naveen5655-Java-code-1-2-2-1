package naveen;
import java.util.*;
public class Inlab2Q
{
   public static void main(String[] args) {
   Scanner sc=new Scanner(System .in);
   String[] a = {"\"wold\"","\"world\"","\"row\""};
   int count=0;
   String order = "worldabcefghijkmnpqstuvxyz";
   String temp="";
   for(int i=0;i<a.length;i++)
   {
     for(int j=i+1;j<a.length;j++)
     {
      char v1[]=a[i].toCharArray();
      char v2[]=a[j].toCharArray ();
      int pos1=order.indexOf(v1[count]);
      int pos2=order.indexOf(v2[count]);
      if(pos1 > pos2)
      {
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        count=0;
      }
     } 
   }
   for(int i=0;i<a.length-1;i++)
   {
		   System.out.print(a[i]+",");
   }
   System.out.print(a[a.length-1]);
   sc.close();
   }
}