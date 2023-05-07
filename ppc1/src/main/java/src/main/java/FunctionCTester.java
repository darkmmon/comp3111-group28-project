package src.main.java;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class FunctionCTester {
	@Test
	public void calculationTest1() {
		functionCController temp = new functionCController();
		temp.testInput(2301, 100, 100, 10, 10, 1, 1);
		temp.calculation();
		double[] actual = temp.testCalculation();
		double[] expected = {14,1,15,150};
		for (int i = 0; i < 4; i++) {
			assertEquals(actual[i], expected[i],0.0001);
		}
		String actualBkoFulfill = temp.testBkoFulfill();
		String expectedBkoFulfill = "YES";
		assertEquals(actualBkoFulfill, expectedBkoFulfill);
	}
	
	@Test
	public void calculationTest2() {
		functionCController temp = new functionCController();
		//temp.testInput(2301, 10000, 10000, 15, 10);
		temp.testInput(2301, 10000, 10000, 15, 10, 10, 10);
		temp.calculation();
		double[] actual = temp.testCalculation();
		int[] expected = {1530,180,1710,24750};
		for (int i = 0; i < 4; i++) {
			assertEquals(actual[i], expected[i],0.0001);
		}
		String actualBkoFulfill = temp.testBkoFulfill();
		String expectedBkoFulfill = "YES";
		assertEquals(actualBkoFulfill, expectedBkoFulfill);
	}
	
	@Test
	public void calculationTest3() {
		functionCController temp = new functionCController();
		temp.testInput(2301, 10000, 6000, 15, 30, 800, 800);
		temp.calculation();
		double[] actual = temp.testCalculation();
		int[] expected = {615,577,1192,26535};
		for (int i = 0; i < 4; i++) {
			assertEquals(actual[i], expected[i],0.0001);
		}
		String actualBkoFulfill = temp.testBkoFulfill();
		String expectedBkoFulfill = "NO";
		assertEquals(actualBkoFulfill, expectedBkoFulfill);
	}
	
	@Test
	public void calculationTest4() {
		functionCController temp = new functionCController();
		temp.testInput(2301, 100, 100, 0, 0, 200, 200);
		temp.calculation();
		double[] actual = temp.testCalculation();
		int[] expected = {0,0,0,0};
		for (int i = 0; i < 4; i++) {
			assertEquals(actual[i], expected[i],0.0001);
		}
		String actualBkoFulfill = temp.testBkoFulfill();
		String expectedBkoFulfill = "NO";
		assertEquals(actualBkoFulfill, expectedBkoFulfill);
	}
	
	@Test
	public void warningTest1() {
		functionCController temp = new functionCController();
		temp.testInput(2301, 100, 100, 10, 10, 12, 1);
		temp.calculation();
		boolean[] actual = temp.testWarningState();
		boolean[] expected = {false, false, false};
		for (int i = 0; i < 3; i++) {
			assertEquals(actual[i], expected[i]);
		}
	}
	@Test
	public void warningTest2() {
		functionCController temp = new functionCController();
		temp.testInput(2301, 100000, 100000, 10, 10, 1, 1);
		temp.calculation();
		boolean[] actual = temp.testWarningState();
		boolean[] expected = {true, false, true};
		for (int i = 0; i < 3; i++) {
			assertEquals(actual[i], expected[i]);
		}
	}
	@Test
	public void warningTest3() {
		functionCController temp = new functionCController();
		temp.testInput(2301, 1000, 100000, 10, 10, 1, 1);
		temp.calculation();
		boolean[] actual = temp.testWarningState();
		boolean[] expected = {false, true, true};
		for (int i = 0; i < 3; i++) {
			assertEquals(actual[i], expected[i]);
		}
	}
	@Test
	public void warningtest4() {
		functionCController temp = new functionCController();
		temp.testInput(2301, 30000, 100000, 10, 15, 1, 1);
		temp.calculation();
		boolean[] actual = temp.testWarningState();
		boolean[] expected = {true, true, true};
		for (int i = 0; i < 3; i++) {
			assertEquals(actual[i], expected[i]);
		}
	}
	@Test
	public void warningtest5() {
		functionCController temp = new functionCController();
		temp.testInput(2301, 30000, 100000, 10, 15, 3000, 1);
		temp.calculation();
		boolean[] actual = temp.testWarningState();
		boolean[] expected = {false, true, false};
		for (int i = 0; i < 3; i++) {
			assertEquals(actual[i], expected[i]);
		}
	}
	@Test
	public void warningTextTest1() {
		functionCController temp = new functionCController();
		temp.testInput(2301, 30000, 100000, 10, 15, 1, 1);
		temp.calculation();
		ObservableList<String> actual = temp.warningText();
		String W1 = "W1: Insufficient production capacity to produce the optimal mix, please reduce or adjust the capacity of labor & grape volum!";
		String W2 = "W2: Insufficient labor supplied to utilize the grape resource (less than 90%)!";
    	String W3 = "W3: According to company policy, ratio of backorder volume should not lower than 70% of the optimal production volume!";	
		ObservableList<String> expected = FXCollections.observableArrayList();
		expected.add(W1);
		expected.add(W2);
		expected.add(W3);
		assertEquals(actual, expected);
	}
	@Test
	public void warningTextTest2() {
		functionCController temp = new functionCController();
		temp.testInput(2301, 100, 100, 10, 10, 12, 1);
		temp.calculation();
		ObservableList<String> actual = temp.warningText();
		String W1 = "W1: Insufficient production capacity to produce the optimal mix, please reduce or adjust the capacity of labor & grape volum!";
		String W2 = "W2: Insufficient labor supplied to utilize the grape resource (less than 90%)!";
    	String W3 = "W3: According to company policy, ratio of backorder volume should not lower than 70% of the optimal production volume!";	
		ObservableList<String> expected = FXCollections.observableArrayList();
		assertEquals(actual, expected);
	}
	@Test
	public void warningTextTest3() {
		functionCController temp = new functionCController();
		temp.testInput(2301, 100000, 100000, 10, 10, 1, 1);
		temp.calculation();
		ObservableList<String> actual = temp.warningText();
		String W1 = "W1: Insufficient production capacity to produce the optimal mix, please reduce or adjust the capacity of labor & grape volum!";
		String W2 = "W2: Insufficient labor supplied to utilize the grape resource (less than 90%)!";
    	String W3 = "W3: According to company policy, ratio of backorder volume should not lower than 70% of the optimal production volume!";	
		ObservableList<String> expected = FXCollections.observableArrayList();
		expected.add(W1);
		//expected.add(W2);
		expected.add(W3);
		assertEquals(actual, expected);
	}
	@Test
	public void warningTextTest4() {
		functionCController temp = new functionCController();
		temp.testInput(2301, 1000, 100000, 10, 10, 1, 1);
		temp.calculation();
		ObservableList<String> actual = temp.warningText();
		String W1 = "W1: Insufficient production capacity to produce the optimal mix, please reduce or adjust the capacity of labor & grape volum!";
		String W2 = "W2: Insufficient labor supplied to utilize the grape resource (less than 90%)!";
    	String W3 = "W3: According to company policy, ratio of backorder volume should not lower than 70% of the optimal production volume!";	
		ObservableList<String> expected = FXCollections.observableArrayList();
		//expected.add(W1);
		expected.add(W2);
		expected.add(W3);
		assertEquals(actual, expected);
	}
	@Test
	public void output_format_test() {
		functionCController temp = new functionCController();
		temp.testInput(2301, 10000, 6000, 15, 30, 800, 800);
		temp.calculation();
		String[] actual = temp.formattedOutput();
		String[] expected = {"615","577","1192","26535","NO"};
		//int[] expected = {615,577,1192,26535};
		for (int i = 0; i < 5; i++) {
			assertEquals(actual[i], expected[i]);			
		}
	}
	@Test
    public void output_format_test2() {
        functionCController temp = new functionCController();
        temp.testInput(2301, 10000, 10000, 15, 30, 80, 80);
        temp.calculation();
        String[] actual = temp.formattedOutput();
        String[] expected = {"1452","115","1567","25230","YES"};
        for (int i = 0; i < 5; i++) {
            assertEquals(actual[i], expected[i]);            
        }
    }
    @Test
    public void output_format_test3() {
        functionCController temp = new functionCController();
        temp.testInput(2301, 10000, 10000, 50, 30, 8000, 8000);
        temp.calculation();
        String[] actual = temp.formattedOutput();
        String[] expected = {"1666","1","1667","83330","NO"};
        //int[] expected = {615,577,1192,26535};
        for (int i = 0; i < 5; i++) {
            assertEquals(actual[i], expected[i]);            
        }
    }
    @Test
    public void output_format_test4() {
        functionCController temp = new functionCController();
        //temp.testInput(2301, 10000, 10000, 15, 10);
        temp.testInput(2301, 10000, 10000, 15, 10, 10, 10);
        temp.calculation();
        String[] actual = temp.formattedOutput();
        String[] expected = {"1530","180","1710","24750","YES"};
        for (int i = 0; i < 5; i++) {
            assertEquals(actual[i], expected[i]);
        }
    };
    @Test
    public void output_format_test5() {
        functionCController temp = new functionCController();
        temp.testInput(2301, 100, 100, 0, 0, 200, 200);
        temp.calculation();
        String[] actual = temp.formattedOutput();
        String[] expected = {"0","0","0","0","NO"};
        for (int i = 0; i < 5; i++) {
            assertEquals(actual[i], expected[i]);
        }
    }
}