package tekstitöötlusprogramm;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

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

        // Määran piirkondadesse alad
        Raamistik.setBottom(BottomBox.bottomMenu());
        Raamistik.setCenter(CenterText.menu());

        // Määrad äärise
        Raamistik.setPadding(new Insets(10, 10, 10, 10));

        // Programmivälja suurus
        Scene scene = new Scene(Raamistik, 300, 300);

        window.setScene(scene);
        window.show();

    }





}



