package tekstitöötlusprogramm;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/**
 * Created by Erki on 25.11.2015.
 */
public class CenterText {

    static Label newLabel = new Label();

    public static VBox menu(){


        VBox Keskne = new VBox();






            BottomBox.actionButton.setOnAction(
                    e-> event1());

        Keskne.getChildren().addAll(newLabel);

        return Keskne;

    }


    public static Label action(TextField userInput) {

        String v2lja = userInput.getText();
        Label centerText = new Label(v2lja);

        System.out.println(v2lja);



        return centerText;


    }

   static public void event1(){

        newLabel.setText(BottomBox.bottomUserInput.getText());


       System.out.println("Esimene event");
    }


    // Juhtum 2, mis juhtub
    static public void event2(){

        String text = BottomBox.bottomUserInput.getText();

        newLabel.setText(text);
        newLabel.setFont(Font.font ("Verdana", 20));

        System.out.println("Teine event");
    }



}
