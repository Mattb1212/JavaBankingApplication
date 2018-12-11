package Assignment2_200387784;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class Bank {
    Scanner input = new Scanner(System.in);



    public ArrayList<Account> Accounts = new ArrayList<Account>();

    public void addAccount(int accountNumber, int accountBalance, String accountName){

            boolean valid = Account.checkAlphaNumerical(accountNumber);
            boolean valid2 = Account.checkAlphabetical(accountName);
            boolean valid3 = Account.checkNegative(accountBalance);

            if (valid && valid2 && valid3) {
                Account newAccount = new Account(accountNumber, accountBalance, accountName);
                Accounts.add(newAccount);
                System.out.println("Perfect, the new account has been added.");
            }else{
                System.out.println("Please try again. Ensure that account names only contain alphabetical characters, account numbers only alphanumerical characters and account balances are not negative.");
            }

    }


    public void viewAccounts(){
        System.out.println(Accounts);

    }


    public void viewAccountDetails(int accountDetail){

        for (Account item : Accounts) {

            if (item.getAccountNumber() == accountDetail) {
                System.out.println("Here are the account details for that account: " + item);
                break;

            } else {
                continue;
            }
        }
    }

    public void modifyAccount(int accountDetail) {
        for (Account item : Accounts) {

            if (item.getAccountNumber() == accountDetail) {
                System.out.println("Please enter what aspect of the account you would like modified: 'name', 'number', 'balance'");
                String modifyAnswer = input.nextLine();
                if (modifyAnswer.equals("name")) {
                    System.out.println("Please enter the new name:");
                    String newName = input.nextLine();
                    boolean valid = Account.checkAlphabetical(newName);
                    if(valid) {
                        item.setAccountName(newName);
                        System.out.println("Account has been modified.");
                    }else{
                    System.out.println( "Please try again, account name can only be alphabetical");
                }

                } else if (modifyAnswer.equals("number")) {
                    System.out.println("Please enter the new number:");
                    int newNumber = input.nextInt();
                    boolean valid = Account.checkAlphaNumerical(newNumber);
                    if(valid) {
                        item.setAccountNumber(newNumber);
                        input.nextLine();
                        System.out.println("Account has been modified.");
                    }else{
                        System.out.println( "Please try again, account number can only be alphanumerical");
                    }

                } else if (modifyAnswer.equals("balance")) {
                    System.out.println("Please enter the new balance:");
                    int newBalance = input.nextInt();
                    boolean valid = Account.checkNegative(newBalance);
                    if(valid) {
                        item.setAccountBalance(newBalance);
                        input.nextLine();
                        System.out.println("Account has been modified.");
                    }else{
                        System.out.println( "Please try again, account balance can not be negative.");
                    }
                } else {
                }

                break;

            } else {
                continue;
            }
        }
    }

            public void deleteAccount(int accountDetail) {
                for (Account item : Accounts) {

                    if (item.getAccountNumber() == accountDetail) {

                        JDialog.setDefaultLookAndFeelDecorated(true);
                        int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (response == JOptionPane.NO_OPTION) {
                            break;
                        } else if (response == JOptionPane.YES_OPTION) {
                            Accounts.remove(item);
                            System.out.println("Account has been deleted.");
                        } else if (response == JOptionPane.CLOSED_OPTION) {
                            break;
                        }

                        break;

                    } else {
                        continue;
                    }
            }

        }

        public void summary(){
            System.out.println("Your Summary:");
            System.out.println("You have this many total accounts: " + Accounts.size());

            int total = 0;
            int count = 0;
            for (Account item : Accounts) {

                count += 1;
                total += item.getAccountBalance();

            }
            System.out.println("The total sum of all balances in your accounts is: " + total);

            int average = total/count;
            System.out.println("The average balance between all of your accounts is: " + average);

        }
    }



