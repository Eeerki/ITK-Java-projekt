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

        //Muudab teksti värvi

            newLabel.setTextFill(BottomBox.colorPicker.getValue());

        // Blur efekt
        if (checkBoxBlurEfekt()){

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


        if(BottomBox.checkBoxCharcterOpposite.isSelected()){
            newLabel.setText(oppositeCharacter());
        }
        else{
            newLabel.setText(BottomBox.bottomUserInput.getText());
        }
    }



    // checkBox1 kontroll, boolean tüüpi

    static private boolean checkBoxBlurEfekt() {
        if (BottomBox.checkboxEfekt.isSelected()) {
            return true;
        } else {
            return false;
        }


    }
    // End of checkBox1

    // Prindib välja tagurpidi Stringi

    static private String oppositeCharacter(){

            String returnString= "";
            String algneSisend = newLabel.getText();

            System.out.println(algneSisend);
            for (int i = algneSisend.length()-1; i>=0;i--){
                char tempChar = algneSisend.charAt(i);

                returnString = returnString + tempChar;

            }

            return returnString;

        }

}
