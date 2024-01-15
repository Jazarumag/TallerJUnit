package tallerpruebas;
import static org.junit.Assert.assertEquals;
import java.lang.reflect.Field;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

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
        Employee worker = new Employee(1500, "EUR", 25.3F, EmployeeType.Worker);
        float result = worker.cs();
        assertEquals(1489.3, result, 0.1);
    }

	@Test
    public void testCsForWorker() {
        Employee worker = new Employee(1750, "USD", 30.7F, EmployeeType.Supervisor);
        float result = worker.cs();
        // Adjust this value based on your expected result for the Supervisor case
        assertEquals(1825.1, result, 0.1);
    }
	
    @Test
    public void testCsForSupervisor() {
        Employee supervisor = new Employee(1800, "USD", 22.2F, EmployeeType.Supervisor);
        float result = supervisor.cs();
        // Adjust this value based on your expected result for the Supervisor case
        assertEquals(1872.1, result, 0.1);
    }

    @Test
    public void testCsForManager() {
        Employee manager = new Employee(3900, "USD", 31.9F, EmployeeType.Manager);
        float result = manager.cs();
        // Adjust this value based on your expected result for the Manager case
        assertEquals(3986.6, result, 0.1);
    }
    
    @Test
    public void testWorkerSalaryForDifferentMonth() {
    	Employee worker = new Employee(3000, "USD", 0.1F, EmployeeType.Worker);
        float result = worker.cs();
        assertEquals(3000.0, result, 0.1);
    }
}
