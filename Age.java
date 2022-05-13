package naveen;
public class Age {
	Boolean find(int age)
	{
	  assert(age>18): "Not eligible to vote";
	    if(age>18)
	  {
	      return true;
	  } 
	  else
	  {
	     return false;
	  }
	}
	Boolean findP(int age)
	{
		
		assert(age>0) : "invalid input";
		if(age>0)
			return true;
		else
			return false;
	}
	   
	
}
