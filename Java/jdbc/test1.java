import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test1 {
   static final String DB_URL = "jdbc:mysql://localhost:6603/biodb";
   static final String USER = "root";
   static final String PASS = "pass";

   public static void main(String[] args) {
      // Open a connection
      try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);) {
         ResultSet rs = stmt.executeQuery("SELECT * FROM users");
         if (rs.next() == false) {
            System.out.println("The table is empty");
         } else {
            rs.previous();
            while (rs.next()) {
               System.out.println(rs.getString(1) + rs.getString(2) + rs.getString(3) + rs.getString(4));
            }
         }
         System.out.println("Database created successfully...");

         PreparedStatement ps = conn.prepareStatement("INSERT INTO users values (?,?,?)");
         ps.setString(1, "David");
         ps.setString(2, "Velho");
         ps.setInt(3, 3);
         conn.close();
         stmt.close();
         rs.close();
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}