import java.sql.*;

public class Database {

    private Connection conn;
    private final String URL = "jdbc:mysql://localhost:3306/jdbc-login";
    private final String USER = "root";
    private final String PASSWORD = "P914D@5yIu?/";

    private final String SQL_ACCOUNTS_TABLE_CREATE = "CREATE TABLE IF NOT EXISTS accounts (ID INTEGER NOT NULL AUTO_INCREMENT, FirstName varchar(255), LastName varchar(255), Email varchar(255) NOT NULL, Password varchar(255) NOT NULL, PRIMARY KEY (ID), UNIQUE (Email))";
    private final String SQL_INSERT_ACCOUNT = "INSERT INTO accounts (FirstName, LastName, Email, Password) VALUES (?, ?, ?, ?)";

    public Database(){
        connect();
    }

    public void connect(){
        try{
            conn = DriverManager.getConnection(URL, USER, PASSWORD);

        } catch(SQLException e){
            System.err.println(e.getMessage());
        }
    }

    public void createAccountsTable(){
        try{
            Statement statement = conn.createStatement();
            statement.executeUpdate(SQL_ACCOUNTS_TABLE_CREATE);
        } catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }

    public void addAccount(Account account){
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_ACCOUNT);
            preparedStatement.setString(1, account.getFirstName());
            preparedStatement.setString(2, account.getLastName());
            preparedStatement.setString(3, account.getEmail());
            preparedStatement.setString(4, account.getPassword());
            preparedStatement.executeUpdate();
        } catch(SQLException e){
            System.err.println(e.getMessage());
        }
    }

    public void removeAccount(Account account){

    }

    public void disconnect(){
        try {
            conn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
