import java.sql.*;

public class dbmsConnection {
    private String url, username, password;
    private Connection conn;

    public dbmsConnection(String url, String username, String password) {
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

    public static void main(String[] args) {
        dbmsConnection con = new dbmsConnection("jdbc:mysql://localhost:6603/java", "root", "pass");
        try {
            con.connect();

            Connection c = con.getConnection();
            PreparedStatement ps = c.prepareStatement("CREATE TABLE IF NOT EXISTS STUDENTS(name varchar(100), password varchar(100), gender varchar(10), country varchar(100), subject varchar(100));");
            int s = ps.executeUpdate();
            System.out.println(s);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
