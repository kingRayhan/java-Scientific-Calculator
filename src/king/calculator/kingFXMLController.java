/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package king.calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author kingRayhan
 */
public class kingFXMLController implements Initializable {

    @FXML
    private Label calculatorDisplay;
    
    double number;
    private String opratorSign;
    private Double result;
    ////////
    


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void digits(ActionEvent event) {
        if(calculatorDisplay.getText().equals("Plz enter digits")){
            calculatorDisplay.setText("");
        }
        
        
        String digits = ( (Button) event.getSource() ).getText();
        String oldDigit = calculatorDisplay.getText();
        String newDigit = oldDigit+digits;
        calculatorDisplay.setText(newDigit); 
    }

    @FXML
    private void AC(ActionEvent event) {
        calculatorDisplay.setText("Plz enter digits");
    }

    @FXML
    private void Delete_Action(ActionEvent event) {
       if(calculatorDisplay.getText().equals("Plz enter digits")){
            calculatorDisplay.setText("");
        }else{
            String oldDigits = calculatorDisplay.getText();
            String newDigits = oldDigits.substring(0,oldDigits.length()-1);
            calculatorDisplay.setText(newDigits);
        }
    }

    @FXML
    private void Equals(ActionEvent event) {
        double screenValue = Double.parseDouble(calculatorDisplay.getText());
        switch(opratorSign){
            case "+":
                result = screenValue + number;
            break;
            case "-":
                result = number - screenValue;
            break;
            case "*":
                result = screenValue * number;
            break;
            case "/":
                result = number / screenValue;
            break;
                
        }
        calculatorDisplay.setText(""+result);
    }

    @FXML
    private void Operators(ActionEvent event) {
        number = Double.parseDouble(calculatorDisplay.getText());
        opratorSign = ((Button) event.getSource()).getText();
        
        calculatorDisplay.setText("");
        
    }

    @FXML
    private void zero(ActionEvent event) {
        String oldDigit = calculatorDisplay.getText();
        calculatorDisplay.setText(oldDigit+"0");
    }

    @FXML
    private void root(ActionEvent event) {
        double val = Double.parseDouble(calculatorDisplay.getText());
        calculatorDisplay.setText(""+Math.pow(val, .5));
        
    }

    @FXML
    private void dotPoint(ActionEvent event) {
       String scVal = calculatorDisplay.getText();
       boolean hasDot = false;
       char charArray [] = scVal.toCharArray();
       for(int i = 0 ; i < scVal.length() ; i++){
            if(charArray[i] == '.'){
                hasDot = true;
            }
       }
       if(hasDot != true){
           calculatorDisplay.setText(scVal+'.');
       }
    }

    @FXML
    private void cos(ActionEvent event) {
        double Scereen = Double.parseDouble(calculatorDisplay.getText());
        double ans = Math.cos(Math.toRadians(Scereen));
        
        if(Scereen%90 == 0) {
            calculatorDisplay.setText("1");
        }else{
            calculatorDisplay.setText(""+ans);
        }
        
       
    }
    @FXML
    private void sin(ActionEvent event) {
        double Scereen = Double.parseDouble(calculatorDisplay.getText());
        double ans = Math.sin(Math.toRadians(Scereen));
        calculatorDisplay.setText(""+ans);
    }
    @FXML
    private void tan(ActionEvent event) {
        double Scereen = Double.parseDouble(calculatorDisplay.getText());
        double ans = Math.tan(Math.toRadians(Scereen));
        calculatorDisplay.setText(""+ans);
    }
    @FXML
    private void sec(ActionEvent event) {
        double Scereen = Double.parseDouble(calculatorDisplay.getText());
        double ans = 1/Math.cos(Math.toRadians(Scereen));
        calculatorDisplay.setText(""+ans);
    }
    @FXML
    private void cse(ActionEvent event) {
        double Scereen = Double.parseDouble(calculatorDisplay.getText());
        double ans = 1/Math.sin(Math.toRadians(Scereen));
        calculatorDisplay.setText(""+ans);
    }
    @FXML
    private void cot(ActionEvent event) {
        double Scereen = Double.parseDouble(calculatorDisplay.getText());
        double ans = Math.tan(Math.toRadians(Scereen));
        calculatorDisplay.setText(""+ans);
    }

    @FXML
    private void log(ActionEvent event) {
        double scVal = Double.parseDouble(calculatorDisplay.getText());
        calculatorDisplay.setText(""+Math.log(Math.toRadians(scVal)));
    }

    @FXML
    private void ln(ActionEvent event) {
        
    }

    @FXML
    private void x2(ActionEvent event) {
        double scVal = Double.parseDouble(calculatorDisplay.getText());
        calculatorDisplay.setText(""+Math.pow(scVal,2));
    }

    @FXML
    private void x3(ActionEvent event) {
        double scVal = Double.parseDouble(calculatorDisplay.getText());
        calculatorDisplay.setText(""+Math.pow(scVal,3));
    }

    @FXML
    private void rad(ActionEvent event) {
        double scVal = Double.parseDouble(calculatorDisplay.getText());
        calculatorDisplay.setText(""+Math.toRadians(15));
    }
}
