import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.*; //Button
import javafx.scene.layout.*; // HBox
import javafx.scene.*; //Scene

public class demo1 extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Button b = new Button("Click Me");

        HBox hb = new HBox();

        hb.getChildren().add(b);
        Scene s = new Scene(hb);
        primaryStage.setScene(s);
        primaryStage.show();
        
    }
}