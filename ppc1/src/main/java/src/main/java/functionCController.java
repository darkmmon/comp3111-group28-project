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
import java.text.NumberFormat;
import java.util.Locale;


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

    public void toexit(ActionEvent actionEvent) {Main.stage.setScene(Main.scene);
    }
    
    //private int  = 0;
    private int CapLabor = 0, CapGrape = 0, OptNoir = 0, OptRose = 0, BkoRose = 0, BkoNoir = 0;
    private double PrcRose = 0, PrcNoir = 0;
    private boolean w1 = false, w2 = false, w3 = false;
    private boolean BkoFulfill = false;
    //private double ProfitMargin = 0;
    private int[] Opt_result = {0,0,0};
    
    public void calculation() {
		//double ProfitRose = PrcRose - 5 * 935 / (37.5*60);
    	//double ProfitNoir = PrcNoir - 12 * 935 / (37.5*60);

    	Opt_result = Solver.Solve_linear(CapLabor, CapGrape, PrcRose, PrcNoir);
    	//Opt_result[2] = Opt_result[2]-FixedCost; //converting revenue to profit
    	//ProfitMargin = Opt_result[2]*100 / (Opt_result[0]*PrcRose + Opt_result[1]*PrcNoir);
    	int BkoRoseLabor = BkoRose * 5;	//5 mins of labor per L
    	int BkoRoseGrape = BkoRose * 6;	//6 kg of grapes per L
    	int BkoNoirLabor = BkoNoir * 12;	//12 mins of labor per L
    	int BkoNoirGrape = BkoNoir * 4;	//4 kg of grapes per L
    	boolean BkoFulfillLabor = false, BkoFulfillGrape = false;
    	
    	if (CapLabor >= BkoRoseLabor + BkoNoirLabor) {
    		BkoFulfillLabor = true;
    	}
    	if (CapGrape >= BkoRoseGrape + BkoNoirGrape) {
    		BkoFulfillGrape = true;
    	}
    	
    	if (BkoFulfillLabor && BkoFulfillGrape) {
    		BkoFulfill = true;
    	}
    	
    	if (BkoFulfill) {
    		CapLabor = CapLabor - ( BkoRoseLabor + BkoNoirLabor );
    		CapGrape = CapGrape - ( BkoRoseGrape + BkoNoirGrape );
    	}

    	//w1 = 5000 * NumWeek < Opt_result[0] + Opt_result[1];
    	//w2 = (Opt_result[0] * 6 + Opt_result[1] * 4) * 100 / CapGrape < 90;
    	int SurplusGrape = CapGrape - OptRose * 6 - OptNoir * 4;
		if (SurplusGrape < 4) {
			SurplusGrape = 0;
		}
    	w1 = OptRose + OptNoir > 5000;
    	w2 = SurplusGrape * 100 / CapGrape > 10;
    	w3 = BkoRose + BkoNoir < ( OptRose + OptNoir ) * 0.7;
	}

    public void toclick(ActionEvent actionEvent) {
        
    	int Opt_Rose = 0;		//Number of litres to be produced for Rosé 
    	int Opt_Noir = 0;		//Number of litres to be produced for Noir
    	int Opt_Revenue = 0;	//Optimized Sales Revenue 
    	Boolean Bko_fulfill = false;	//Sufficient resource of labor and grape to produce backorders of Bko_Rosé + Bko_Noir
    	
    	int Capacity_Labor = Integer.parseInt(Cap_Labor.getText());		//Labor resource planned for the production cycle (min)
    	int Capacity_Grape = Integer.parseInt(Cap_Grape.getText());		//Grape resource planned for the production cycle (kg)
    	double Price_Rose = Double.parseDouble(Prc_Rose.getText());		//Price of Rose (A$)
    	double Price_Noir = Double.parseDouble(Prc_Noir.getText());		//Price of Noir (A$)
    	int Backorder_Rose = Integer.parseInt(Bko_Rose.getText());		//Backorder volume of Rosé (L)
    	int Backorder_Noir = Integer.parseInt(Bko_Noir.getText());		//Backorder volume of Noir (L)
    	
    	int Bko_Rose_Labor = Backorder_Rose * 5;	//5 mins of labor per L
    	int Bko_Rose_Grape = Backorder_Rose * 6;	//6 kg of grapes per L
    	int Bko_Noir_Labor = Backorder_Noir * 12;	//12 mins of labor per L
    	int Bko_Noir_Grape = Backorder_Noir * 4;	//4 kg of grapes per L
    	
    	Boolean Bko_fulfill_labor = false;
    	Boolean Bko_fulfill_grape = false;
    	if (Capacity_Labor >= Bko_Rose_Labor + Bko_Noir_Labor) {
    		Bko_fulfill_labor = true;
    	}
    	if (Capacity_Grape >= Bko_Rose_Grape + Bko_Noir_Grape) {
    		Bko_fulfill_grape = true;
    	}
    	
    	if (Bko_fulfill_labor && Bko_fulfill_grape) {
    		Bko_fulfill = true;
    	}
    	
    	if (Bko_fulfill) {
    		Capacity_Labor = Capacity_Labor - ( Bko_Rose_Labor + Bko_Noir_Labor );
    		Capacity_Grape = Capacity_Grape - ( Bko_Rose_Grape + Bko_Noir_Grape );
    	}
    	
    	for (int rose = 0; ; rose++ ) {
    		if (rose * 5 > Capacity_Labor || rose * 6 > Capacity_Grape) break;
    		for (int noir = 0; ; noir++ ) {
    			if (rose * 5 + noir * 12 > Capacity_Labor || rose * 6 + noir * 4 > Capacity_Grape) break;
    			int revenue = (int) Math.round(rose * Price_Rose + noir * Price_Noir);
    			if (revenue > Opt_Revenue) {
    				Opt_Rose = rose;
    				Opt_Noir = noir;
    				Opt_Revenue = revenue;
    			}
    		}
    	}
    	
    	//or_Prod_Vol_Rose
    	//or_Prod_Vol_Rose.setText(Integer.toString(Opt_Rose));
    	
    	Locale locale = Locale.getDefault();
        NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
        String formattedOpt_Rose = numberFormat.format(Opt_Rose);
        or_Prod_Vol_Rose.setText(formattedOpt_Rose);
    	//or_Prod_Vol_Noir
        String formattedOpt_Noir = numberFormat.format(Opt_Noir);
    	or_Prod_Vol_Noir.setText(formattedOpt_Noir);
    	//or_Prod_Vol_Total
    	int Total = Opt_Rose + Opt_Noir;
    	String formattedTotal = numberFormat.format(Total);
    	or_Prod_Vol_Total.setText(formattedTotal);
    	//or_Revenue
    	String formattedRevenue = numberFormat.format(Opt_Revenue);
    	or_Revenue.setText(formattedRevenue);
    	//or_Backorder_Fulfilment
    	if (Bko_fulfill) {
    		or_Backorder_Fulfilment.setText("YES");
    	} else {
    		or_Backorder_Fulfilment.setText("NO");
    	}
    	
    	int Surplus_grape = Capacity_Grape - Opt_Rose * 6 - Opt_Noir * 4;
		if (Surplus_grape < 4) {
			Surplus_grape = 0;
		}
		
		String W1 = "W1: Insufficient production capacity to produce the optimal mix, please reduce or adjust the capacity of labor & grape volum!";
		String W2 = "W2: Insufficient labor supplied to utilize the grape resource (less than 90%)!";
    	String W3 = "W3: According to company policy, ratio of backorder volume should not lower than 70% of the optimal production volume!";	
		
    	ObservableList<String> items = FXCollections.observableArrayList();
    	
    	if ( Opt_Rose + Opt_Noir > 5000 ) {
    		items.add(W1);
    	}
    	
    	if ( Surplus_grape * 100 / Capacity_Grape > 10 ) {
    		items.add(W2);
    	}
    	
    	if ( Backorder_Rose + Backorder_Noir < ( Opt_Rose + Opt_Noir ) * 0.7 ) {
    		items.add(W3);
    	}
    			
        or_scroll_text1.setValueFactory(new SpinnerValueFactory.ListSpinnerValueFactory<String>(items));
    	
    }
}
