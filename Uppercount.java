package naveen;
import java.util.*;
class Uppercount
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter array size");
	int size=s.nextInt();
	String word[]=new String[size];
	System.out.println("Enter the words");
	for(int i=0;i<size;i++)
	{
		word[i]=s.next();
	}
	int uppercase=0,count=0;
	int uppercasecount[]=new int[size];
	for(int i=0;i<word.length;i++)
	{
	char a[]=word[i].toCharArray();
	for(int j=0;j<a.length;j++)
	{
	if(a[j]>='A' && a[j]<='Z')
	{
	uppercase++;
	}
	}
     uppercasecount[count]=uppercase;
     count++;
     uppercase=0;
	}
	int tempint=0;
	String temp="";
	for(int i=0;i<size;i++)
	{
	for(int j=i+1;j<size;j++)
	{
		if(uppercasecount[i]>uppercasecount[j])
		{
		tempint=uppercasecount[i];
		uppercasecount[i]=uppercasecount[j];
		uppercasecount[j]=tempint;
		temp=word[i];
		word[i]=word[j];
		word[j]=temp;	
		}
	}
    }
    System.out.println("output");
    System.out.print("[");
    for(int i=0;i<size;i++)
	{
		System.out.print("('" +word[i] +"',"  +uppercasecount[i]+ "),");
	}
	System.out.print("]");
	}
}
