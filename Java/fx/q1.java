import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;


public class q1 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        MenuBar mm = new MenuBar();
        Menu file = new Menu("File");
        VBox v = new VBox();
        file.getItems().add(new MenuItem("C++ file"));
        file.getItems().add(new MenuItem("New File"));
        mm.getMenus().add(file);

        Button b = new Button("Click");
        v.getChildren().add(mm);
        v.getChildren().add(b);

        Scene sc = new Scene(v);

        primaryStage.setTitle("David");
        primaryStage.setWidth(1280);
        primaryStage.setHeight(720);
        primaryStage.setScene(sc);
        primaryStage.show();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}