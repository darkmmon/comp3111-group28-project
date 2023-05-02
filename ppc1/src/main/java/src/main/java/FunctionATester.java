package src.main.java;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;

public class FunctionATester {
//	public static Thread t;
//	public static class AsNonApp extends Main {
//	    @Override
//	    public void start(Stage primaryStage) throws IOException {
//	    	stage=primaryStage;
//	         scene=new Scene(FXMLLoader.load(getClass().getResource("/ppc1_function_A.fxml")));
//	       stage.setScene(scene);
//	    }
//	}
//
//	@BeforeClass
//	public static void initJFX() throws IOException, InterruptedException {
//		Application.launch(AsNonApp.class, new String[0]);
//	    t = new Thread("JavaFX Init Thread") {
//	        public void run() {
//	            Application.launch(AsNonApp.class, new String[0]);
//	        }
//	    };
//	    t.setDaemon(true);
//	    t.start();
//	}
	
	@Test
	public void calculationtest1() {
		functionAController temp = new functionAController();
		temp.testinput(1, 100, 100, 10, 10, 1);
		temp.calculation();
		double[] actual = temp.testoutput();
		double[] expected = {16,1,17,130,76.5,0,0};
		for (int i = 0; i < 7; i++) {
			assertEquals(actual[i], expected[i],0.001);
		}
	}
	@Test
	public void calculationtest2() {
		functionAController temp = new functionAController();
		temp.testinput(1, 10000, 10000, 15, 10, 2000);
		temp.calculation();
		double[] actual = temp.testoutput();
		double[] expected = {1666,1,1667,19533,78.1,0,0};
		for (int i = 0; i < 7; i++) {
			assertEquals(actual[i], expected[i],0.001);
		}
	}
	@Test
	public void calculationtest3() {
		functionAController temp = new functionAController();
		temp.testinput(1, 10000, 6000, 15, 30, 2000);
		temp.calculation();
		double[] actual = temp.testoutput();
		double[] expected = {615,577,1192,20379,76.8,0,0};
		for (int i = 0; i < 7; i++) {
			assertEquals(actual[i], expected[i],0.001);
		}
	}
	@Test
	public void waringtest1() {
		functionAController temp = new functionAController();
		temp.testinput(1, 100000, 100000, 10, 10, 1000);
		temp.calculation();
		double[] actual = temp.testoutput();
		double[] expected = {16666,1,16667,131036,78.6,1,0};
		for (int i = 0; i < 7; i++) {
			assertEquals(actual[i], expected[i],0.001);
		}
	}
	@Test
	public void warningtest2() {
		functionAController temp = new functionAController();
		temp.testinput(1, 1000, 100000, 10, 10, 1000);
		temp.calculation();
		double[] actual = temp.testoutput();
		double[] expected = {200,0,200,584,29.2,0,1};
		for (int i = 0; i < 7; i++) {
			assertEquals(actual[i], expected[i],0.001);
		}
	}
	@Test
	public void warningtest3() {
		functionAController temp = new functionAController();
		temp.testinput(1, 30000, 100000, 10, 15, 1000);
		temp.calculation();
		double[] actual = temp.testoutput();
		double[] expected = {6000,0,6000,46533,77.6,1,1};
		for (int i = 0; i < 7; i++) {
			assertEquals(actual[i], expected[i],0.001);
		}
	}
	
	@Test
	public void warningtexttest1() {
		functionAController temp = new functionAController();
		temp.testinput(1, 100000, 100000, 10, 10, 1000);
		temp.calculation();
		ObservableList<String> actual = temp.warning_text();
		String W1 = "w1: Insufficient production capacity to produce the optimal mix, please reduce or adjust the capacity of labor & grape volume!";
		ObservableList<String> expected = FXCollections.observableArrayList();
		expected.add(W1);
		assertEquals(actual, expected);
	}
	
	@Test
	public void warningtexttest2() {
		functionAController temp = new functionAController();
		temp.testinput(1, 1000, 100000, 10, 10, 1000);
		temp.calculation();
		ObservableList<String> actual = temp.warning_text();
		String W2 = "w2: Insufficient labor supplied to utilize the grape resource (less than 90%)!";
		ObservableList<String> expected = FXCollections.observableArrayList();
		expected.add(W2);
		assertEquals(actual, expected);
	}
	
//	@Test
//	public void input_error_test() {
//		functionAController temp = new functionAController();
//		Alert actual = temp.error_message(0);
//		Alert expected = new Alert(Alert.AlertType.INFORMATION);
//		expected.setTitle("error");
//		expected.setHeaderText("input error");
//		expected.setContentText("Please enter an integer greater than 0 and less than 15");
//		expected.showAndWait();
//		assertEquals(actual, expected);
//		assertEquals(1,1);
//	}
}
