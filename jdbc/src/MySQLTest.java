import java.sql.*;

public class MySQLTest {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/mysql";
        String user = "root";
        String password = "helloworld";
        
        try {
            // Use the new driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection successful!");
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver class not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL error!");
            e.printStackTrace();
        }
    }
}
