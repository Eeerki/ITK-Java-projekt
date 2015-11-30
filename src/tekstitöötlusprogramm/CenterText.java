package tekstitöötlusprogramm;

import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


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
        if (checkBox1()){

            newLabel.setFont(new Font("Arial", 30));
        }
        else {
            newLabel.setFont(new Font("Arial", 50));
        }
       System.out.println("Esimene event");
    }


    // Juhtum 2, mis juhtub
    static public boolean checkBox1(){
        if (BottomBox.checkbox1.isSelected()){
            return true;
        }
        else{
            System.out.println("Jõudsin siia");
            return false;
        }



    }



}
