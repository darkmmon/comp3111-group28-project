package src.main.java;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;

/**
 * Controller for function B - Weekly Review by Revenue
 * @author LEUNG Kam Ming 20863408
 *
 */
public class functionBController {

    @FXML
    private TextField Cap_Grape;
    
    @FXML
    private TextField Cap_Labor;

    @FXML
    private Line HLine2;

    @FXML
    private Line HLine3;

    @FXML
    private Line HLine4;

    @FXML
    private Line HLine_1;

    @FXML
    private TextField WeekOfYear;

    @FXML
    private TextField Prc_Noir;

    @FXML
    private TextField Prc_Rose;

    @FXML
    private Line VLine1;

    @FXML
    private Line VLine2;

    @FXML
    private Button button_exit1;

    @FXML
    private Button button_run1;

    @FXML
    private Label data_input_caption1;

    @FXML
    private Label data_input_caption2;

    @FXML
    private Label data_input_caption2a;

    @FXML
    private Label data_input_caption2b;

    @FXML
    private Label data_input_caption3;

    @FXML
    private Label data_input_caption3a;

    @FXML
    private Label data_input_caption3b;

    @FXML
    private Label data_input_caption4;

    @FXML
    private Label data_input_heading1;

    @FXML
    private Label form_heading1;

    @FXML
    private AnchorPane label_col_heading2;

    @FXML
    private Label label_sysmsg1;

    @FXML
    private Label opt_r_caption1;

    @FXML
    private Label opt_r_caption1a;

    @FXML
    private Label opt_r_caption1b;

    @FXML
    private Label opt_r_caption1c;

    @FXML
    private Label opt_r_caption2;

    @FXML
    private Label opt_r_caption3;

    @FXML
    private Label opt_r_caption4;
    
    @FXML
    private Label opt_result_heading1;

    @FXML
    private TextField or_Revenue;

    @FXML
    private TextField or_Prod_Vol_Noir;

    @FXML
    private TextField or_Prod_Vol_Rose;

    @FXML
    private TextField or_Prod_Vol_Total;

    @FXML
    private TextField or_Sur_Labor;
    
    @FXML
    private TextField or_Sur_Grape;

    @FXML
    private Spinner<String> or_scroll_text1;

    @FXML
    private Line vLine3;

    @FXML
    void buttonpressed(ActionEvent event) {

    }
    
    /**
     * Method to initialize field validation listeners for all input fields
     */
    public void initialize() {
    	
    	// Validation listeners
        WeekOfYear.focusedProperty().addListener(new ChangeListener<Boolean>() { // WeekOfYear validation
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
            	boolean warning = false;
                try {
                	if (!newValue) {
                		if (WeekOfYear.getText() == null || WeekOfYear.getText().trim().isEmpty()) {
                			WeekOfYear.setText("");
                		} else {
                			if (2301 > Integer.parseInt(WeekOfYear.getText()) || 2315 < Integer.parseInt(WeekOfYear.getText())) {
    	                        warning = true;
    	                    } else {
    	
    	                    }
                		}
                	}
                } catch (NumberFormatException e) {
                    warning = true;
                }
                if (warning) {
                	Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("error");
                    alert.setHeaderText("input error");
                    alert.setContentText("Please enter an integer greater than 2301 and less than 2315");
                    alert.showAndWait();
                    WeekOfYear.setText("");
                }
            }
        });
        Cap_Labor.focusedProperty().addListener(new ChangeListener<Boolean>() { // Cap_Labor validation
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
            	boolean warning = false;
            	try {
                	if (!newValue) {
                		if (Cap_Labor.getText() == null || Cap_Labor.getText().trim().isEmpty()) {
                			Cap_Labor.setText("");
                		} else {
                			if (0 > Integer.parseInt(Cap_Labor.getText()) || 99999999 < Integer.parseInt(Cap_Labor.getText())) {
    	                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	                        alert.setTitle("error");
    	                        alert.setHeaderText("input error");
    	                        alert.setContentText("Please enter an integer greater than 0 and less than 100,000,000");
    	                        alert.showAndWait();
    	                        Cap_Labor.setText("");
    	                    } else {
    	
    	                    }
                		}
                	}
                } catch (NumberFormatException e) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("error");
                    alert.setHeaderText("input error");
                    alert.setContentText("Please enter the number greater than 0 and less than 100,000,000");
                    alert.showAndWait();
                    Cap_Labor.setText("");
                }
            }
        });
        Cap_Grape.focusedProperty().addListener(new ChangeListener<Boolean>() { // Cap_Grape validation
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
            	boolean warning = false;
            	try {
                	if (!newValue) {
                		if (Cap_Labor.getText() == null || Cap_Labor.getText().trim().isEmpty()) {
                			Cap_Labor.setText("");
                		} else {
                			if (0 > Integer.parseInt(Cap_Grape.getText()) || 99999999 < Integer.parseInt(Cap_Grape.getText())) {
                                warning = true;
                            } else {

                            }
                		}
                	}
                } catch (NumberFormatException e) {
                    warning = true;
                }
            	if (warning) {
            		Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("error");
                    alert.setHeaderText("input error");
                    alert.setContentText("Please enter the number greater than 0 and less than 100,000,000");
                    alert.showAndWait();
                    Cap_Grape.setText("");
            	}
            }
        });
        Prc_Rose.focusedProperty().addListener(new ChangeListener<Boolean>() { // Prc_Rose validation
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
            	boolean warning = false;
            	try {
                    if (!newValue) {
                    	if (Prc_Rose.getText() == null || Prc_Rose.getText().trim().isEmpty()) {
                    		
                    	} else {
	                    	if (0 > Double.parseDouble(Prc_Rose.getText()) || 10000 < Double.parseDouble(Prc_Rose.getText())) {
	                            warning = true;
	                        } else {
	                        	Prc_Rose.setText(String.format("%.2f", Double.parseDouble(Prc_Rose.getText())));
	                        }
                    	}
                    }
                } catch (NumberFormatException e) {
                    warning = true;
                }
            	if (warning) {
            		Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("error");
                    alert.setHeaderText("input error");
                    alert.setContentText("Please enter the number greater than 0 and less than 10,000");
                    alert.showAndWait();
                    Prc_Rose.setText("");
            	}
            }
        });
        Prc_Noir.focusedProperty().addListener(new ChangeListener<Boolean>() { // Prc_Noir validation
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
            	boolean warning = false;
            	try {
                    if (!newValue) {
                    	if (Prc_Noir.getText() == null || Prc_Noir.getText().trim().isEmpty()) {
                    		
                    	} else {
	                    	if (0 > Double.parseDouble(Prc_Noir.getText()) || 10000 < Double.parseDouble(Prc_Noir.getText())) {
	                            warning = true;
	                        } else {
	                        	Prc_Noir.setText(String.format("%.2f", Double.parseDouble(Prc_Noir.getText())));
	                        }
                    	}
                    }
                } catch (NumberFormatException e) {
                    warning = true;
                }
            	if (warning) {
            		Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("error");
                    alert.setHeaderText("input error");
                    alert.setContentText("Please enter the number greater than 0 and less than 10,000");
                    alert.showAndWait();
                    Prc_Noir.setText("");
            	}
            }
        });
    }
    @FXML
    private void getDefaultValue(InputMethodEvent event) {

    }

    public void toexit(ActionEvent actionEvent) {Main.stage.setScene(Main.scene);
    }
    
    /**
     * Testing method to pass inputs to other methods without user input
     * @param a CapLabor - Labor Capacity (accepts positive int)
     * @param b CapGrape - Grape Capacity (accepts positive int)
     * @param c PrcRose - Unit Price of Rose (accepts positive double, corrected to 2 decimal places)
     * @param d PrcNoir - Unit Price of Noir (accepts positive double, corrected to 2 decimal places)
     */
    public void testInput(int a, int b, double c, double d) {
    	CapLabor = a;
    	CapGrape = b;
    	PrcRose = c;
    	PrcNoir = d;
    }
    
    /**
     * Testing method to return output from linear programming method in Solver.java
     * @return an array of outputs: [OptRose, OptNoir, OptTotal, Revenue, SurLabor, SurGrape]
     */
    public int[] testCalculation() {
    	int[] output = {0,0,0,0,0,0};
    	output[0] = Opt_result[0];
    	output[1] = Opt_result[1];
    	output[2] = Opt_result[0]+Opt_result[1];
    	output[3] = Opt_result[2];
    	output[4] = SurLabor;
    	output[5] = SurGrape;
    	return output;
    }
    
    /**
     * Testing method to return warning states
     * @return array of booleans: [w1, w2] corresponding to warning states 1 and 2
     */
    public boolean[] testWarningState() {
    	boolean[] warningState = {false, false};
    	if (w1) {
    		warningState[0] = true;
    	}
    	if (w2) {
    		warningState[1] = true;
    	}
    	return warningState;
    }
    
    // global variables
    private int CapLabor = 0, CapGrape = 0, OptNoir = 0, OptRose = 0, SurLabor = 0, SurGrape = 0;
    private double PrcRose = 0, PrcNoir = 0;
    private boolean w1 = false, w2 = false;
	private int[] Opt_result = {0,0,0};
	
	/**
	 * Method to call solver and store outputs in array Opt_result
	 */
	public void calculation() {
		Opt_result = Solver.Solve_linear(CapLabor, CapGrape, PrcRose, PrcNoir);
		OptRose = Opt_result[0];
		OptNoir = Opt_result[1];
		SurLabor = CapLabor - OptRose * 5 - OptNoir * 12;
		if (SurLabor < 5) SurLabor = 0;
		SurGrape = CapGrape - OptRose * 6 - OptNoir * 4;
		if (SurGrape < 4) SurGrape = 0;
		
		w1 = OptRose + OptNoir > 5000;
		w2 = SurGrape * 100 / CapGrape > 10;
	}
	
	/**
	 * Method to convert output values to strings
	 * @return array of String: [OptRose, OptNoir, OptTotal, Revenue, SurLabor, SurGrape]
	 */
	public String[] formattedOutput() {
		String[] output = {"","","","","",""};
		output[0] = Integer.toString(Opt_result[0]);
		output[1] = Integer.toString(Opt_result[1]);
		output[2] = Integer.toString(Opt_result[0]+Opt_result[1]);
		output[3] = Integer.toString(Opt_result[2]);
		output[4] = Integer.toString(SurLabor);
		output[5] = Integer.toString(SurGrape);
		return output;
	}
	
	/**
	 * Adds warning messages according to warning states [w1, w2]
	 * @return Observable List of warning message Strings
	 */
	public ObservableList<String> warningText() {
		String W1 = "w1: Insufficient production capacity to produce the optimal mix, please reduce or adjust the capacity of labor & grape volume!";
        String W2 = "w2: Insufficient labor supplied to utilize the grape resource (less than 90%)!";
		
    	ObservableList<String> items = FXCollections.observableArrayList();
    	if ( w1 ) {
    		items.add(W1);
    	}
    	if ( w2 ) {
    		items.add(W2);
    	}
    	return items;
	}
	
	/**
	 * Method when "Run" button is clicked in the UI.
	 * retrieves values from inputs, calls calculation method, stores output values in output fields, and
	 * show corresponding warnings.
	 * @param actionEvent When user clicks the "Run" button
	 */
    public void toclick(ActionEvent actionEvent) {
    	
    	// initializing local variables and retrieving input values
    	CapLabor = Integer.parseInt(Cap_Labor.getText());
    	CapGrape = Integer.parseInt(Cap_Grape.getText());
    	PrcRose = Double.parseDouble(Prc_Rose.getText());
    	PrcNoir = Double.parseDouble(Prc_Noir.getText());
    	
    	// linear programming
    	calculation();
    	
    	// update output fields
    	String[] output = formattedOutput();
    	or_Prod_Vol_Rose.setText(output[0]);
		or_Prod_Vol_Noir.setText(output[1]);
		or_Prod_Vol_Total.setText(output[2]);
		or_Revenue.setText(output[3]);
		or_Sur_Labor.setText(output[4]);
		or_Sur_Grape.setText(output[5]);
		
		// display warnings
		ObservableList<String> items = warningText();
        or_scroll_text1.setValueFactory(new SpinnerValueFactory.ListSpinnerValueFactory<String>(items));
    }
}
