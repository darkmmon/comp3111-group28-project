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
import java.text.DecimalFormat;


public class functionCController {

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
    private TextField Bko_Rose;
    
    @FXML
    private TextField Bko_Noir;
    
    @FXML
    private TextField or_Revenue;
    
    @FXML
    private TextField or_Backorder_Fulfilment;
    
    

    @FXML
    void buttonpressed(ActionEvent event) {

    }
    public void initialize() {
    	
    	WeekOfYear.focusedProperty().addListener(new ChangeListener<Boolean>() {
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
    	                        alert.setContentText("Please enter an integer from 2301 to 2315");
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
    	    	
    	Cap_Labor.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                try {
                	if (!newValue) {
                		if (Cap_Labor.getText() == null || Cap_Labor.getText().trim().isEmpty()) {
                			Cap_Labor.setText("");
                		} else {
                			if (0 > Integer.parseInt(Cap_Labor.getText()) || Integer.parseInt(Cap_Labor.getText()) > 99999999) {
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
    	
    	
    	Cap_Grape.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                try {
                	if (!newValue) {
                		if (Cap_Grape.getText() == null || Cap_Grape.getText().trim().isEmpty()) {
                			Cap_Grape.setText("");
                		} else {
                			if (0 > Integer.parseInt(Cap_Grape.getText()) || Integer.parseInt(Cap_Grape.getText()) > 99999999) {
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
                			if (0 > Double.parseDouble(Prc_Rose.getText()) || 10000 < Double.parseDouble(Prc_Rose.getText())) {
    	                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	                        alert.setTitle("error");
    	                        alert.setHeaderText("input error");
    	                        alert.setContentText("Please enter the number greater than 0 and less than 10,000");
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
                    alert.setContentText("Please enter the number greater than 0 and less than 10,000");
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
                			if (0 > Double.parseDouble(Prc_Noir.getText()) || 10000 < Double.parseDouble(Prc_Noir.getText())) {
    	                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	                        alert.setTitle("error");
    	                        alert.setHeaderText("input error");
    	                        alert.setContentText("Please enter the number greater than 0 and less than 10,000");
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
                    alert.setContentText("Please enter the number greater than 0 and less than 10,000");
                    alert.showAndWait();
                    Prc_Noir.setText("");
                }
            }
        });
        
    	
    	Bko_Rose.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                try {
                	if (!newValue) {
                		if (Bko_Rose.getText() == null || Bko_Rose.getText().trim().isEmpty()) {
                			Bko_Rose.setText("");
                		} else {
                			if (0 > Integer.parseInt(Bko_Rose.getText()) || Integer.parseInt(Bko_Rose.getText()) > 99999999) {
    	                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	                        alert.setTitle("error");
    	                        alert.setHeaderText("input error");
    	                        alert.setContentText("Please enter an integer greater or equal to 0 and less than 100,000,000");
    	                        alert.showAndWait();
    	                        Bko_Rose.setText("");
    	                    } else {

    	                    }
                		}

                	}
                } catch (NumberFormatException e) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("error");
                    alert.setHeaderText("input error");
                    alert.setContentText("Please enter the number greater or equal to 0 and less than 100,000,000");
                    alert.showAndWait();
                    Bko_Rose.setText("");
                }
            }
        });
        
        
    	Bko_Noir.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                try {
                	if (!newValue) {
                		if (Bko_Noir.getText() == null || Bko_Noir.getText().trim().isEmpty()) {
                			Bko_Noir.setText("");
                		} else {
                			if (0 > Integer.parseInt(Bko_Noir.getText()) || Integer.parseInt(Bko_Noir.getText()) > 99999999) {
    	                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	                        alert.setTitle("error");
    	                        alert.setHeaderText("input error");
    	                        alert.setContentText("Please enter an integer greater or equal to 0 and less than 100,000,000");
    	                        alert.showAndWait();
    	                        Bko_Noir.setText("");
    	                    } else {

    	                    }
                		}

                	}
                } catch (NumberFormatException e) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("error");
                    alert.setHeaderText("input error");
                    alert.setContentText("Please enter the number greater or equal to 0 and less than 100,000,000");
                    alert.showAndWait();
                    Bko_Noir.setText("");
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
    
    public void testInput(int a, int b, int c, double d, double e, int f, int g) {
    	CapLabor = b;
    	CapGrape = c;
    	PrcRose = d;
    	PrcNoir = e;
    	BkoRose = f;
    	BkoNoir = g;
    }
    
    public double[] testCalculation() {
    	double[] output = {0, 0, 0, 0};
    	output[0] = Opt_result[0];
    	output[1] = Opt_result[1];
    	output[2] = Opt_result[0]+Opt_result[1];
    	output[3] = Opt_result[2];
    	return output;
    }
    public String testBkoFulfill() {
    	String output = "";
		if (BkoFulfill) {
			output = "YES";
    	} else {
    		output = "NO";
    	}
    	return output;
    }
    public boolean[] testWarningState() {
    	boolean[] warningState = {false, false, false};
    	if (w1) {
    		warningState[0] = true;
    	}
    	if (w2) {
    		warningState[1] = true;
    	}
    	if (w3) {
    		warningState[2] = true;
    	}
    	return warningState;
    }
    
    private int CapLabor = 0, CapGrape = 0, OptNoir = 0, OptRose = 0, BkoRose = 0, BkoNoir = 0;
    private double PrcRose = 0, PrcNoir = 0;
    private boolean w1 = false, w2 = false, w3 = false;
    private boolean BkoFulfill = false;
    private int[] Opt_result = {0,0,0};
    
    public void calculation() {
		int BkoRoseLabor = BkoRose * 5;		//5 mins of labor per L
    	int BkoNoirLabor = BkoNoir * 12;	//12 mins of labor per L
    	int BkoRoseGrape = BkoRose * 6;		//6 kg of grapes per L
    	int BkoNoirGrape = BkoNoir * 4;		//4 kg of grapes per L
    	boolean BkoFulfillLabor = false, BkoFulfillGrape = false;
    	
    	if (CapLabor >= BkoRoseLabor + BkoNoirLabor) {
    		BkoFulfillLabor = true;
    	}else {
    		BkoFulfillLabor = false;
    	}
    	if (CapGrape >= BkoRoseGrape + BkoNoirGrape) {
    		BkoFulfillGrape = true;
    	}else {
    		BkoFulfillGrape = false;
    	}
    	
    	if (BkoFulfillLabor && BkoFulfillGrape) {
    		BkoFulfill = true;
    	}else {
    		BkoFulfill = false;
    	}
    	
    	if (BkoFulfill) {
    		CapLabor = CapLabor - ( BkoRoseLabor + BkoNoirLabor );
    		CapGrape = CapGrape - ( BkoRoseGrape + BkoNoirGrape );
    	}
    	
    	Opt_result = Solver.Solve_linear(CapLabor, CapGrape, PrcRose, PrcNoir);
    	OptRose = Opt_result[0];
    	OptNoir = Opt_result[1];
    	//Opt_result[0] = OptRose
    	//Opt_result[1] = OptNoir
    	//Opt_result[2] = OptRevenue
    	
    	int SurplusGrape = CapGrape - OptRose * 6 - OptNoir * 4;
		if (SurplusGrape < 4) {
			SurplusGrape = 0;
		}
    	w1 = OptRose + OptNoir > 5000;
		w2 = SurplusGrape * 100 / CapGrape > 10;
    	w3 = BkoRose + BkoNoir < ( OptRose + OptNoir ) * 0.7;
	}
    
    public String[] formattedOutput() {
    	final DecimalFormat zero_dp = new DecimalFormat("#");
    	String[] output = {"","","","",""};
    	output[0] = Integer.toString(Opt_result[0]);
		output[1] = Integer.toString(Opt_result[1]);
		output[2] = Integer.toString(Opt_result[0]+Opt_result[1]);
		output[3] = zero_dp.format(Opt_result[2]);
		if (BkoFulfill) {
			output[4] = "YES";
    	} else {
    		output[4] = "NO";
    	}
    	return output;
    }
    
    public ObservableList<String> warningText(){
    	String W1 = "W1: Insufficient production capacity to produce the optimal mix, please reduce or adjust the capacity of labor & grape volum!";
		String W2 = "W2: Insufficient labor supplied to utilize the grape resource (less than 90%)!";
    	String W3 = "W3: According to company policy, ratio of backorder volume should not lower than 70% of the optimal production volume!";	
		
    	ObservableList<String> items = FXCollections.observableArrayList();
    	
    	if ( w1 ) {
    		items.add(W1);
    	}
    	
    	if ( w2 ) {
    		items.add(W2);
    	}
    	
    	if ( w3 ) {
    		items.add(W3);
    	}
    	return items;
	}

    public void toclick(ActionEvent actionEvent) {
           	
    	CapLabor = Integer.parseInt(Cap_Labor.getText());		//Labor resource planned for the production cycle (min)
    	CapGrape = Integer.parseInt(Cap_Grape.getText());		//Grape resource planned for the production cycle (kg)
    	PrcRose = Double.parseDouble(Prc_Rose.getText());		//Price of Rose (A$)
    	PrcNoir = Double.parseDouble(Prc_Noir.getText());		//Price of Noir (A$)
    	BkoRose = Integer.parseInt(Bko_Rose.getText());		//Backorder volume of Rosé (L)
    	BkoNoir = Integer.parseInt(Bko_Noir.getText());		//Backorder volume of Noir (L)
    	
    	calculation();
    	String[] output = formattedOutput();    	
    	
    	or_Prod_Vol_Rose.setText(output[0]);
    	or_Prod_Vol_Noir.setText(output[1]);
    	or_Prod_Vol_Total.setText(output[2]);
    	or_Revenue.setText(output[3]);
    	or_Backorder_Fulfilment.setText(output[4]);
    	
    	ObservableList<String> items = warningText();
        or_scroll_text1.setValueFactory(new SpinnerValueFactory.ListSpinnerValueFactory<String>(items));
    }
}
