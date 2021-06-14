import java.io.FileInputStream;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

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