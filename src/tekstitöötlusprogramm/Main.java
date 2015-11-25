package tekstitöötlusprogramm;

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

public class Main extends Application {

    Button actionButton;
    Stage window;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //Põhiakna kirjeldus
        window = primaryStage;
        primaryStage.setTitle("Numbritöötleja");
        primaryStage.setResizable(false);

        // Põhiline Layout BorderPane
        BorderPane Raamistik = new BorderPane();
        Raamistik.setBottom(BottomBox.BottomMenu());
        Raamistik.setPadding(new Insets(10,10,10,10));

        // Stseeni suurus
        Scene scene = new Scene(Raamistik, 300, 300);
        window.setScene(scene);
        window.show();

    }



    // Meetodid siit alla



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



