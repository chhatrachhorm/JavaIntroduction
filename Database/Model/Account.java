package model;


import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class Account {
    private String accountNum, branchName;
    private long balance;
    Account(String accountNum, String branchName, long balance){
        this.accountNum = accountNum;
        this.branchName = branchName;
        this.balance = balance;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public static void getAccountInfo(Statement statement) throws SQLException{
        ResultSet set = statement.executeQuery("SELECT * FROM account;");
        int index = 0;
        while (set.next()){
            String builder = String.valueOf(index) + ". " + set.getString(1) + " " +
                    set.getString(2) + " " +
                    set.getLong(3) + "\n";
            System.out.println(builder);
            index++;
        }
    }
    public static void inputAccount(Statement statement) throws SQLException {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter 0 or 1: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            while (option != 0){
                System.out.println("Enter \"accountNum, branchName, balance\"and Click Enter. Enter 0 to exit");
                String accountInfo = scanner.nextLine();
                if(!accountInfo.equals("0")){
                    String[] infos = accountInfo.split(", ");
                    Account account = new Account(infos[0], infos[1], Long.parseLong(infos[2]));
                    Account.addNewAccount(statement, account);
                    System.out.println(account.toString());
                }else break;
            }
        }
    }
    private static void addNewAccount(Statement statement, Account account) throws SQLException {
        String query = "INSERT INTO account VALUE ('" + account.getAccountNum() + "', '" + account.getBranchName() + "', " + account.getBalance() + ");";
        statement.execute(query);
    }
    public static void transferMoney(Connection connection, String debitID, String creditID, long amount){
        PreparedStatement updateDebit = null;
        PreparedStatement updateCredit = null;
        String updateAmountDebit = "UPDATE account SET balance = balance - ? WHERE account_number = ?";
        String updateAmountCredit = "UPDATE account SET balance = balance + ? WHERE account_number = ?";
        try{
            connection.setAutoCommit(false);
            updateDebit = connection.prepareStatement(updateAmountDebit);
            updateCredit = connection.prepareStatement(updateAmountCredit);
            updateDebit.setLong(1, amount);
            updateDebit.setString(2, debitID);
            updateDebit.executeUpdate();
            updateCredit.setLong(1, amount);
            updateCredit.setString(2, creditID);
            updateCredit.executeUpdate();
            connection.commit();
        } catch (Exception e){
            e.printStackTrace();
            try{
                System.err.print("Transaction is being rolled back");
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
                System.err.print("Transaction rollback failed");
            }
        } finally {
            try {
                if(updateDebit != null){
                    updateDebit.close();
                }
                if(updateCredit != null){
                    updateCredit.close();
                }
                connection.setAutoCommit(true);
            }catch (SQLException e){
                e.printStackTrace();
                System.err.print("Closing Updation Object Failed");
            }
        }

    }

    public static void batchUpdate(Statement statement, List<String> queryList) throws SQLException {
        if(queryList != null && !queryList.isEmpty()){
            for(String q:queryList)
                statement.addBatch(q);
            statement.executeBatch();
        }
    }
    @Override
    public String toString() {
        return "Account: " + accountNum + ", " + branchName + " " + balance;
    }
}