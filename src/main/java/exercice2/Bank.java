package exercice2;

public class Bank {
    private String name;
    private Account[] accounts;

    public Bank(String name, Account[] accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account account) {
        Account[] newAccounts = new Account[this.accounts.length + 1];
        for (int i = 0; i < this.accounts.length; i++) {
            newAccounts[i] = this.accounts[i];
        }
        newAccounts[this.accounts.length] = account;
        this.accounts = newAccounts;
    }

    public void removeAccount(Account account) {
        Account[] newAccounts = new Account[this.accounts.length - 1];
        int j = 0;
        for (int i = 0; i < this.accounts.length; i++) {
            if (this.accounts[i] != account) {
                newAccounts[j] = this.accounts[i];
                j++;
            }
        }
        this.accounts = newAccounts;
    }

    public void showAccounts() {
        for (int i = 0; i < this.accounts.length; i++) {
            System.out.println("Account " + (i + 1) + ":");
            System.out.println("ID: " + this.accounts[i].getId());
            System.out.println("Solde: " + this.accounts[i].getSolde());
            System.out.println("Taux: " + this.accounts[i].getTaux());
            System.out.println();
        }
    }

    public void transfer(Account account1, Account account2, double montant) {
        account1.transfer(account2, montant);
    }
}
