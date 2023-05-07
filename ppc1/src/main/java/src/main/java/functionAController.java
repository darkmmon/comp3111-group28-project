package src.main.java;

import java.text.DecimalFormat;

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
public class functionAController {

    @FXML
    private TextField Cap_Grape;
    
    @FXML
    private TextField Cap_Labor;

    @FXML
    private TextField Fixed_Costs;

    @FXML
    private Line HLine2;

    @FXML
    private Line HLine3;

    @FXML
    private Line HLine4;

    @FXML
    private Line HLine_1;

    @FXML
    private TextField Num_Week;

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
    private Label opt_result_heading1;

    @FXML
    private TextField or_Gross_Profit;

    @FXML
    private TextField or_Prod_Vol_Noir;

    @FXML
    private TextField or_Prod_Vol_Rose;

    @FXML
    private TextField or_Prod_Vol_Total;

    @FXML
    private TextField or_Profit_Margin;

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
    	Num_Week.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
            	boolean warning= false;
            	try {
                	if (!newValue) {
                		if (Num_Week.getText() == null || Num_Week.getText().trim().isEmpty()) {
                			Num_Week.setText("");
                		} else {
                			if (0 > Integer.parseInt(Num_Week.getText()) || 15 < Integer.parseInt(Num_Week.getText())) {
    	                        warning = true;
    	                    } else {
    	                    	
    	                    }
                		}
                	}
                } catch (NumberFormatException e) {
                    warning = true;
                }
            	if (warning){
            		Alert alert = new Alert(Alert.AlertType.INFORMATION);
            		alert.setTitle("error");
            		alert.setHeaderText("input error");
            		alert.setContentText("Please enter the number greater than 1 and less than 15");
            		alert.showAndWait();
            		Num_Week.setText("");	
                }
            }
        });
    	Cap_Labor.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
            	boolean warning= false;
            	try {
                	if (!newValue) {
                		if (Cap_Labor.getText() == null || Cap_Labor.getText().trim().isEmpty()) {
                			Cap_Labor.setText("");
                		} else {
                			if (0 > Integer.parseInt(Cap_Labor.getText()) || 100000000 < Integer.parseInt(Cap_Labor.getText())) {
    	                        warning = true;
    	                    } else {
    	                    	
    	                    }
                		}
                	}
                } catch (NumberFormatException e) {
                    warning = true;
                }
            	if (warning){
            		Alert alert = new Alert(Alert.AlertType.INFORMATION);
            		alert.setTitle("error");
            		alert.setHeaderText("input error");
            		alert.setContentText("Please enter the number greater than 1 and less than 100,000,000");
            		alert.showAndWait();
            		Cap_Labor.setText("");	
                }
            }
        });
    	Cap_Grape.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
            	boolean warning= false;
            	try {
                	if (!newValue) {
                		if (Cap_Grape.getText() == null || Cap_Grape.getText().trim().isEmpty()) {
                			Cap_Grape.setText("");
                		} else {
                			if (0 > Integer.parseInt(Cap_Grape.getText()) || 100000000 < Integer.parseInt(Cap_Grape.getText())) {
    	                        warning = true;
    	                    } else {
    	                    	
    	                    }
                		}
                	}
                } catch (NumberFormatException e) {
                    warning = true;
                }
            	if (warning){
            		Alert alert = new Alert(Alert.AlertType.INFORMATION);
            		alert.setTitle("error");
            		alert.setHeaderText("input error");
            		alert.setContentText("Please enter the number greater than 1 and less than 100,000,000");
            		alert.showAndWait();
            		Cap_Grape.setText("");	
                }
            }
        });
    	Prc_Rose.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
            	boolean warning= false;
            	try {
                	if (!newValue) {
                		if (Prc_Rose.getText() == null || Prc_Rose.getText().trim().isEmpty()) {
                			Prc_Rose.setText("");
                		} else {
                			if (0 > Integer.parseInt(Prc_Rose.getText()) || 10000 < Integer.parseInt(Prc_Rose.getText())) {
    	                        warning = true;
    	                    } else {
    	                    	
    	                    }
                		}
                	}
                } catch (NumberFormatException e) {
                    warning = true;
                }
            	if (warning){
            		Alert alert = new Alert(Alert.AlertType.INFORMATION);
            		alert.setTitle("error");
            		alert.setHeaderText("input error");
            		alert.setContentText("Please enter the number greater than 1 and less than 10000");
            		alert.showAndWait();
            		Prc_Rose.setText("");	
                }
            }
        });
    	Prc_Noir.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
            	boolean warning= false;
            	try {
                	if (!newValue) {
                		if (Prc_Noir.getText() == null || Prc_Noir.getText().trim().isEmpty()) {
                			Prc_Noir.setText("");
                		} else {
                			if (0 > Integer.parseInt(Prc_Noir.getText()) || 10000 < Integer.parseInt(Prc_Noir.getText())) {
    	                        warning = true;
    	                    } else {
    	                    	
    	                    }
                		}
                	}
                } catch (NumberFormatException e) {
                    warning = true;
                }
            	if (warning){
            		Alert alert = new Alert(Alert.AlertType.INFORMATION);
            		alert.setTitle("error");
            		alert.setHeaderText("input error");
            		alert.setContentText("Please enter the number greater than 1 and less than 10000");
            		alert.showAndWait();
            		Prc_Noir.setText("");	
                }
            }
        });
    	Fixed_Costs.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
            	boolean warning= false;
            	try {
                	if (!newValue) {
                		if (Fixed_Costs.getText() == null || Fixed_Costs.getText().trim().isEmpty()) {
                			Fixed_Costs.setText("");
                		} else {
                			if (0 > Integer.parseInt(Fixed_Costs.getText()) || 100000000 < Integer.parseInt(Fixed_Costs.getText())) {
    	                        warning = true;
    	                    } else {
    	                    	
    	                    }
                		}
                	}
                } catch (NumberFormatException e) {
                    warning = true;
                }
            	if (warning){
            		Alert alert = new Alert(Alert.AlertType.INFORMATION);
            		alert.setTitle("error");
            		alert.setHeaderText("input error");
            		alert.setContentText("Please enter the number greater than 1 and less than 100,000,000");
            		alert.showAndWait();
            		Fixed_Costs.setText("");	
                }
            }
        });
    }

    
    @FXML
    private void getDefaultValue(InputMethodEvent event) {
    
    }
    
    

    public void toexit(ActionEvent actionEvent) {
    	Main.stage.setScene(Main.scene);
    }
    
    /**
     * Testing method to pass inputs to other methods without user input
     * @param a NumWeek - Number of Week (accepts 1-15)
     * @param b CapLabor - Labor Capacity (accepts positive int)
     * @param c CapGrape - Grape Capacity (accepts positive int)
     * @param d PrcRose - Unit Price of Rose (accepts positive double, corrected to 2 decimal places)
     * @param e PrcNoir - Unit Price of Noir (accepts positive double, corrected to 2 decimal places)
     * @param f FixedCost - Fixed Cost of the entire production (accept positive int)
     *
     */
    
    public void testInput(int a, int b, int c, double d, double e, int f) {
    	NumWeek = a;
    	CapLabor = b;
    	CapGrape = c;
    	PrcRose = d;
    	PrcNoir = e;
    	FixedCost = f;
    }
    /**
     * Testing method to return output from linear programming method in Solver.java
     * @return an array of outputs: [OptRose, OptNoir, OptTotal, GrossProfit, ProfitMargin]
     */
    public double[] testCalculation() {
    	double[] output = {0,0,0,0,0};
    	output[0] = Opt_result[0];
    	output[1] = Opt_result[1];
    	output[2] = Opt_result[0]+Opt_result[1];
    	output[3] = Opt_result[2];
    	output[4] = ProfitMargin;
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
    private int NumWeek = 0, CapLabor = 0, CapGrape = 0, FixedCost = 0, OptNoir = 0, OptRose = 0;
    private double PrcRose = 0, PrcNoir = 0;
    private boolean w1 = false, w2 = false;
    private double ProfitMargin = 0;
	private int[] Opt_result = {0,0,0};
	
	/**
	 * Method to call solver and store outputs in array Opt_result
	 */
	public void calculation() {
		double ProfitRose = PrcRose - 5 * 935 / (37.5*60);
    	double ProfitNoir = PrcNoir - 12 * 935 / (37.5*60);
    	
    	Opt_result = Solver.Solve_linear(CapLabor, CapGrape, ProfitRose, ProfitNoir);
    	Opt_result[2] = Opt_result[2]-FixedCost; //converting revenue to profit
    	ProfitMargin = Opt_result[2]*100 / (Opt_result[0]*PrcRose + Opt_result[1]*PrcNoir);
    	
    	w1 = 5000 * NumWeek < Opt_result[0] + Opt_result[1];
    	w2 = (Opt_result[0] * 6 + Opt_result[1] * 4) * 100 / CapGrape < 90;
	}
	
	/**
	 * Method to convert output values to strings
	 * @return array of String: [OptRose, OptNoir, OptTotal, GrossProfit, ProfitMargin]
	 */
	public String[] formattedOutput() {
		final DecimalFormat zero_dp = new DecimalFormat("#");
		final DecimalFormat one_dp = new DecimalFormat("00.00");
		String[] output = {"","","","",""};
		output[0] = Integer.toString(Opt_result[0]);
		output[1] = Integer.toString(Opt_result[1]);
		output[2] = Integer.toString(Opt_result[0]+Opt_result[1]);
		output[3] = zero_dp.format(Opt_result[2]);
		output[4] = one_dp.format(ProfitMargin);
		return output;
	}
	/**
	 * Adds warning messages according to warning states [w1, w2]
	 * @return Observable List of warning message Strings
	 */
	public ObservableList<String> warningText(){
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
    	//declare variables

    	NumWeek = Integer.parseInt(Num_Week.getText());
    	CapLabor = Integer.parseInt(Cap_Labor.getText());
    	CapGrape = Integer.parseInt(Cap_Grape.getText());
    	PrcRose = Double.parseDouble(Prc_Rose.getText());
    	PrcNoir = Double.parseDouble(Prc_Noir.getText());
    	FixedCost = Integer.parseInt(Fixed_Costs.getText());
    	
    	//function A adjustment of price for cost of labor
    	calculation();
    	
    	//output
    	String[] output = formattedOutput();
    	or_Prod_Vol_Rose.setText(output[0]);
		or_Prod_Vol_Noir.setText(output[1]);
		or_Prod_Vol_Total.setText(output[2]);
		or_Gross_Profit.setText(output[3]);
		or_Profit_Margin.setText(output[4]);
		
		//error output
		
    	ObservableList<String> items = warningText();
        or_scroll_text1.setValueFactory(new SpinnerValueFactory.ListSpinnerValueFactory<String>(items));
    }
}
