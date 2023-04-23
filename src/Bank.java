public interface Bank {

    int checkBalance();

    Boolean addMoney(int money); //If money get added successfully then show yes & if fail show no

    Boolean withdrawMoney(int money);

    int getROI();

    int totalInterest(int loanamount, int timeInYears);


}
