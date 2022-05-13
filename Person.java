package naveen;
public class Person {
	 Boolean age(int a1 , int b1)
    {
		 assert(a1>b1): "person 2 age is greater than person 1";
    		if(a1>b1)
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
 
    }
    Boolean marks(int a, int b)
	{
	  assert(a>b): "person 2 age is greater than person 1";
	    if(a>b)
	  {
	      return true;
	  } 
	  else
	  {
	     return false;
	  }
	}
 
}
