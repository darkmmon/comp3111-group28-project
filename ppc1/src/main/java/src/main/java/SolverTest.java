package src.main.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolverTest {
	@Test
	public void test1() {
		int[] actual = Solver.Solve_linear(1000, 1000, 10, 10);
		int[] expect = {154,19,1730};
		for (int i = 0; i < 3; i++) {
			assertEquals(actual[i], expect[i]);
		}
	}
	@Test
	public void test2() {
		int[] actual = Solver.Solve_linear(10000, 1000, 10, 10);
		int[] expect = {0,250,2500};
		for (int i = 0; i < 3; i++) {
			assertEquals(actual[i], expect[i]);
		}
	}
	@Test
	public void test3() {
		int[] actual = Solver.Solve_linear(3000, 1000, 23, 10);
		int[] expect = {166,1,3828};
		for (int i = 0; i < 3; i++) {
			assertEquals(actual[i], expect[i]);
		}
	}
	@Test
	public void test4() {
		int[] actual = Solver.Solve_linear(1000, 1000, 0, 10);
		int[] expect = {0,83,830};
		for (int i = 0; i < 3; i++) {
			assertEquals(actual[i], expect[i]);
		}
	}
	
}
