package tekstitöötlusprogramm;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;


public class BottomBox {

    static TextField bottomUserInput = new TextField();
    // Mitu characteri saab kasti kirjutada
    private static final int textLimit = 20;
    public static Button actionButton = new Button("Vajuta siia");
    static CheckBox checkboxEfekt = new CheckBox("Blur");

    static CheckBox checkBoxCharcterOpposite = new CheckBox("Tagurpidi");
    static ColorPicker colorPicker = new ColorPicker(Color.BLACK);

    public static HBox bottomMenu() {

        // Teen Hbox stiilis
        HBox hList = new HBox(10);
        hList.setSpacing(8);

        // Asjad, mida ma lisan Hboxi

        // TextField
        bottomUserInput.setPromptText("Kirjuta siia oma tekst");
        bottomUserInput.lengthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable,
                                Number oldValue, Number newValue) {
                if (bottomUserInput.getText().length() >= textLimit){

                    bottomUserInput.setText(bottomUserInput.getText().substring(0, textLimit));
                }
            }
        });


        //ActionBox tegevused


        // Lisan kõik listi
        hList.getChildren().addAll(bottomUserInput, checkboxEfekt, colorPicker,checkBoxCharcterOpposite, actionButton);

        return hList;
    }


}

