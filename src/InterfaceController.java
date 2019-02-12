import javafx.fxml.FXML;

import javafx.scene.control.Label;


import javafx.event.ActionEvent;
import javafx.scene.control.TextField;



public class InterfaceController {
    @FXML Label rOutput;
    @FXML Label sOutput;
    @FXML Label tOutput;
    @FXML TextField fieldA;
    @FXML TextField fieldB;

    public void GoMath(ActionEvent event){
        try {
            int a = Integer.parseInt(fieldA.getText());
            int b = Integer.parseInt(fieldB.getText());
            Algorithm.calculate(a, b);
            rOutput.setText(""+ Algorithm.getR());
            sOutput.setText(""+ Algorithm.getS());
            tOutput.setText(""+ Algorithm.getT());
        } catch(NumberFormatException e){
            rOutput.setText("Error");
        }

    }

}
