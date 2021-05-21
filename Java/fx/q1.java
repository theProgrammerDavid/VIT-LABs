import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class q1 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button("Click me");
        HBox root = new HBox();
        root.getChildren().add(btn);
        Scene sc = new Scene(root);

        primaryStage.setScene(sc);
        primaryStage.setTitle("Ruchica Sinha");
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.show();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}