import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

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


        // Põhiline Layout BorderPane
        BorderPane Raamistik = new BorderPane();
        Raamistik.setBottom(BottomMenu());
        Raamistik.setPadding(new Insets(10,10,10,10));


        Scene scene = new Scene(Raamistik, 600, 600);
        window.setScene(scene);
        window.show();
        alligaatoriViisKalkulaator(1,6);

    }



    // Meetodid siit alla

    private void KeskneLabel(TextField userInput) {

        GridPane Keskne = new GridPane();
        Label centerText = new Label(userInput.toString());
        GridPane.setConstraints(centerText,0,0);
        Keskne.getChildren().addAll(centerText);

    }


    private HBox BottomMenu() {

        // Teen Hbox stiilis
        HBox hList = new HBox(10);
        hList.setSpacing(8);

        // Asjad, mida ma lisan Hboxi
        // CheckBox
        CheckBox checkbox1 = new CheckBox("Suur");

        // TextField
        TextField bottomUserIntInput = new TextField();
        bottomUserIntInput.setPromptText("Kirjuta siia täisarv");

        // LocalButton
        Button localButton = new Button("Kliki siia");
        localButton.setOnAction(e ->
        {
            isInt(bottomUserIntInput, bottomUserIntInput.getText());
            localButtonAction(bottomUserIntInput, checkbox1);
        });

        // Lisan kõik listi
        hList.getChildren().addAll(bottomUserIntInput, checkbox1, localButton);

        return hList;
    }

    private String localButtonAction(TextField userInput, CheckBox checkBox1) {

        if (checkBox1.isSelected()) {
            KeskneLabel(userInput);
            return userInput.getText();

        } else {
            System.out.println("None");
        }
        return null;
    }

    private static int alligaatoriViisKalkulaator(double number1, double number2){

        int sum=0;
            for(int i = 0; i<5;i++){
            sum += number1 +5;
            System.out.println(sum);

        }
        return sum;
    }













    private boolean isInt(TextField input, String message) {
        try {
            int age = Integer.parseInt(input.getText());
            return true;
        } catch (NumberFormatException e) {
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



