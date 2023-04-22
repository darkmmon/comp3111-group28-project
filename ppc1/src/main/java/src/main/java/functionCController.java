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
import java.util.regex.Pattern;


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
    void buttonpressed(ActionEvent event) {

    }
    public void initialize() {
    	
    	//Input Validation for WeekOfYear
    	WeekOfYear.textProperty().addListener(new ChangeListener<String>() {
    		@Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {
                    if (!newValue.matches("(2)") &&
    	    			!newValue.matches("(23)") &&
    	    			!newValue.matches("(23)[0-1]") &&
    	    			!newValue.matches("(23)(0[1-9]|1[0-5])")) {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Error");
                        alert.setHeaderText("Input Error");
                        alert.setContentText("Please enter a number from 2301 to 2315");
                        alert.showAndWait();
                        WeekOfYear.setText("");
                    }
                } catch (NumberFormatException e) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Error");
                    alert.setHeaderText("Input Error");
                    alert.setContentText("Please enter a valid integer");
                    alert.showAndWait();
                    WeekOfYear.setText("");
                }
            }
    	});
    	
    	//Input Validation for Cap_Labor
    	Cap_Labor.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {
                    if (!newValue.matches("^(?!0)\\d{1,8}$")) {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("error");
                        alert.setHeaderText("input error");
                        alert.setContentText("Please enter an integer from 1 to 99,999,999");
                        alert.showAndWait();
                        Cap_Labor.setText("");
                    } else {

                    }
                } catch (NumberFormatException e) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("error");
                    alert.setHeaderText("input error");
                    alert.setContentText("Please enter the number from 1 to 99,999,999");
                    alert.showAndWait();
                    Cap_Labor.setText("");
                }
            }
        });
    	//Input Validation for Cap_Grape
    	Cap_Grape.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {
                    if (!newValue.matches("^(?!0)\\d{1,8}$")) {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("error");
                        alert.setHeaderText("input error");
                        alert.setContentText("Please enter an integer from 1 to 99,999,999");
                        alert.showAndWait();
                        Cap_Grape.setText("");
                    } else {

                    }
                } catch (NumberFormatException e) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("error");
                    alert.setHeaderText("input error");
                    alert.setContentText("Please enter the number from 1 to 99,999,999");
                    alert.showAndWait();
                    Cap_Grape.setText("");
                }
            }
        });
    	//Input Validation for Prc_Rose Float.parseFloat
    	Prc_Rose.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
            	//Pattern pattern = Pattern.compile("^([1-9]\\d{0,3}(\\.\\d{1,2})?|9999\\.99)$");
                try {
                    if (Float.parseFloat(newValue) < 1.00 || Float.parseFloat(newValue) >= 10000.00) { 
                    	Alert alert = new Alert(Alert.AlertType.INFORMATION);
                		alert.setTitle("error");
                		alert.setHeaderText("input error");
                		alert.setContentText("Please enter an float from 1 to 9,999.99");
                		alert.showAndWait();
                		Prc_Rose.setText("");
                    	
                    } else if (!newValue.matches("^-?\\d+(\\.\\d{0,2})?$")) {
                    	Alert alert = new Alert(Alert.AlertType.INFORMATION);
                		alert.setTitle("error");
                		alert.setHeaderText("input error");
                		alert.setContentText("lease enter an float from 1 to 9,999.99");
                		alert.showAndWait();
                		Prc_Rose.setText("");
                	}
                } catch (NumberFormatException e) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("error");
                    alert.setHeaderText("input error");
                    alert.setContentText("Please enter the number from 1 to 9,999.99");
                    alert.showAndWait();
                    Prc_Rose.setText("");
                }
            }
        });
    	//Input Validation for Prc_Noir
    	Prc_Noir.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
            	//Pattern pattern = Pattern.compile("^([1-9]\\d{0,3}(\\.\\d{1,2})?|9999\\.99)$");
                try {
                    if (Float.parseFloat(newValue) < 1.00 || Float.parseFloat(newValue) >= 10000.00) { 
                    	Alert alert = new Alert(Alert.AlertType.INFORMATION);
                		alert.setTitle("error");
                		alert.setHeaderText("input error");
                		alert.setContentText("Please enter an float from 1 to 9,999.99");
                		alert.showAndWait();
                		Prc_Noir.setText("");
                    	
                    } else if (!newValue.matches("^-?\\d+(\\.\\d{0,2})?$")) {
                    	Alert alert = new Alert(Alert.AlertType.INFORMATION);
                		alert.setTitle("error");
                		alert.setHeaderText("input error");
                		alert.setContentText("Please enter an float from 1 to 9,999.99");
                		alert.showAndWait();
                		Prc_Noir.setText("");
                	}
                } catch (NumberFormatException e) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("error");
                    alert.setHeaderText("input error");
                    alert.setContentText("Please enter the number from 1 to 9,999.99");
                    alert.showAndWait();
                    Prc_Noir.setText("");
                }
            }
        });
    	//Input Validation for Bko_Rose
    	Bko_Rose.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {
                    if (!newValue.matches("^(?!$)\\d{1,8}$")) {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("error");
                        alert.setHeaderText("input error");
                        alert.setContentText("Please enter an integer from 0 to 99,999,999");
                        alert.showAndWait();
                        Bko_Rose.setText("");
                    } else {

                    }
                } catch (NumberFormatException e) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("error");
                    alert.setHeaderText("input error");
                    alert.setContentText("Please enter the number from 0 to 99,999,999");
                    alert.showAndWait();
                    Bko_Rose.setText("");
                }
            }
        });
    	//Input Validation for Bko_Noir
    	Bko_Noir.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {
                    if (!newValue.matches("^(?!$)\\d{1,8}$")) {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("error");
                        alert.setHeaderText("input error");
                        alert.setContentText("Please enter an integer from 0 to 99,999,999");
                        alert.showAndWait();
                        Bko_Noir.setText("");
                    } else {

                    }
                } catch (NumberFormatException e) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("error");
                    alert.setHeaderText("input error");
                    alert.setContentText("Please enter the number from 0 to 99,999,999");
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

    public void toclick(ActionEvent actionEvent) {
        ObservableList<String> items = FXCollections.observableArrayList("w1: Insufficient production capacity to produce the optimal mix, please reduce or adjust the capacity of labor & grape volume!", "W2: Insufficient labor supplied to utilize the grape resource (less than 90%).");
        or_scroll_text1.setValueFactory(new SpinnerValueFactory.ListSpinnerValueFactory<String>(items));
    }
}
