package techConnect;

import java.sql.*;
import java.util.*;


public class ConnectionManager {

    static Connection con;
    static String url;

    public static Connection getConnection()
    {

        // Connect to database
        String hostName = "tconect.database.windows.net";
        String dbName = "tcdbtest";
        String user = "cbuStudents";
        String password = "Angel1996";
        String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;"
                + "hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url);
            String schema = connection.getSchema();
            System.out.println("Successful connection - Schema: " + schema);

            // Create and execute a SELECT SQL statement.

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }
}
