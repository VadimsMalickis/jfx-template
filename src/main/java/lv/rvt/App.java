package lv.rvt;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX template app");
        primaryStage.setResizable(true);

        VBox vBox = new VBox(new Label("My First Label"));
        Scene scene = new Scene(vBox, 640, 480, Color.WHITE);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

