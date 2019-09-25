package org.ryansallee;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class PrimaryController {
    @FXML
    private Text result;

    @FXML
    void initialize(){
        result.setText("You can do basic math here!");
    }
}
