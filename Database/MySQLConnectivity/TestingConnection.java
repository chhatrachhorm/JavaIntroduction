package MySQLConnectivity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestingConnection {
    public static void main(String[] args) {
        /*
        * null is given 'cause it will be handled by default in MySQLDBConnector class
        * */
        Connection connection = MySQLDBConnector.getMySQLConnection(null, null, null);
        try {
            if(connection != null) {
                Statement statement = connection.createStatement();
                ResultSet set = statement.executeQuery("select * from account where branch_name = 'OnEnterprise Branch 1';");
                int index = 0;
                while (set.next()){
                    String builder = String.valueOf(index) + ". " + set.getString(1) + " " +
                            set.getString(2) + " " +
                            set.getLong(3) + "\n";
                    System.out.println(builder);
                }
                connection.close();
            }else {
                assert false: "Connection did not made properly";
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
