import java.sql.*;

class DB {
    private String url, uname, pass;

    public DB(String url, String username, String password) {
        this.url = url;
        this.uname = username;
        this.pass = password;
    }

    public Connection connect()
            throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Successfully connnected to db");
        return con;
    }
    
    public void close(Connection c) throws SQLException {
        c.close();
    }
}

public class test2 {

}