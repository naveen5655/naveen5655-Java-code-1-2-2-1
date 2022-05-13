package naveen;
import static org.junit.Assert.*;   
public class Ticket {
	Boolean tic(int age)
	{
	  assert(age>60 && age<100): "Age entered is invalid";
	    if(age>60)
	  {
	      return true;
	  } 
	  else
	  {
	     return false;
	  }
	}
}
