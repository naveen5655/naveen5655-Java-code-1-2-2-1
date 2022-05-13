package naveen;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestJunit {
   @Test
   public void compareAge()
   {
	   Person p = new Person();
	   p.age(15, 10);  
   }
   @Test
   public void compareMarks() {
	   Person p1 = new Person();
	   p1.marks(15, 10);
   }
  
}
