public class BankAccount {

    public static void main(String[] args) {

        String name = "Chloe Lee";
        String accountNum = "123456789NOP";
        double balance = 5000.0;


        //deposit

        double depositAmount = 1500.0;
        balance += depositAmount;


        //withdraw
        double withdrawAmount = 100.0;
        if (balance >= withdrawAmount) {

            balance -= withdrawAmount;
        } else {
            System.out.println("Unable to withdraw €" + withdrawAmount + "for " + name + "due to insufficient funds. ");
        }

        System.out.println("Name : " + name + ", Account Number : " + accountNum + ", Balance :€  " + balance);
    }

}
