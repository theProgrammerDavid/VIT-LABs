import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.sql.*;

class db {
    private String url, username, password;
    private Connection conn;

    public db(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public void connect() throws SQLException {

        try {
            this.conn = DriverManager.getConnection(url, username, password);

            System.out.println("Successfully connected to db");

        } catch (SQLException e) {
            System.out.println("SQL Error while connecting to the db");
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return this.conn;
    }

    public ResultSet exec(String s) throws SQLException {
        Statement st = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = st.executeQuery(s);

        st.close();
        return rs;
    }

    public void exec(Statement s) {

    }

    public void close() throws SQLException {
        this.conn.close();

    }
}

class Student {
    private String name;
    private String password;
    private String gender;
    private String country;
    private String subject;

    public Student(String name, String pass, String gender, String country, String subject) {
        this.name = name;
        this.password = pass;
        this.gender = gender;
        this.country = country;
        this.subject = subject;
    }

    public boolean insert(Connection con) throws SQLException {
        PreparedStatement ps = con.prepareStatement("INSERT INTO STUDENTS VALUES(?,?,?,?,?);");
        ps.setString(1, name);
        ps.setString(2, password);
        ps.setString(3, gender);
        ps.setString(4, country);
        ps.setString(5, subject);

        int i = ps.executeUpdate();
        System.out.println(i);

        return i > 0;
    }
}

public class app1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public Scene renderUi() {

        Label textFieldLabel = new Label("Enter Name");
        TextField name = new TextField();

        Label passLabel = new Label("Enter password");
        PasswordField pass = new PasswordField();

        Label genderLabel = new Label("Select Gender");
        ToggleGroup gender = new ToggleGroup();

        RadioButton male = new RadioButton("Male");
        male.setToggleGroup(gender);

        RadioButton female = new RadioButton("Female");
        female.setToggleGroup(gender);

        Label subLabel = new Label("Select Subject");
        CheckBox c1 = new CheckBox("Math");
        CheckBox c2 = new CheckBox("Physics");
        CheckBox c3 = new CheckBox("Chem");

        ComboBox<String> country = new ComboBox<String>();
        Label countryLabel = new Label("Select Country");
        country.getItems().addAll("India", "America", "Japan");

        Label errorLabel = new Label();
        errorLabel.setTextFill(Color.RED);

        errorLabel.setFont(new Font("Arial", 20));

        Button b = new Button("Submit");
        b.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                boolean ok = true;
                errorLabel.setText("");

                if (name.getText().isEmpty()) {
                    errorLabel.setText("Please Enter Name");
                    ok = false;
                    return;
                }
                if (pass.getText().isEmpty()) {
                    errorLabel.setText("Please Enter Password");
                    ok = false;
                    return;
                }

                if (male.isSelected() == false && female.isSelected() == false) {
                    errorLabel.setText("Please Select gender");
                    ok = false;
                    return;
                }
                // same for subjects

                if (country.getValue() == null) {
                    errorLabel.setText("Please Select Country");
                    ok = false;
                    return;
                }

                if (ok) {
                    try {
                        Student s = new Student(name.getText(), pass.getText(), male.isSelected() ? "male" : "female",
                                country.getValue(), "subject here");
                        db db = new db("jdbc:mysql://localhost:6603/java", "root", "pass");
                        db.connect();
                        Connection c = db.getConnection();
                        
                        if(s.insert(c)){
                            errorLabel.setTextFill(Color.GREEN);
                            errorLabel.setText("Inserted Successfully");
                        }

                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        GridPane grid = new GridPane();

        grid.add(textFieldLabel, 0, 0);
        grid.add(name, 1, 0);
        grid.add(passLabel, 0, 1);
        grid.add(pass, 1, 1);
        grid.add(genderLabel, 0, 2);
        grid.add(male, 1, 2);
        grid.add(female, 2, 2);

        // grid.add(subLabel, 0,3);
        grid.addRow(3, subLabel, c1, c2, c3);
        grid.addRow(4, countryLabel, country);
        grid.addRow(5, b);
        grid.addRow(6, errorLabel);

        grid.setHgap(10);
        grid.setVgap(10);

        Scene sc = new Scene(grid);

        return sc;
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setScene(renderUi());
        primaryStage.setTitle("David's application");
        primaryStage.setWidth(800);
        primaryStage.setHeight(600);
        primaryStage.show();
    }
}
