package naveen;
import static org.junit.Assert.assertEquals;   
import org.junit.Test;
public class TestTrain {
	 Train t = new Train();
  @Test
  public void findAgeConcession()
  {
	  t.ageConcession(70);
  }
  @Test
  public void findTrain() {
	  assertEquals(70,Train.trainNo(70));
  }
 
 
 
  
}
