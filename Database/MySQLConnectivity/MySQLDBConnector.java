package MySQLConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDBConnector {
    public static Connection getMySQLConnection(String dbURL, String username, String password){
        if(dbURL == null)
            dbURL = "jdbc:mysql://localhost:3308/banking_system";
        if(username == null)
            username = "tester";
        if(password == null)
            password = "root";
        /*
            * For Local Connection:
            * grant all on banking_system.* to 'tester'@'%';
            * Connection dbConnector = DriverManager.getConnection("jdbc:mysql://localhost:3308/banking_system", "tester", "root");
            * */
        Connection dbConnection = null;
        try {
            dbConnection = DriverManager.getConnection(dbURL, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dbConnection;
    }
}
