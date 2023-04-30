package src.main.java;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class FunctionATester {
	@Test
	public void testSalesRevenue1() {
		
	}
	@Test
	public void testSalesRevenue2() {
		
		int expect2 = 0;
		int actual2 = functionAController.calSalesRevenue(0,0,0,0);
		assertEquals(expect2, actual2);
	}
	
	@Test
	public void testVCL1() {
		
		int expect1 = 10;
		int actual1 = functionAController.calVCL(1,1,1);
		assertEquals(expect1, actual1);
	}
	@Test
	public void testVCL2() {
		
		int expect2 = 0;
		int actual2 = functionAController.calVCL(0,0,1);
		assertEquals(expect2, actual2);
	}
}
