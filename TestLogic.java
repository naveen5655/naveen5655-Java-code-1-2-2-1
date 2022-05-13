package naveen;
import static org.junit.Assert.*;   
import org.junit.Test;
public class TestLogic {
    @Test
    public void findAdd(){
        assertEquals(5,Calculator.add(2, 3)); 
	}
    @Test
    public void findSub() {
    	 assertEquals(1,Calculator.subtract(3, 2));
    }
    @Test
    public void findMul() {
    	 assertEquals(6,Calculator.multiply(3, 2));
    }
    @Test
    public void findDiv() {
    	 assertEquals(2,Calculator.divide(20, 10),1);
    }
    
}
