public class Main {

    public static void main(String[] args) {
        Database db = new Database();
        db.connect();
        db.createAccountsTable();

        Account account1 = new Account("Bryan", "Crombach", "bryancrombach@gmail.com", "password");
        db.addAccount(account1);

        Account account2 = new Account("Bryan", "Crombach", "crombach@gmail.com", "password");
        db.addAccount(account2);

        db.disconnect();
    }
}
