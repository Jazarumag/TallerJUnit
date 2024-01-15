package tallerpruebas;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyTest {
	@Test
	public void testFindMax() {
		assertEquals(4, Calculation.findMax(new int[] { 1, 3, 4, 2 }));
		assertEquals(-1, Calculation.findMax(new int[] { -12, -1, -3, -4, -2 }));
		assertEquals(99, Calculation.findMax(new int[] { 99, -108, 92, 90, -1 }));
		assertEquals(4, Calculation.findMax(new int[] { -12, 1, 0, 4, 1 }));
		assertEquals(777, Calculation.findMax(new int[] { -214, 123, 352, 777, -112 }));
	}

	@Test
	public void testCalculateYearBonusWorkerUSA() {
		Employee workerUSA = new Employee(500, "USD", 0, EmployeeType.Worker);
		assertEquals(386.0F, workerUSA.CalculateYearBonus(),0.0F); 
	}
	
	@Test
	public void testCalculateYearBonusSupervisorUSA() {
		Employee supervisorUSA = new Employee(500, "USD", 0, EmployeeType.Supervisor);
		assertEquals(693.0F, supervisorUSA.CalculateYearBonus(),0.0F);		
	}
	
	@Test
	public void testCalculateYearBonusManagerUSA() {
		Employee managerUSA = new Employee(500, "USD", 0, EmployeeType.Manager);
		assertEquals(886.0F, managerUSA.CalculateYearBonus(),0.0F);
	}
	
	@Test
	public void testCalculateYearBonusWorkerJPN() {
		Employee workerJPN = new Employee(500, "YEN", 0, EmployeeType.Worker);
		assertEquals(386.0F, workerJPN.CalculateYearBonus(),0.0F);
	}
	
	@Test
	public void testCalculateYearBonusSupervisorJPN() {
		Employee supervisorJPN = new Employee(500, "YEN", 0, EmployeeType.Supervisor);
		assertEquals(668.0F, supervisorJPN.CalculateYearBonus(),0.0F);
		
	}
	@Test
	public void testCalculateYearBonusManagerJPN() {
		Employee managerJPN = new Employee(500, "YEN", 0, EmployeeType.Manager);
		assertEquals(861.0F, managerJPN.CalculateYearBonus(),0.0F);
		
	}
	
	

}
