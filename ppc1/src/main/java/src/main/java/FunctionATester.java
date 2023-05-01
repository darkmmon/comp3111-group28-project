package src.main.java;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
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
////		Application.launch(AsNonApp.class, new String[0]);
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
}
