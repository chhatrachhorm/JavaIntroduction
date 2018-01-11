package Worker;

import Model.Account;
import MySQLConnectivity.MySQLDBConnector;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TestingConnection {
    public static void main(String[] args) {
        /*
        * null is given 'cause it will be handled by default in MySQLDBConnector class
        * */
        Connection connection = MySQLDBConnector.getMySQLConnection("jdbc:mysql://localhost:3306/banking_system", "tester", null);
        try {
            if(connection != null) {
                Statement statement = connection.createStatement();
                Account.inputAccount(statement);
                Account.getAccountInfo(statement);
                Account.transferMoney(connection, "1234", "1235", 1000);
                List<String> queryList = new ArrayList<>();
                queryList.add("UPDATE account SET balance = 100000 where account_number Like 'A%';");
                queryList.add("UPDATE account SET balance = 524560 where account_number Like 'AE17%';");
                Account.batchUpdate(connection.createStatement(), queryList);
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
