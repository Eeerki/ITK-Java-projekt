
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
    public class Second extends Application {

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



            // Grid layout making
            GridPane grid = new GridPane();
            grid.setPadding(new Insets(10, 10, 10, 10));
            // Individual cells
            grid.setVgap(8);
            grid.setHgap(10);


            // Tellimisnupp
            button = new Button("Siia saab klikkida");
            GridPane.setConstraints(button, 4,5);



              // TextField
            TextField Tellimistekst = new TextField();
            GridPane.setConstraints(Tellimistekst,2,1);
            Tellimistekst.setPromptText("Kirjuta siia kasti sisse");


            // CheckBoxes
            CheckBox box1 = new CheckBox("Ello?");
            CheckBox box2 = new CheckBox("YEllo?");
            CheckBox box3 = new CheckBox("YEllow");
            CheckBox box4 = new CheckBox("HELO");
            box4.setSelected(true);

            GridPane.setConstraints(box1, 1,2);
            GridPane.setConstraints(box2, 1,3);
            GridPane.setConstraints(box3, 1,4);
            GridPane.setConstraints(box4, 1,5);

            button.setOnAction(e->handleOptions(box1, box2));

            grid.getChildren().addAll(button,box1,box2,box3,box4,Tellimistekst);

//            //TextField
//            TextField UserInput = new TextField();
//            GridPane.setConstraints(UserInput,0,1);
//
//            button = new Button("Click me");
//            button.setOnAction(e-> isInt(UserInput, UserInput.getText()));
//            GridPane.setConstraints(button, 1,1);
//
//            grid.getChildren().addAll(button,UserInput);




//            // Name label
//
//            Label nameLabel1 = new Label("Username");
//            GridPane.setConstraints(nameLabel1, 0, 0);
//
//            // UserName input
//
//            TextField nameInput = new TextField();
//            GridPane.setConstraints(nameInput, 1, 0);
//
//            // Password label
//
//            Label passLabel1 = new Label("Password");
//            GridPane.setConstraints(passLabel1, 0, 1);
//
//            // Password input
//
//            TextField passwordInput = new TextField();
//            passwordInput.setPromptText("Kirjuta siia!");
//            GridPane.setConstraints(passwordInput, 1, 1);
//
//            Button loginButton = new Button("Log in");
//            GridPane.setConstraints(loginButton,1,2);
//
//            grid.getChildren().addAll(nameLabel1,nameInput,passLabel1,passwordInput,loginButton);
//



            //Button 1
//
//            Label kirjeldus = new Label("Esimene stseen");
//            button = new Button();
//            button.setText("Vajuta siia, et liikuda edasi");
//            button.setOnAction(e -> window.setScene(ekraan2) );
//
//
//            // Ülemine menüü
//            HBox TopMenu = new HBox();
//            Button buttonA = new Button ("Esimene");
//            TopMenu.getChildren().addAll(buttonA);
//
//            // Vasakpoolne menüü
//
//            HBox BottomMenu = new HBox();
//            Button bottomButtonA = new Button ("Nupp 1");
//            Button bottomButtonB = new Button ("Nupp 2");
//            BottomMenu.getChildren().addAll(bottomButtonA,bottomButtonB);
//
//            // Teeme üldise layoudi
//            BorderPane borderPane = new BorderPane();
////        borderPane.setTop(TopMenu);
//            borderPane.setBottom(BottomMenu);



//        StackPane layout = new StackPane();
//        layout.getChildren().add(button);


            // Lisan kõik ekraanile
            Scene scene = new Scene(grid, 500, 500);
            window.setScene(scene);
            window.show();


        }

//        private boolean isInt (TextField input, String message){
//            try{
//                int age = Integer.parseInt(input.getText());
//                        System.out.println("User is " + age);
//                return true;
//            }
//            catch(NumberFormatException e){
//                System.out.println("Error ˇ" + message + "ˇ is not a valid number");
//                return false;
//            }
//        }

        // Meetod, mis tegeleb
        private void handleOptions(CheckBox box1, CheckBox box2 ){

            String message = "";
            if (box1.isSelected()){
                message += "box 1 on tSekitud";

            if (box2.isSelected()){
                message += "Box 2 on tSekitud";

            }

                System.out.println(message);
            }
        }
//


    }



