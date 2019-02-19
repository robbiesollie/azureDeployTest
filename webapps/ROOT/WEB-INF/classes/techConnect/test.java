package techConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test{
    public test() {
        System.out.println("HI");
    }

    public static void main(String[] args) {
        String connectionUrl =
                "jdbc:sqlserver://tconect.database.windows.net:1433;"
                        + "database=TechConnectDB;"
                        + "user=cbuStudents@tconect.database.windows.net;"
                        + "password=Angel1996;"
                        + "encrypt=true;"
                        + "trustServerCertificate=false;"
                        + "loginTimeout=30;";

        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
            // Code here.
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
        /*System.out.println("Hello World!");
        DBWrapper d = new DBWrapper();
        d.testQ("SELECT * FROM users;");*/
    }
}