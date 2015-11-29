package tekstitöötlusprogramm;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 * Created by Erki on 25.11.2015.
 */
public class BottomBox {

    static TextField bottomUserInput = new TextField();
    public static Button actionButton = new Button("Click");
    static CheckBox checkbox1 = new CheckBox("Example");


    public static HBox bottomMenu() {

        // Teen Hbox stiilis
        HBox hList = new HBox(10);
        hList.setSpacing(8);

        // Asjad, mida ma lisan Hboxi
        // CheckBox


        // TextField
        bottomUserInput.setPromptText("Kirjuta siia oma tekst");
        String labelStringText = bottomUserInput.getText();

        //ActionBox tegevused


        // Lisan kõik listi
        hList.getChildren().addAll(bottomUserInput, checkbox1, actionButton);

        return hList;
    }
}

