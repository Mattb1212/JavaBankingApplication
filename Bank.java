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

        Account newAccount = new Account(accountNumber, accountBalance, accountName);
        Accounts.add(newAccount);

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
                System.out.println("Sorry, it doesn't seem like that account # is in our records.");
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
                    item.setAccountName(newName);
                    System.out.println("Account has been modified.");

                } else if (modifyAnswer.equals("number")) {
                    System.out.println("Please enter the new number:");
                    int newNumber = input.nextInt();
                    item.setAccountNumber(newNumber);
                    input.nextLine();
                    System.out.println("Account has been modified.");

                } else if (modifyAnswer.equals("balance")) {
                    System.out.println("Please enter the new balance:");
                    int newBalance = input.nextInt();
                    item.setAccountBalance(newBalance);
                    input.nextLine();
                    System.out.println("Account has been modified.");
                } else {
                }

                break;

            } else {
                System.out.println("Sorry, it doesn't seem like that account # is in our records.");
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
                        System.out.println("Sorry, it doesn't seem like that account # is in our records.");
                    }
            }

        }

        public void summary(){

            System.out.println("You have this many total accounts: " + Accounts.size());


        }
    }



