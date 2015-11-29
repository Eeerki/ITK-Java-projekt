package tekstitöötlusprogramm;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

/**
 * Created by Erki on 25.11.2015.
 */
public class CenterText {

    public static VBox menu(){


        VBox Keskne = new VBox();

        Label newLabel = new Label();

        BottomBox.actionButton.setOnAction(
                e-> newLabel.setText(BottomBox.bottomUserInput.getText())
        );

        Keskne.getChildren().addAll(newLabel);

        return Keskne;

    }


    public static Label action(TextField userInput) {

        String v2lja = userInput.getText();
        Label centerText = new Label(v2lja);

        System.out.println(v2lja);



        return centerText;


    }

   static public void printLabel(String input){



    }



}
