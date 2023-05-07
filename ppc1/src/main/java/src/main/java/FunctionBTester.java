package src.main.java;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class FunctionBTester {
	
	
	@Test
	public void calculationTest1() {
		functionBController temp = new functionBController();
		temp.testInput(100, 100, 10, 10);
		temp.calculation();
		int[] actual = temp.testCalculation();
		int[] expected = {15,2,17,170,0,0};
		for (int i = 0; i < 5; i++) {
			assertEquals(actual[i], expected[i],0.0001);
		}
	}
	@Test
	public void calculationTest2() {
		functionBController temp = new functionBController();
		temp.testInput(10000, 10000, 15, 10);
		temp.calculation();
		int[] actual = temp.testCalculation();
		int[] expected = {1540,190,1730,25000,20,0};
		for (int i = 0; i < 5; i++) {
			assertEquals(actual[i], expected[i],0.0001);
		}
	}
	@Test
	public void calculationTest3() {
		functionBController temp = new functionBController();
		temp.testInput(10000, 6000, 15, 30);
		temp.calculation();
		int[] actual = temp.testCalculation();
		int[] expected = {615, 577, 1192, 26535, 0, 0};
		for (int i = 0; i < 5; i++) {
			assertEquals(actual[i], expected[i],0.0001);
		}
	}
	
	public void calculationTest4() {
		functionBController temp = new functionBController();
		temp.testInput(100, 100, 0, 0);
		temp.calculation();
		int[] actual = temp.testCalculation();
		int[] expected = {0,0,0,0,100,100};
		for (int i = 0; i < 5; i++) {
			assertEquals(actual[i], expected[i],0.001);
		}
	}
	@Test
	public void warningTest1() {
		functionBController temp = new functionBController();
		temp.testInput(100, 100, 10, 10);
		temp.calculation();
		boolean[] actual = temp.testWarningState();
		boolean[] expected = {false, false};
		for (int i = 0; i < 2; i++) {
			assertEquals(actual[i], expected[i]);
		}
	}
	@Test
	public void warningTest2() {
		functionBController temp = new functionBController();
		temp.testInput(100000, 100000, 10, 10);
		temp.calculation();
		boolean[] actual = temp.testWarningState();
		boolean[] expected = {true, false};
		for (int i = 0; i < 2; i++) {
			assertEquals(actual[i], expected[i]);
		}
	}
	@Test
	public void warningtest3() {
		functionBController temp = new functionBController();
		temp.testInput(1000, 100000, 10, 10);
		temp.calculation();
		boolean[] actual = temp.testWarningState();
		boolean[] expected = {false, true};
		for (int i = 0; i < 2; i++) {
			assertEquals(actual[i], expected[i]);
		}
	}
	@Test
	public void warningtest4() {
		functionBController temp = new functionBController();
		temp.testInput(30000, 100000, 10, 15);
		temp.calculation();
		boolean[] actual = temp.testWarningState();
		boolean[] expected = {true, true};
		for (int i = 0; i < 2; i++) {
			assertEquals(actual[i], expected[i]);
		}
	}
	
	@Test
	public void warningTextTest1() {
		functionBController temp = new functionBController();
		temp.testInput(100000, 100000, 10, 10);
		temp.calculation();
		ObservableList<String> actual = temp.warningText();
		String W1 = "w1: Insufficient production capacity to produce the optimal mix, please reduce or adjust the capacity of labor & grape volume!";
		ObservableList<String> expected = FXCollections.observableArrayList();
		expected.add(W1);
		assertEquals(actual, expected);
	}
	
	@Test
	public void warningTextTest2() {
		functionBController temp = new functionBController();
		temp.testInput(1000, 100000, 10, 10);
		temp.calculation();
		ObservableList<String> actual = temp.warningText();
		String W2 = "w2: Insufficient labor supplied to utilize the grape resource (less than 90%)!";
		ObservableList<String> expected = FXCollections.observableArrayList();
		expected.add(W2);
		assertEquals(actual, expected);
	}
	
	@Test
	public void warningTextTest3() {
		functionBController temp = new functionBController();
		temp.testInput(30000, 100000, 10, 15);
		temp.calculation();
		ObservableList<String> actual = temp.warningText();
		String W1 = "w1: Insufficient production capacity to produce the optimal mix, please reduce or adjust the capacity of labor & grape volume!";
        String W2 = "w2: Insufficient labor supplied to utilize the grape resource (less than 90%)!";
		ObservableList<String> expected = FXCollections.observableArrayList();
		expected.add(W1);
		expected.add(W2);
		assertEquals(actual, expected);
	}
	
	@Test
	public void output_format_test() {
		functionBController temp = new functionBController();
		temp.testInput(100, 100, 10, 10);
		temp.calculation();
		String[] actual = temp.formattedOutput();
		String[] expected = {"15","2","17","170","0","0"};
		for (int i = 0; i < 5; i++) {
			assertEquals(actual[i], expected[i]);			
		}
	}
}
