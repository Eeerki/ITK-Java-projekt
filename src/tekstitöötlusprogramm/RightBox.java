package tekstitöötlusprogramm;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

/**
 * Created by Erki on 29.11.2015.
 */
public class RightBox {
    static Button actionButton = new Button("Vajuta siia");


    public static GridPane RightMenu(){

        GridPane rightGrid = new GridPane();
        rightGrid.setPadding(new Insets(10, 10, 10, 10));

        GridPane.setConstraints(actionButton, 0,0);

        rightGrid.getChildren().addAll(actionButton);

        return rightGrid;

    }

    public void ButtonClicked(){

        if (true){

        }


    }
}
