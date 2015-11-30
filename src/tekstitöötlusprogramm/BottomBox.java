package tekstitöötlusprogramm;

import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;


public class BottomBox {

    static TextField bottomUserInput = new TextField();
    public static Button actionButton = new Button("Vajuta siia");
    static CheckBox checkboxEfekt = new CheckBox("Blur");
    static CheckBox checkboxV2rvidLubatud = new CheckBox("Värvimuutus lubatud");
    static ColorPicker colorPicker = new ColorPicker(Color.BLACK);

    public static HBox bottomMenu() {

        // Teen Hbox stiilis
        HBox hList = new HBox(10);
        hList.setSpacing(8);

        // Asjad, mida ma lisan Hboxi

        // Combobox




        // TextField
        bottomUserInput.setPromptText("Kirjuta siia oma tekst");
        String labelStringText = bottomUserInput.getText();

        //ActionBox tegevused


        // Lisan kõik listi
        hList.getChildren().addAll(bottomUserInput, checkboxEfekt,checkboxV2rvidLubatud, colorPicker, actionButton);

        return hList;
    }
}

