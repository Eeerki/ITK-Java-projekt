package tekstitöötlusprogramm;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.BoxBlur;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;


public class CenterText {

    static Label newLabel = new Label();

    public static VBox menu() {


         VBox Keskne = new VBox();

        BottomBox.actionButton.setOnAction(
                e -> event1());

        Keskne.getChildren().addAll(newLabel);

        return Keskne;

    }


    public static Label action(TextField userInput) {

        String v2lja = userInput.getText();
        Label centerText = new Label(v2lja);

        System.out.println(v2lja);


        return centerText;


    }


    // Nupuvajutus efektid

    static public void event1() {

        newLabel.setText(BottomBox.bottomUserInput.getText());
        newLabel.setFont(new Font("Arial", 30));
        newLabel.setTextAlignment(TextAlignment.CENTER);

        // Teeb teksti siniseks
        if(checkBoxSinine()){

            newLabel.setTextFill(BottomBox.colorPicker.getValue());
        }
        else {
            newLabel.setTextFill(Color.BLACK);
        }



        // Efekt
        if (checkBoxEfekt()){

            // Kirjeldan bluri
            BoxBlur blur = new BoxBlur();
            blur.setWidth(6);
            blur.setHeight(6);
            blur.setIterations(3);

            // Määran bluri
            newLabel.setEffect(blur);
            }


        else{
            newLabel.setEffect(null);
        }
    }







    // checkBox1 kontroll, boolean tüüpi

    static private boolean checkBoxEfekt() {
        if (BottomBox.checkboxEfekt.isSelected()) {
            return true;
        } else {
            return false;
        }


    }
    // End of checkBox1

    // checkBox2 kontroll, boolean tüüpi
    static private boolean checkBoxSinine(){
        if (BottomBox.checkboxV2rvidLubatud.isSelected()){
            return true;
        }
        else{
            return false;
        }
    }


}
