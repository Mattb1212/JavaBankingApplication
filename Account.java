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

    public static boolean checkAlphaNumerical(int accountNumber) {

        String stringNumber = String.valueOf(accountNumber);

        for (int i = 0; i != stringNumber.length(); ++i) {
            if (!Character.isLetter(stringNumber.charAt(i)) && !Character.isDigit(stringNumber.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkAlphabetical(String accountName) {
        for (int i = 0; i != accountName.length(); ++i) {
            if (!Character.isLetter(accountName.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkNegative(int accountBalance) {
            if (accountBalance < 0) {
                return false;
            }
        return true;
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

