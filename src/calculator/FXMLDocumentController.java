/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author shane
 */
public class FXMLDocumentController implements Initializable {

    Double data = 0.0;
    double secondOperand = 0;
    int operation = -1;

    @FXML
    private Label label;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button zero;
    @FXML
    private Button plus;
    @FXML
    private Button minus;
    @FXML
    private Button multi;
    @FXML
    private Button divide;
    @FXML
    private Button equalButton;
    @FXML
    private Button ClearResults;
    @FXML
    private Button decimal;
    @FXML
    private Button PlusMinus;
    @FXML
    private Button Modulo;
    @FXML
    private Button SQROOT;
    @FXML
    private Button X2;
    @FXML
    private Button fraction;
    @FXML
    private Button CE;
    @FXML
    private Button delete;
    @FXML
    private TextField display;
    @FXML
    private TextField displayTop;

    @FXML
    void handleButtonAction(ActionEvent event) {

        Node n = (Node) event.getSource();
        String id = n.getId();
        switch (id) {
            case "one":
                display.setText(display.getText() + "1");
                break;
            case "two":
                display.setText(display.getText() + "2");
                break;
            case "three":
                display.setText(display.getText() + "3");
                break;
            case "four":
                display.setText(display.getText() + "4");
                break;
            case "five":
                display.setText(display.getText() + "5");
                break;
            case "six":
                display.setText(display.getText() + "6");
                break;
            case "seven":
                display.setText(display.getText() + "7");
                break;
            case "eight":
                display.setText(display.getText() + "8");
                break;
            case "nine":
                display.setText(display.getText() + "9");
                break;
            case "zero":
                display.setText(display.getText() + "0");
                break;

        }
            //Functions, divide, addition, substraction, multi, PlusMinus    
            
        
        if (event.getSource() == decimal) {
            display.setText(display.getText() + ".");

        } else if (event.getSource() == plus) {
            data = Double.parseDouble(display.getText()); // parse a double from the display label and add it to the var Data
            displayTop.setText(data + " +");
            operation = 1; // sent it to a switch statement , which does addition
            display.setText("");
        } else if (event.getSource() == minus) {
            data = Double.parseDouble(display.getText());
            displayTop.setText(data + " -");
            operation = 2; // minus
            display.setText("");

        } else if (event.getSource() == multi) {
            data = Double.parseDouble(display.getText());
            displayTop.setText(data + " x");
            operation = 3; // multi
            display.setText("");

        } else if (event.getSource() == divide) {
            data = Double.parseDouble(display.getText());
            displayTop.setText(data + " ÷");
            operation = 4; // divide
            display.setText("");

        } else if (event.getSource() == PlusMinus) {
            data = Double.parseDouble(display.getText());
            double answer = data * -1; // calls the  math square root and pass in data var as parameter
            display.setText(String.valueOf(answer)); //  set the display value to equal answer
        } /*
        functions : square root, modulus, powerof, fraction,
         */ else if (event.getSource() == Modulo) {
            data = Double.parseDouble(display.getText());
            operation = 5; // modulus
            display.setText("");

        } else if (event.getSource() == SQROOT) {
            data = Double.parseDouble(display.getText());
            double answer = Math.sqrt(data); // calls the  math square root and pass in data var as parameter
            display.setText(String.valueOf(answer)); //  set the display value to equal answer

        } else if (event.getSource() == X2) {
            data = Double.parseDouble(display.getText());
            int i = 2;
            double answer = Math.pow(data, i);  // calls the  math  powerof and pass in data var as parameter and i 
            display.setText(String.valueOf(answer));

        } else if (event.getSource() == fraction) {
            data = Double.parseDouble(display.getText());
            double answer = 1 / data;
            display.setText(String.valueOf(answer));
            /*
            functions : delete, Clear entry, , Clear
             */
        } else if (event.getSource() == delete) {
            data = Double.parseDouble(display.getText());
            display.setText(String.valueOf(data).substring(0, display.getLength() - 1));
        } else if (event.getSource() == ClearResults) {
            display.setText(""); // clears the displaytext 
            data = 0.0;
            secondOperand = 0.0;
        } else if (event.getSource() == CE) {
            display.setText(""); // clears the displaytext 
            data = 0.0;

        } else if (event.getSource()
                == equalButton) {

            secondOperand = Double.parseDouble(display.getText()); // get the display value and add it to the var secondoperand

            switch (operation) {
                case 1: // addition
                    double answer = data + secondOperand;  // adds the 2 vars together
                    display.setText(String.valueOf(answer)); // sets the display text to the value of answer
                    displayTop.setText("");
                    break;

                case 2: // minus
                    answer = data - secondOperand;
                    display.setText(String.valueOf(answer));
                    displayTop.setText("");

                    break;

                case 3:  //multi 
                    answer = data * secondOperand;
                    display.setText(String.valueOf(answer));
                    displayTop.setText("");

                    break;

                case 4: //divide
                    answer = 0;

                    try { // try catch to protect against divide by zero
                        answer = data / secondOperand;

                    } catch (Exception e) {
                        display.setText("Error");

                    }
                    display.setText(String.valueOf(answer));
                    break;

                case 5: // modulus
                    answer = data % secondOperand; // does modulus on the 2 vars and set the value to equal that
                    display.setText(String.valueOf(answer));
                    displayTop.setText("");

                    break;
//              
            }

        }
    }

    static String testmethod(String tesst) {

        //  display.setText(display.getText() + "3")
        return tesst;

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
