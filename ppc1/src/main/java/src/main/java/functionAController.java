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
    
    public static int calSalesRevenue(int Opt_Rosé, int Prc_Rosé, int Opt_Noir, int Prc_Noir) {
    	return (Opt_Rosé * Prc_Rosé) + (Opt_Noir * Prc_Noir);
    }
    
    public static double calVCL(int Opt_Rosé, int Opt_Noir) {
    	return Opt_Rosé * 5 / calLaborRate() + Opt_Noir * 12 / calLaborRate();
    }
    
    public static double calLaborRate() {
    	return (935/(37.5*60));
    }

    public void toexit(ActionEvent actionEvent) {
    	Main.stage.setScene(Main.scene);
    }
    
    private void setoutput(int Opt_noir, int Opt_Rose, int PM, int GP) {
    }

    public void toclick(ActionEvent actionEvent) {
    	// input parsing
    	int week = Integer.parseInt(Num_Week.getText());
    	int labor = Integer.parseInt(Cap_Labor.getText());
    	int grape = Integer.parseInt(Cap_Grape.getText());
    	double PR = Double.parseDouble(Prc_Rose.getText());
    	double PN = Double.parseDouble(Prc_Noir.getText());
    	int fixed = Integer.parseInt(Fixed_Costs.getText());
    	
    	double Opt_gross_profit = 0;
    	int Opt_Noir = 0;
    	int Opt_Rose = 0;
    	double Opt_sales_revenue = 0;
    	for (int temp_rose = 0; ; temp_rose++ ) {
    		if (temp_rose * 5 > labor || temp_rose * 6 > grape) break;
    		for (int temp_noir = 0; ; temp_noir++ ) {
    			if (temp_rose * 5 + temp_noir * 12 > labor || temp_rose * 6 + temp_noir * 4 > grape) break;
    			double VCL = (temp_rose * 5 + temp_noir * 12) * 935/(37.5*60);
    			double sales_revenue = (temp_rose * PR) + (temp_noir * PN);
    			double temp_gross_profit = sales_revenue - VCL - fixed;
    			if (Opt_gross_profit < temp_gross_profit) {
    				Opt_Rose = temp_rose;
    				Opt_Noir = temp_noir;
    				Opt_gross_profit = temp_gross_profit;
    				Opt_sales_revenue = sales_revenue;
    			}
    		}
    	}
    	or_Prod_Vol_Rose.setText(Integer.toString(Opt_Rose));
		or_Prod_Vol_Noir.setText(Integer.toString(Opt_Noir));
		or_Prod_Vol_Total.setText(Integer.toString(Opt_Rose+Opt_Noir));
		or_Gross_Profit.setText(Double.toString(Opt_gross_profit));
		double profit_margin = Opt_gross_profit*100/Opt_sales_revenue;
		or_Profit_Margin.setText(Double.toString(profit_margin));
		
		String W1 = "w1: Insufficient production capacity to produce the optimal mix, please reduce or adjust the capacity of labor & grape volume!";
		String W2 = "w2: Insufficient labor supplied to utilize the grape resource (less than 90%)!";
		
    	ObservableList<String> items = FXCollections.observableArrayList();
    	
    	if ( 5000 * week < Opt_Rose + Opt_Noir ) {
    		items.add(W1);
    	}
    	
    	double Surplus_grape = grape - Opt_Rose * 6 + Opt_Noir * 4;
    	
    	if ( Surplus_grape * 100 / grape > 10 ) {
    		items.add(W2);
    	}
    			
        or_scroll_text1.setValueFactory(new SpinnerValueFactory.ListSpinnerValueFactory<String>(items));
    }
}
