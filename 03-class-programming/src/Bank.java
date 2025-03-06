public class Bank {

    String name;
    String accountNum;
    double balance;

    public static void main(String[] args){
        Bank bankAccount1 = new Bank(); // declaring an object BankAccount1, of type Bank
        bankAccount1.name = "Liam Lee";
        bankAccount1.accountNum = "187290GHU";
        bankAccount1.balance = 6000.0;

        double depositAmount = 3000.0;
        //deposit and withdraw
        bankAccount1.balance += depositAmount;


        //withdraw
        double withdrawAmount = 200.0;
        if(bankAccount1.balance >= withdrawAmount){
            bankAccount1.balance -= withdrawAmount;
        } else {
            System.out.println("Unable to withdraw €" + withdrawAmount + "for " + bankAccount1.name + "due to insufficient funds. ");
        }

        System.out.println("Name : " + bankAccount1.name + ", Account Number : " + bankAccount1.accountNum + ", Balance :€  " + bankAccount1.balance);

    }
}
