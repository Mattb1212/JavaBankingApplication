package Assignment2_200387784;

public class Account {

    private int accountNumber;
    private int accountBalance;
    private String accountName;

    @Override
    public String toString() {
        return ("Account Name: "+this.getAccountName()+
                "| Account #: "+ this.getAccountNumber() +
                "| Current Balance: "+ this.getAccountBalance());
    }



    public Account(int accountNumber, int accountBalance, String accountName){
    this.accountNumber = accountNumber;
    this.accountBalance = accountBalance;
    this.accountName = accountName;
    }


    public void setAccountName(String newAccountName) {
        this.accountName = newAccountName;
    }

    public void setAccountNumber(int newAccountNumber) {
        this.accountNumber= newAccountNumber;
    }

    public void setAccountBalance(int newAccountBalance) {
        this.accountBalance = newAccountBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

}

