
import com.sun.corba.se.pept.transport.ContactInfoList;
import javafx.application.Application;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.*;
public class First extends Application {

    Button button;
    Stage window;
    Scene ekraan2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Window
        window = primaryStage;
        primaryStage.setTitle("Fun");

        //Button 1

        Label kirjeldus = new Label("Esimene stseen");
        button = new Button();
        button.setText("Vajuta siia, et liikuda edasi");
        button.setOnAction(e -> window.setScene(ekraan2) );


        // Ülemine menüü
        HBox TopMenu = new HBox();
        Button buttonA = new Button ("Esimene");
        TopMenu.getChildren().addAll(buttonA);

        // Vasakpoolne menüü

        HBox BottomMenu = new HBox();
        Button bottomButtonA = new Button ("Nupp 1");
        Button bottomButtonB = new Button ("Nupp 2");
        BottomMenu.getChildren().addAll(bottomButtonA,bottomButtonB);

        // Teeme üldise layoudi
        BorderPane borderPane = new BorderPane();
//        borderPane.setTop(TopMenu);
        borderPane.setBottom(BottomMenu);



//        StackPane layout = new StackPane();
//        layout.getChildren().add(button);


        // Lisan kõik ekraanile
        Scene scene = new Scene(borderPane, 500, 500);
        window.setScene(scene);
        window.show();


//        primaryStage.setScene(scene);
//        primaryStage.show();


    }


}

