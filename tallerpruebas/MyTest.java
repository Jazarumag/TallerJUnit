package tallerpruebas;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyTest {
	@Test
	 public void testFindMax(){
	 assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));
	 assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));
	 assertEquals(99,Calculation.findMax(new int[] {99,-108,92,90,-1}));
	 assertEquals(4,Calculation.findMax(new int[]{-12,1,0,4,1}));
	 assertEquals(777,Calculation.findMax(new int[]{-214,123,352,777,-112}));
	 }
}
