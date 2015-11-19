import com.sun.corba.se.pept.transport.ContactInfoList;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.*;

import java.nio.file.StandardWatchEventKinds;

public class Third extends Application {

    Button actionButton;
    Stage window;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Põhiakna kirjeldus
        window = primaryStage;
        primaryStage.setTitle("Fun");
        primaryStage.setResizable(false);


        // Põhjas asuv ActionBar


        // Põhiline Layout BorderPane
        BorderPane Raamistik = new BorderPane();
        Raamistik.setBottom(BottomMenu());



        Scene scene = new Scene(Raamistik, 600, 600);
        window.setScene(scene);
        window.show();


    }

    // Meetodid siit alla

    private GridPane CenterGrid(){

        return null;
    }



    private HBox BottomMenu (){
        // Teen Hbox stiilis
        HBox hList = new HBox(10);

        // Asjad, mida ma lisan Hboxi
        // CheckBox
        CheckBox checkbox1 = new CheckBox("Suur");

        // TextField
        TextField userInput = new TextField();
        userInput.setPromptText("Kirjuta siia oma tekst");

        // LocalButton
        Button localButton = new Button("Kliki siia");
        localButton.setOnAction(e-> localButtonAction(userInput, checkbox1));

        // Lisan kõik listi
        hList.getChildren().addAll(userInput,checkbox1,localButton);

        return hList;
    }
    private String localButtonAction(TextField userInput, CheckBox checkBox1){

        if(checkBox1.isSelected()){

            System.out.println("LocalButtonAction tagastas Stringi");
            return userInput.getText();
        }
        else{
            System.out.println("None");
        }
        return null;
    }






        private boolean isInt (TextField input, String message){
            try{
                int age = Integer.parseInt(input.getText());
                        System.out.println("User is " + age);
                return true;
            }
            catch(NumberFormatException e){
                System.out.println("Error ˇ" + message + "ˇ is not a valid number");
                return false;
            }
        }
    private void handleOptions(CheckBox box1, CheckBox box2) {

        String message = "";
        if (box1.isSelected()) {
            message += "box 1 on tSekitud";

            if (box2.isSelected()) {
                message += "Box 2 on tSekitud";

            }

            System.out.println(message);
        }
    }



}



