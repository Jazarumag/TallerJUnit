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
	
	@Test
    public void testCsForWorkerWithUSD() {
        Employee worker = new Employee(1000, "USD", 0.1F, EmployeeType.Worker);
        float result = worker.cs();
        assertEquals(1064.3, result, 0.1);
    }

	@Test
    public void testCsForWorkerWithOtherCurrency() {
        Employee worker = new Employee(1000, "EUR", 0.1F, EmployeeType.Worker);
        float result = worker.cs();
        assertEquals(1014.3, result, 0.1);
    }

    @Test
    public void testCsForSupervisor() {
        Employee supervisor = new Employee(1000, "USD", 0.1F, EmployeeType.Supervisor);
        float result = supervisor.cs();
        // Adjust this value based on your expected result for the Supervisor case
        assertEquals(1064.3, result, 0.1);
    }

    @Test
    public void testCsForManager() {
        Employee manager = new Employee(1000, "USD", 0.1F, EmployeeType.Manager);
        float result = manager.cs();
        // Adjust this value based on your expected result for the Manager case
        assertEquals(1064.4, result, 0.1);
    }
}
