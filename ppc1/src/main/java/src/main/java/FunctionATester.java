package src.main.java;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class FunctionATester {
	
	
	@Test
	public void calculationTest1() {
		functionAController temp = new functionAController();
		temp.testInput(1, 100, 100, 10, 10, 1);
		temp.calculation();
		double[] actual = temp.testCalculation();
		double[] expected = {16,1,17,130,76.4706};
		for (int i = 0; i < 5; i++) {
			assertEquals(actual[i], expected[i],0.0001);
		}
	}
	@Test
	public void calculationTest2() {
		functionAController temp = new functionAController();
		temp.testInput(1, 10000, 10000, 15, 10, 2000);
		temp.calculation();
		double[] actual = temp.testCalculation();
		double[] expected = {1666,1,1667,19533,78.132};
		for (int i = 0; i < 5; i++) {
			assertEquals(actual[i], expected[i],0.0001);
		}
	}
	@Test
	public void calculationTest3() {
		functionAController temp = new functionAController();
		temp.testInput(1, 10000, 6000, 15, 30, 2000);
		temp.calculation();
		double[] actual = temp.testCalculation();
		double[] expected = {615,577,1192,20379,76.8004};
		for (int i = 0; i < 5; i++) {
			assertEquals(actual[i], expected[i],0.0001);
		}
	}
	
	public void calculationTest4() {
		functionAController temp = new functionAController();
		temp.testInput(1, 100, 100, 0, 0, 0);
		temp.calculation();
		double[] actual = temp.testCalculation();
		double[] expected = {0,0,0,0,0};
		for (int i = 0; i < 5; i++) {
			assertEquals(actual[i], expected[i],0.001);
		}
	}
	@Test
	public void warningTest1() {
		functionAController temp = new functionAController();
		temp.testInput(1, 100, 100, 10, 10, 1);
		temp.calculation();
		boolean[] actual = temp.testWarningState();
		boolean[] expected = {false, false};
		for (int i = 0; i < 2; i++) {
			assertEquals(actual[i], expected[i]);
		}
	}
	@Test
	public void warningTest2() {
		functionAController temp = new functionAController();
		temp.testInput(1, 100000, 100000, 10, 10, 1000);
		temp.calculation();
		boolean[] actual = temp.testWarningState();
		boolean[] expected = {true, false};
		for (int i = 0; i < 2; i++) {
			assertEquals(actual[i], expected[i]);
		}
	}
	@Test
	public void warningtest3() {
		functionAController temp = new functionAController();
		temp.testInput(1, 1000, 100000, 10, 10, 1000);
		temp.calculation();
		boolean[] actual = temp.testWarningState();
		boolean[] expected = {false, true};
		for (int i = 0; i < 2; i++) {
			assertEquals(actual[i], expected[i]);
		}
	}
	@Test
	public void warningtest4() {
		functionAController temp = new functionAController();
		temp.testInput(1, 30000, 100000, 10, 15, 1000);
		temp.calculation();
		boolean[] actual = temp.testWarningState();
		boolean[] expected = {true, true};
		for (int i = 0; i < 2; i++) {
			assertEquals(actual[i], expected[i]);
		}
	}
	
	@Test
	public void warningTextTest1() {
		functionAController temp = new functionAController();
		temp.testInput(1, 100000, 100000, 10, 10, 1000);
		temp.calculation();
		ObservableList<String> actual = temp.warningText();
		String W1 = "w1: Insufficient production capacity to produce the optimal mix, please reduce or adjust the capacity of labor & grape volume!";
		ObservableList<String> expected = FXCollections.observableArrayList();
		expected.add(W1);
		assertEquals(actual, expected);
	}
	
	@Test
	public void warningTextTest2() {
		functionAController temp = new functionAController();
		temp.testInput(1, 1000, 100000, 10, 10, 1000);
		temp.calculation();
		ObservableList<String> actual = temp.warningText();
		String W2 = "w2: Insufficient labor supplied to utilize the grape resource (less than 90%)!";
		ObservableList<String> expected = FXCollections.observableArrayList();
		expected.add(W2);
		assertEquals(actual, expected);
	}
	
	@Test
	public void warningTextTest3() {
		functionAController temp = new functionAController();
		temp.testInput(1, 30000, 100000, 10, 15, 1000);
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
		functionAController temp = new functionAController();
		temp.testInput(1, 100, 100, 10, 10, 1);
		temp.calculation();
		String[] actual = temp.formattedOutput();
		String[] expected = {"16","1","17","130","76.47"};
		for (int i = 0; i < 5; i++) {
			assertEquals(actual[i], expected[i]);			
		}
	}
}
