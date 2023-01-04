package JAVA_coding.src.MUHTAR_Practice.day31_CustomClass_Constructor;

public class BankAccount {
    public String accontHolder;
    public long accountNumber;
    public double balance;

    public void setINFO(String accontHolder, long accountNumber) {
        this.accontHolder = accontHolder;
        this.accountNumber = accountNumber;
    }

    public void setINFOAll(String accontHolder, long accountNumber, double balanceNumber) {
        this.accontHolder = accontHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String toString() {
        return "BankAccount{" +
                "accontHolder='" + accontHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balanceNumber= $ " + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your avaible balance: "+balance);
    }
    public void deposite(double amount){
       if (amount <= 0) {
           System.out.println("Depositing amount can not be zero or negative");
           return;   // exit the method
       }
        balance += amount;
    }
    public void withdraw(double amount){
        if (amount > balance){               // if withdraw amount is greater than avaible balance
            System.out.println("insufficient balance");
            return;
        }
        if (amount <= 0){               // if withdraw amount is negative or zero
            System.out.println("Withdraw amount can not be negative or zero");
            return;
        }
        balance -= amount;
    }
}
