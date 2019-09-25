package org.ryansallee;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class PrimaryController {
    @FXML
    private Text display;

//    @FXML
//    void initialize(){
//        display.setText("You can do basic math here!");
//    }

    @FXML
    private void processNumber(ActionEvent event){
        String val = ((Button)event.getSource()).getText();
        display.setText(display.getText() + val);
    }

    @FXML
    private void processOperator(ActionEvent event){
        String val = ((Button)event.getSource()).getText();
        display.setText(display.getText() + val);

    }
}
