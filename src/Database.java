//Purpose: class that runs the database for login functionality
//Author: Bryan Crombach

import java.sql.*;

public class Database implements Credentials{

    //variables for connecting to the database
    private Connection conn;

    //SQL queries to be used in statements
    private final String SQL_ACCOUNTS_TABLE_CREATE = "CREATE TABLE IF NOT EXISTS accounts (ID INTEGER NOT NULL AUTO_INCREMENT, FirstName varchar(255), LastName varchar(255), Email varchar(255) NOT NULL, Password varchar(255) NOT NULL, PRIMARY KEY (ID), UNIQUE (Email))";
    private final String SQL_INSERT_ACCOUNT = "INSERT INTO accounts (FirstName, LastName, Email, Password) VALUES (?, ?, ?, ?)";
    private final String SQL_DELETE_ACCOUNT = "DELETE FROM accounts WHERE Email = ?";
    private final String SQL_CHECK_ACCOUNT = "SELECT * FROM accounts WHERE Email = ?";
    private final String SQL_FIND_ACCOUNT = "SELECT * FROM accounts WHERE Email = ? AND BINARY Password = ?";

    public Database(){
        connect();
    }

    //connect to the database
    public void connect(){
        try{
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            createAccountsTable();

        } catch(SQLException e){
            System.err.println(e.getMessage());
        }
    }

    //create the accounts table
    public void createAccountsTable(){
        try{
            Statement statement = conn.createStatement();
            statement.executeUpdate(SQL_ACCOUNTS_TABLE_CREATE);
            statement.close();

        } catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }

    //add account to the database
    public void addAccount(Account account){
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_ACCOUNT);
            preparedStatement.setString(1, account.getFirstName());
            preparedStatement.setString(2, account.getLastName());
            preparedStatement.setString(3, account.getEmail());
            preparedStatement.setString(4, account.getPassword());
            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch(SQLException e){
            System.err.println(e.getMessage());
        }
    }

    //remove account from the database
    public void removeAccount(Account account){
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(SQL_DELETE_ACCOUNT);
            preparedStatement.setString(1, account.getEmail());
            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    //check if an account exists in the database
    public boolean emailExists(Account account){
        try{
            PreparedStatement preparedStatement = conn.prepareStatement(SQL_CHECK_ACCOUNT);
            preparedStatement.setString(1, account.getEmail());
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                preparedStatement.close();
                return true;
            }
            preparedStatement.close();

        } catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return false;
    }

    //check if the account exists in the database
    public boolean accountExists(String email, String password){
        try{
            PreparedStatement preparedStatement = conn.prepareStatement(SQL_FIND_ACCOUNT);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                preparedStatement.close();
                return true;
            }
            preparedStatement.close();

        } catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return false;
    }

    //get the full name of the account
    public Account getAccount(String email, String password){
        Account account = null;

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(SQL_FIND_ACCOUNT);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                account = new Account(resultSet.getString("FirstName"), resultSet.getString("LastName"), resultSet.getString("Email"), resultSet.getString("Password"));
            }
            preparedStatement.close();
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }

        return account;
    }

    //close connection from database
    public void disconnect(){
        try {
            conn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
