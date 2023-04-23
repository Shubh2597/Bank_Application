import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank sbiBankAccount = new SBIBankAccount(1000,"Shubham","Shubham123");
        sbiBankAccount.addMoney(1000);
        Boolean withdrawStatus = sbiBankAccount.withdrawMoney(1300);
        if(Boolean.True.equals(withdrawStatus)){
            System.out.println("Successfully WithDrawn Money From Your Bank Account");
        }else{
            System.out.println("Sorry For Your Inconvenience");
        }
        int balance= sbiBankAccount.checkBalance();

        SBIBankAccount sbiBankAcc2 = new SBIBankAccount();
        sbiBankAcc2.setName("Sahil Kumar");
        sbiBankAcc2.setBalance(10000);
        sbiBankAcc2.setPassword("sahilwe67");







    }
}