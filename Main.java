package Assignment2_200387784;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main m = new Main();
    }

        public Main () {

            Bank b = new Bank();


            Scanner input = new Scanner(System.in);

            System.out.println("Welcome. Please enter your Bank Name: ");
            String bankName = input.nextLine();
            System.out.println("Please now enter your Branch Location");
            String branchLocation = input.nextLine();

            System.out.println("Welcome to " + branchLocation + " of " + bankName);

            boolean c = true;

            while (c == true) {

                System.out.println("Please type in one of the following options:" +
                        "'add account', " +
                        "'view accounts', " +
                        "'view account details', " +
                        "'modify an account', " +
                        "'delete an account', '" +
                        "help', " +
                        "'summary'");
                String mainAnswer = input.nextLine();

                if (mainAnswer.equals("add account")) {
                    System.out.println("You are now adding a new account.");
                    System.out.println("Please enter the name you want this account to have:");
                    String accountName = input.nextLine();
                    System.out.println("Thank you. Please enter a new account number you wish to use for this account:");
                    int accountNumber = input.nextInt();
                    System.out.println("Thank you. Now enter the account balance this account will have:");
                    int accountBalance = input.nextInt();
                    input.nextLine();

                    b.addAccount(accountNumber, accountBalance, accountName);

                    System.out.println("Perfect, the new account has been added.");
                    System.out.println("Would you like to go back to the main menu? ('yes' or 'no')");
                    String continueAnswer = input.nextLine();
                    if (continueAnswer.equals("no")) {
                        c = false;

                    } else {
                        c = true;
                    }

                } else if (mainAnswer.equals("view accounts")) {
                    b.viewAccounts();

                    System.out.println("Would you like to go back to the main menu? ('yes' or 'no')");
                    String continueAnswer = input.nextLine();
                    if (continueAnswer.equals("no")) {
                        c = false;

                    } else {
                        c = true;
                    }

                } else if (mainAnswer.equals("view account details")) {
                    System.out.println("Enter the account # you wish to see details of:");
                    int accountDetail = input.nextInt();
                    b.viewAccountDetails(accountDetail);

                    System.out.println("Would you like to go back to the main menu? ('yes' or 'no')");
                    String continueAnswer = input.nextLine();
                    if (continueAnswer.equals("no")) {
                        c = false;

                    } else {
                        c = true;
                    }

                } else if (mainAnswer.equals("modify an account")) {
                    System.out.println("Enter the account # you wish to modify:");
                    int accountDetail = input.nextInt();
                    b.modifyAccount(accountDetail);

                    System.out.println("Would you like to go back to the main menu? ('yes' or 'no')");
                    String continueAnswer = input.nextLine();
                    if (continueAnswer.equals("no")) {
                        c = false;

                    } else {
                        c = true;
                    }


                } else if (mainAnswer.equals("delete an account")) {
                    System.out.println("Enter the account # you wish to delete:");
                    int accountDetail = input.nextInt();
                    b.deleteAccount(accountDetail);

                    System.out.println("Would you like to go back to the main menu? ('yes' or 'no')");
                    String continueAnswer = input.nextLine();
                    if (continueAnswer.equals("no")) {
                        c = false;

                    } else {
                        c = true;
                    }

                } else if (mainAnswer.equals("help")) {
                    System.out.println("valid commands - 'add account', 'view accounts', 'view account details', 'modify an account', 'delete an account', 'help', 'summary' \n ");
                    System.out.println("add account - enter an account name with solely letters, no special characters. Both account number and balance can be numerical only, up to 2147483647 \n");
                    System.out.println("view accounts - will print list of all accounts, with all information \n ");
                    System.out.println("modify an account - enter account # to modify. Then type either 'name', 'number' or 'balance' and enter a new value based on rules given above in 'add account'\n");
                    System.out.println("delete account - enter account # to delete. Then hit yes on poo-up box to confirm deletion or no to keep the account\n");
                    System.out.println("summary - will display total number of accounts created, sum of all balances, and average of all balances.\n");
                    System.out.println("Under most circumstances if a a valid command is not entered or a task is completed, you will be returned to the main menu");


                    System.out.println("Would you like to go back to the main menu? ('yes' or 'no')");
                    String continueAnswer = input.nextLine();
                    if (continueAnswer.equals("no")) {
                        c = false;

                    } else {
                        c = true;
                    }
                } else if (mainAnswer.equals("summary")) {
                    b.summary();

                    System.out.println("Would you like to go back to the main menu? ('yes' or 'no')");
                    String continueAnswer = input.nextLine();
                    if (continueAnswer.equals("no")) {
                        c = false;

                    } else {
                        c = true;
                    }

                } else {
                    System.out.println("Returning to Main Menu");
                }


            }
        }

    }
