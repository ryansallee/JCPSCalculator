package org.ryansallee;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.math.BigDecimal;

public class PrimaryController {
    @FXML
    private Text display;
    @FXML
    private Text result;

    private CalculatorModel calculatorModel= new CalculatorModel();
    private StringBuilder runningNumber = new StringBuilder();
    private StringBuilder operator = new StringBuilder();
    private boolean start = true;

    @FXML
    private void processNumber(ActionEvent event){
        if(start){
            clearCalculator(event);
            start = false;
        }
        String val = ((Button)event.getSource()).getText();
        display.setText(display.getText() + val);
        runningNumber.append(val);
    }

    @FXML
    private void processOperator(ActionEvent event){
        if(start)
            return;
        String val = ((Button)event.getSource()).getText();
        if(operator.length() == 0) {
            calculatorModel.setNumber1(new BigDecimal(runningNumber.toString()));
            operator.append(val);
            display.setText(display.getText() + " " + val + " ");
        } else {
            calculatorModel.setNumber2(new BigDecimal(runningNumber.toString()));
            try {
                calculatorModel.setNumber1(MathLogic.calculate(calculatorModel.getNumber1(), calculatorModel.getNumber2(), operator.toString()));
            }
            catch (ArithmeticException e) {
                result.setText("Divide by 0 error");
                start = true;
                return;
            }
            result.setText(calculatorModel.getNumber1().toString());
            start = true;
        }
        runningNumber.setLength(0);
    }

     @FXML
    private void clearCalculator(ActionEvent event){
        display.setText(null);
        result.setText("0");
        start = true;
        operator.setLength(0);
        calculatorModel.setNumber1(new BigDecimal("0"));
        calculatorModel.setNumber2(new BigDecimal("0"));
    }
}
