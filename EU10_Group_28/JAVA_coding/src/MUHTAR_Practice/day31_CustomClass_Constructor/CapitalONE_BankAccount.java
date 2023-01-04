package JAVA_coding.src.MUHTAR_Practice.day31_CustomClass_Constructor;

public class CapitalONE_BankAccount {
    public static void main(String[] args) {

        BankAccount account1 =new BankAccount();
        account1.setINFO("ali Riza",234234);
        System.out.println("account1 = " + account1);

        account1.deposite(2300);
        account1.checkBalance();
        account1.deposite(300);
        account1.withdraw(400);
        account1.checkBalance();
        System.out.println("------------");

        BankAccount account2 =new BankAccount();
        account2.setINFO("Aydin CTA", 3234432);

        account2.deposite(5000);
        account2.deposite(2000);
        account2.checkBalance();
        account2.withdraw(410);
        account2.checkBalance();
    }
}
