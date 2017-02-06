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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author shane
 */
public class FXMLDocumentController implements Initializable {

    Double data = 0.0;
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
    void handleButtonAction(ActionEvent event) {
        if (event.getSource() == one) {
            display.setText(display.getText() + "1");

        } else if (event.getSource() == two) {
            display.setText(display.getText() + "2");

        } else if (event.getSource() == three) {
            display.setText(display.getText() + "3");

        } else if (event.getSource() == four) {
            display.setText(display.getText() + "4");

        } else if (event.getSource() == five) {
            display.setText(display.getText() + "5");

        } else if (event.getSource() == six) {
            display.setText(display.getText() + "6");

        } else if (event.getSource() == seven) {
            display.setText(display.getText() + "7");

        } else if (event.getSource() == eight) {
            display.setText(display.getText() + "8");

        } else if (event.getSource() == nine) {
            display.setText(display.getText() + "9");

        } else if (event.getSource() == zero) {
            display.setText(display.getText() + "0");

        } else if (event.getSource() == decimal) {
            display.setText(display.getText() + ".");

        } else if (event.getSource() == plus) {
            data = Double.parseDouble(display.getText());
            operation = 1; // addition
            display.setText("");
        } else if (event.getSource() == minus) {
            data = Double.parseDouble(display.getText());
            operation = 2; // minus
            display.setText("");

        } else if (event.getSource() == multi) {
            data = Double.parseDouble(display.getText());
            operation = 3; // multi
            display.setText("");

        } else if (event.getSource() == divide) {
            data = Double.parseDouble(display.getText());
            operation = 4; // divide
            display.setText("");

        } else if (event.getSource() == Modulo) {
            data = Double.parseDouble(display.getText());
            operation = 5; // modulus
            display.setText("");

        } else if (event.getSource() == SQROOT) {
            data = Double.parseDouble(display.getText());
            operation = 6;// Square root
            double answer = Math.sqrt(data);
            display.setText(String.valueOf(answer));

        } else if (event.getSource() == X2) {
            data = Double.parseDouble(display.getText());
            operation = 5; // squared or the powerof
            int i = 2;
            double answer = Math.pow(data, i);
            display.setText(String.valueOf(answer));

        } else if (event.getSource() == fraction) {
            data = Double.parseDouble(display.getText());
            double answer = 1 / data;
            display.setText(String.valueOf(answer));

        } else if (event.getSource() == delete) {
            data = Double.parseDouble(display.getText());           
            display.setText(String.valueOf(data).substring(0, display.getLength() - 1));
        } else if (event.getSource() == equalButton) {

            double secondOperand = Double.parseDouble(display.getText());

            switch (operation) {
                case 1: // addition
                    double answer = data + secondOperand;
                    display.setText(String.valueOf(answer));
                    break;

                case 2: // minus
                    answer = data - secondOperand;
                    display.setText(String.valueOf(answer));
                    break;

                case 3:  //multi 
                    answer = data * secondOperand;
                    display.setText(String.valueOf(answer));
                    break;

                case 4: //divide
                    answer = 0f;

                    try {
                        answer = data / secondOperand;

                    } catch (Exception e) {
                        display.setText("Error");

                    }
                    display.setText(String.valueOf(answer));
                    break;

                case 5: // modulus
                    answer = data % secondOperand;
                    display.setText(String.valueOf(answer));
                    break;
//              
            }

        } else if (event.getSource() == ClearResults) {
            display.setText("");
            data = 0.0;

        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
