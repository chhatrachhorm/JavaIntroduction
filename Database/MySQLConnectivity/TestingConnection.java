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
        Connection connection = MySQLDBConnector.getMySQLConnection("jdbc:mysql://localhost:3308/banking_system", "tester", null);
        try {
            if(connection != null) {
                Statement statement = connection.createStatement();
                ResultSet set = statement.executeQuery("SELECT * FROM account WHERE branch_name = 'OnEnterprise Branch 1';");
                int index = 0;
                while (set.next()){
                    String builder = String.valueOf(index) + ". " + set.getString(1) + " " +
                            set.getString(2) + " " +
                            set.getLong(3) + "\n";
                    System.out.println(builder);
                    index++;
                }
                connection.close();
            }else {
                assert false: "Connection did not made properly";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
