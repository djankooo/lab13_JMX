package jmx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.util.ArrayList;

public class App extends Application{

    private ArrayList<Circle> circles = new ArrayList<>();
    private GridPane gridPane = createPane();
    private Button b;

    private GridPane createPane() {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(20, 20, 20, 20));
        pane.setHgap(10);
        pane.setVgap(10);
        return pane;
    }

    private void setUIControls(GridPane pane) {
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 2; j++){
                Circle c = new Circle(10, Color.GREY);
                gridPane.add(c,i,j);
                circles.add(c);
            }
        }
        b = new Button("asd");
        gridPane.add(b,5,5);

        b.setOnAction(e->{togleLightsIN();System.out.println(this);});
    }

    public void togleLightsIN() {
        System.out.println("inside app: " + this);
        for(int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                Circle c = new Circle(10, Color.YELLOW);
                gridPane.add(c, i, j);
                circles.add(c);
            }
        }
    }

    @Override
    public void start(final Stage primaryStage) throws Exception {

        setUIControls(gridPane);
        primaryStage.setScene(new Scene(gridPane, 1000, 500));
        primaryStage.show();
        System.out.println(this);
        primaryStage.setTitle(String.valueOf(this));
    }

    public static void main(String[] args) {
        launch(args);
    }

}
