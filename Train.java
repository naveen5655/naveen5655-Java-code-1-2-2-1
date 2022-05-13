package naveen;
public class Train {
	Boolean ageConcession(int age)
	{
	  assert(age>60 && age<100): "Age entered is invalid";
	    if(age>60)
	      return true;
	    else
	      return false;
	}
	public static int trainNo(int n)
	{
		return n;
	}
	
	
}
