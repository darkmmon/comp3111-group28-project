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
    
    
    
    public void initialize() {
    	Num_Week.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                try {
                	if (!newValue) {
                		if (Num_Week.getText() == null || Num_Week.getText().trim().isEmpty()) {
                			Num_Week.setText("");
                		} else {
                			if (0 > Integer.parseInt(Num_Week.getText()) || 15 < Integer.parseInt(Num_Week.getText())) {
    	                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	                        alert.setTitle("error");
    	                        alert.setHeaderText("input error");
    	                        alert.setContentText("Please enter an integer greater than 0 and less than 15");
    	                        alert.showAndWait();
    	                        Num_Week.setText("");
    	                    } else {
    	
    	                    }
                		}
	                    
                	}
                } catch (NumberFormatException e) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("error");
                    alert.setHeaderText("input error");
                    alert.setContentText("Please enter the number greater than 0 and less than 15");
                    alert.showAndWait();
                    Num_Week.setText("");
                }
            }
        });
    	Cap_Labor.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                try {
                	if (!newValue) {
                		if (Cap_Labor.getText() == null || Cap_Labor.getText().trim().isEmpty()) {
                			Cap_Labor.setText("");
                		} else {
                			if (0 > Integer.parseInt(Cap_Labor.getText()) ) {
    	                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	                        alert.setTitle("error");
    	                        alert.setHeaderText("input error");
    	                        alert.setContentText("Please enter an integer greater than 0");
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
                    alert.setContentText("Please enter the number greater than 0");
                    alert.showAndWait();
                    Cap_Labor.setText("");
                }
            }
        });
    	Cap_Grape.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                try {
                	if (!newValue) {
                		if (Cap_Grape.getText() == null || Cap_Grape.getText().trim().isEmpty()) {
                			Cap_Grape.setText("");
                		} else {
                			if (0 > Integer.parseInt(Cap_Grape.getText())) {
    	                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	                        alert.setTitle("error");
    	                        alert.setHeaderText("input error");
    	                        alert.setContentText("Please enter an integer greater than 0");
    	                        alert.showAndWait();
    	                        Cap_Grape.setText("");
    	                    } else {
    	
    	                    }
                		}
	                    
                	}
                } catch (NumberFormatException e) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("error");
                    alert.setHeaderText("input error");
                    alert.setContentText("Please enter the number greater than 0");
                    alert.showAndWait();
                    Cap_Grape.setText("");
                }
            }
        });
    	Prc_Rose.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                try {
                	if (!newValue) {
                		if (Prc_Rose.getText() == null || Prc_Rose.getText().trim().isEmpty()) {
                			Prc_Rose.setText("");
                		} else {
                			if (0 > Double.parseDouble(Prc_Rose.getText())) {
    	                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	                        alert.setTitle("error");
    	                        alert.setHeaderText("input error");
    	                        alert.setContentText("Please enter a number greater than 0");
    	                        alert.showAndWait();
    	                        Prc_Rose.setText("");
    	                    } else {
    	
    	                    }
                		}
	                    
                	}
                } catch (NumberFormatException e) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("error");
                    alert.setHeaderText("input error");
                    alert.setContentText("Please enter the number greater than 0");
                    alert.showAndWait();
                    Prc_Rose.setText("");
                }
            }
        });
    	Prc_Noir.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                try {
                	if (!newValue) {
                		if (Prc_Noir.getText() == null || Prc_Noir.getText().trim().isEmpty()) {
                			Prc_Noir.setText("");
                		} else {
                			if (0 > Double.parseDouble(Prc_Noir.getText())) {
    	                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	                        alert.setTitle("error");
    	                        alert.setHeaderText("input error");
    	                        alert.setContentText("Please enter a number greater than 0");
    	                        alert.showAndWait();
    	                        Prc_Noir.setText("");
    	                    } else {
    	
    	                    }
                		}
	                    
                	}
                } catch (NumberFormatException e) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("error");
                    alert.setHeaderText("input error");
                    alert.setContentText("Please enter the number greater than 0");
                    alert.showAndWait();
                    Prc_Noir.setText("");
                }
            }
        });
    	Fixed_Costs.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                try {
                	if (!newValue) {
                		if (Fixed_Costs.getText() == null || Fixed_Costs.getText().trim().isEmpty()) {
                			Fixed_Costs.setText("");
                		} else {
                			if (0 > Integer.parseInt(Fixed_Costs.getText())) {
    	                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	                        alert.setTitle("error");
    	                        alert.setHeaderText("input error");
    	                        alert.setContentText("Please enter an integer greater than 0");
    	                        alert.showAndWait();
    	                        Fixed_Costs.setText("");
    	                    } else {
    	
    	                    }
                		}
	                    
                	}
                } catch (NumberFormatException e) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("error");
                    alert.setHeaderText("input error");
                    alert.setContentText("Please enter the number greater than 0");
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
    
    public void testinput(int a, int b, int c, double d, double e, int f) {
    	NumWeek = a;
    	CapLabor = b;
    	CapGrape = c;
    	PrcRose = d;
    	PrcNoir = e;
    	FixedCost = f;
    }
    
    public double[] testoutput() {
    	double[] output = {0,0,0,0,0,0,0};
    	output[0] = Opt_result[0];
    	output[1] = Opt_result[1];
    	output[2] = Opt_result[0]+Opt_result[1];
    	output[3] = Opt_result[2];
    	final DecimalFormat dfZero = new DecimalFormat("00.0");
    	output[4] = Double.parseDouble(dfZero.format(ProfitMargin));
    	if (w1) {
    		output[5] = 1;
    	}
    	if (w2) {
    		output[6] = 1;
    	}
    	return output;
    }
    
    public void parsing() {
    	NumWeek = Integer.parseInt(Num_Week.getText());
    	CapLabor = Integer.parseInt(Cap_Labor.getText());
    	CapGrape = Integer.parseInt(Cap_Grape.getText());
    	PrcRose = Double.parseDouble(Prc_Rose.getText());
    	PrcNoir = Double.parseDouble(Prc_Noir.getText());
    	FixedCost = Integer.parseInt(Fixed_Costs.getText());
    }
    
    public int NumWeek = 0, CapLabor = 0, CapGrape = 0, FixedCost = 0, OptNoir = 0, OptRose = 0;
	public double PrcRose = 0, PrcNoir = 0;
	public boolean w1 = false, w2 = false;
	public double ProfitMargin = 0;
	int[] Opt_result = {0,0,0};

	public void calculation() {
		double ProfitRose = PrcRose - 5 * 935 / (37.5*60);
    	double ProfitNoir = PrcNoir - 12 * 935 / (37.5*60);
    	
    	Opt_result = Solver.Solve_linear(CapLabor, CapGrape, ProfitRose, ProfitNoir);
    	Opt_result[2] = Opt_result[2]-FixedCost; //converting revenue to profit
    	ProfitMargin = Opt_result[2]*100 / (Opt_result[0]*PrcRose + Opt_result[1]*PrcNoir);
	}
	
    public void toclick(ActionEvent actionEvent) {
    	//declare variables
    	parsing();
    	
    	//function A adjustment of price for cost of labor
    	calculation();
    	
    	//output
    	or_Prod_Vol_Rose.setText(Integer.toString(Opt_result[0]));
		or_Prod_Vol_Noir.setText(Integer.toString(Opt_result[1]));
		or_Prod_Vol_Total.setText(Integer.toString(Opt_result[0]+Opt_result[1]));
		or_Gross_Profit.setText(Double.toString(Opt_result[2]));
		final DecimalFormat dfZero = new DecimalFormat("00.0");
		or_Profit_Margin.setText(dfZero.format(ProfitMargin));
		
		//error output
		String W1 = "w1: Insufficient production capacity to produce the optimal mix, please reduce or adjust the capacity of labor & grape volume!";
		String W2 = "w2: Insufficient labor supplied to utilize the grape resource (less than 90%)!";
		
    	ObservableList<String> items = FXCollections.observableArrayList();
    	w1 = 5000 * NumWeek < Opt_result[0] + Opt_result[1];
    	if ( w1 ) {
    		items.add(W1);
    	}
    	w2 = (Opt_result[0] * 6 + Opt_result[1] * 4) * 100 / CapGrape < 90;
    	if ( w2 ) {
    		items.add(W2);
    	}
        or_scroll_text1.setValueFactory(new SpinnerValueFactory.ListSpinnerValueFactory<String>(items));
    }
}
