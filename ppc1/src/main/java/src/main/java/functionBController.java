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
    private TextField or_Gross_Profit;

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
    public void initialize() {
    	
    	// Validation listeners
        WeekOfYear.focusedProperty().addListener(new ChangeListener<Boolean>() { // WeekOfYear validation
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                try {
                	if (!newValue) {
                		if (WeekOfYear.getText() == null || WeekOfYear.getText().trim().isEmpty()) {
                			WeekOfYear.setText("");
                		} else {
                			if (2301 > Integer.parseInt(WeekOfYear.getText()) || 2315 < Integer.parseInt(WeekOfYear.getText())) {
    	                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	                        alert.setTitle("error");
    	                        alert.setHeaderText("input error");
    	                        alert.setContentText("Please enter an integer greater than 2301 and less than 2315");
    	                        alert.showAndWait();
    	                        WeekOfYear.setText("");
    	                    } else {
    	
    	                    }
                		}
	                    
                	}
                } catch (NumberFormatException e) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("error");
                    alert.setHeaderText("input error");
                    alert.setContentText("Please enter the number greater than 2301 and less than 2315");
                    alert.showAndWait();
                    WeekOfYear.setText("");
                }
            }
        });
        Cap_Labor.textProperty().addListener(new ChangeListener<String>() { // Cap_Labor validation
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {
                    if (0 > Integer.parseInt(newValue)) {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("error");
                        alert.setHeaderText("input error");
                        alert.setContentText("Please enter an integer greater than 0");
                        alert.showAndWait();
                        Cap_Labor.setText("");
                    } else {

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
        Cap_Grape.textProperty().addListener(new ChangeListener<String>() { // Cap_Grape validation
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {
                    if (0 > Integer.parseInt(newValue)) {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("error");
                        alert.setHeaderText("input error");
                        alert.setContentText("Please enter an integer greater than 0");
                        alert.showAndWait();
                        Cap_Grape.setText("");
                    } else {

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
        Prc_Rose.focusedProperty().addListener(new ChangeListener<Boolean>() { // Prc_Rose validation
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                try {
                    if (!newValue) {
                    	if (Prc_Rose.getText() == null || Prc_Rose.getText().trim().isEmpty()) {
                    		
                    	} else {
	                    	if (0 > Double.parseDouble(Prc_Rose.getText())) {
	                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
	                            alert.setTitle("error");
	                            alert.setHeaderText("input error");
	                            alert.setContentText("Please enter a decimal number greater than 0");
	                            alert.showAndWait();
	                            Prc_Rose.setText("");
	                        } else {
	                        	Prc_Rose.setText(String.format("%.2f", Double.parseDouble(Prc_Rose.getText())));
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
        Prc_Noir.focusedProperty().addListener(new ChangeListener<Boolean>() { // Prc_Noir validation
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                try {
                    if (!newValue) {
                    	if (Prc_Noir.getText() == null || Prc_Noir.getText().trim().isEmpty()) {
                    		
                    	} else {
	                    	if (0 > Double.parseDouble(Prc_Rose.getText())) {
	                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
	                            alert.setTitle("error");
	                            alert.setHeaderText("input error");
	                            alert.setContentText("Please enter a decimal number greater than 0");
	                            alert.showAndWait();
	                            Prc_Noir.setText("");
	                        } else {
	                        	Prc_Noir.setText(String.format("%.2f", Double.parseDouble(Prc_Noir.getText())));
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
    }
    @FXML
    private void getDefaultValue(InputMethodEvent event) {

   
    }

    public void toexit(ActionEvent actionEvent) {Main.stage.setScene(Main.scene);
    }

    public void toclick(ActionEvent actionEvent) {
    	
    	// initializing local variables and retrieving input values
    	double temp_rev = 0.0;
    	int opt_rose = 0;
    	int opt_noir = 0;
    	int labor = Integer.parseInt(Cap_Labor.getText());
    	int grape = Integer.parseInt(Cap_Grape.getText());
    	double price_rose = Double.parseDouble(Prc_Rose.getText());
    	double price_noir = Double.parseDouble(Prc_Noir.getText());
    	
    	// linear programming
    	for (int temp_rose = 0; ; temp_rose++ ) {
    		if (temp_rose * 5 > labor || temp_rose * 6 > grape) break;
    		for (int temp_noir = 0; ; temp_noir++ ) {
    			if (temp_rose * 5 + temp_noir * 12 > labor || temp_rose * 6 + temp_noir * 4 > grape) break;
    			double cur_rev = temp_rose * price_rose + temp_noir * price_noir;
    			if (cur_rev > temp_rev) {
    				opt_rose = temp_rose;
    				opt_noir = temp_noir;
    				temp_rev = cur_rev;
    			}
    		}
    	}
    	
    	// update output fields
    	or_Prod_Vol_Rose.setText(Integer.toString(opt_rose));
		or_Prod_Vol_Noir.setText(Integer.toString(opt_noir));
		or_Prod_Vol_Total.setText(Integer.toString(opt_rose+opt_noir));
		or_Gross_Profit.setText(Double.toString(temp_rev));
		int sur_labor = labor - opt_rose * 5 - opt_noir * 12;
		if (sur_labor < 5) sur_labor = 0;
		int sur_grape = grape - opt_rose * 6 - opt_noir * 4;
		if (sur_grape < 4) sur_grape = 0;
		or_Sur_Labor.setText(Integer.toString(sur_labor));
		or_Sur_Grape.setText(Integer.toString(sur_grape));
		
		// 
        ObservableList<String> items = FXCollections.observableArrayList("");
        String W1 = "W1: Insufficient production capacity to produce the optimal mix, please reduce or adjust the capacity of labor & grape volume!";
        String W2 = "W2: Insufficient labor supplied to utilize the grape resource (less than 90%).";
        if (opt_rose + opt_noir > 5000) // w1
        	items.add(W1);
        if (sur_grape * 100 / grape > 10) // w2
        	items.add(W2);
        or_scroll_text1.setValueFactory(new SpinnerValueFactory.ListSpinnerValueFactory<String>(items));
    }
}
