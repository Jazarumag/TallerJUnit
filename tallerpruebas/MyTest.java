package tallerpruebas;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyTest {
	@Test
	 public void testFindMax(){
	 assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));
	 assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));
	 
	 assertEquals(99,Calculation.findMax(new int[] {99,-108,92,90,-1}));
	 }
}
