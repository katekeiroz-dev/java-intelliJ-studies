//encapsulation step
//Wrap the data (fields)
//declare the fields of a class a private
//provide public setter and getter methods to modify and view the fields values
// all fields should be private

// getters : acsessor methods : does not change the object state
// it is like a take a photography of the object only but not change anything

// Setters ( Mutator methods )
// takes in a parameter and changes the object state


public class NewBankAccount {
    private String name;
    private String accountNumber;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private double limit;


    public NewBankAccount() {

    }

    public NewBankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        if (balance >= 0)
            this.balance = balance;
        else this.balance = 0;
        limit = 0;

    }

    public void deposit(double lodgement) {
        balance += lodgement;
    }

    public String withdraw(double withdraw) {
        if (withdraw <= balance + limit) {
            balance -= withdraw;
            return (" Withdraw successful");
        } else return ("Unable to withdraw $ " + withdraw + "for" + name + "due to insuficient funds");

    }

    public String display() {
        return "Name: " + name + ", Account Number:" + accountNumber + "Balance: $" + balance;
    }
}

