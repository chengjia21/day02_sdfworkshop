package iss.sg.edu.nus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAccount {

    //final keyword so can no longer change name after acc is created
    private final String fullName;
    private String accountNumber;
    private float balance;
    private boolean isClosed;
    private Date accountStartDate;
    private Date accountEndDate;
    private List<String> transactions;




      //Constructor
      public BankAccount(String fullName, String accountNumber) {
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.balance = 0.0f;

        this.accountStartDate = new Date();
        transactions = new ArrayList<>();
    }
    public BankAccount(String fullName, String accountNumber, float balance) {
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.balance = balance;

        transactions = new ArrayList<>();

    }

    
    public String getFullName() {
        return fullName;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public float getBalance() {
        return balance;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    public boolean isClosed() {
        return isClosed;
    }
    public void setClosed(boolean isClosed) {
        this.isClosed = isClosed;
    }
    public Date getAccountStartDate() {
        return accountStartDate;
    }
    public void setAccountStartDate(Date accountStartDate) {
        this.accountStartDate = accountStartDate;
    }
    public Date getAccountEndDate() {
        return accountEndDate;
    }
    public void setAccountEndDate(Date accountEndDate) {
        this.accountEndDate = accountEndDate;
    }
    public List<String> getTransactions() {
        return transactions;
    }
    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }


    public void deposit(float amount) {
        if (isClosed){
            throw new IllegalArgumentException("Account closed/inactive");
        }
        if (amount < 0){
            throw new IllegalArgumentException("You cannot make a negative amount deposit");
        } else {
            balance += amount;

            Date dt = new Date();
            transactions.add("Deposit " + amount + "to account " + accountNumber + " on " + dt.toString());
        }

    }

    public void withdraw(float amount) {
        if (isClosed){
            throw new IllegalArgumentException("Account closed/inactive");
        }
        if (amount > balance){
            throw new IllegalArgumentException("You cannot withdraw more than your account balance");
        } else {
            balance -= amount;

            Date dt = new Date();
            transactions.add("Withdrawal " + amount + "to account " + accountNumber + " on " + dt.toString());


        }

    }

    @Override
    public String toString() {
        // return "BankAccount [fullName=" + fullName + ", accountNumber=" + accountNumber + ", balance=" + balance
        //         + ", isClosed=" + isClosed + ", accountStartDate=" + accountStartDate + ", accountEndDate="
        //         + accountEndDate + ", transactions=" + transactions + "]";
        return "BankAccount [fullName=" + fullName + ", accountNumber=" + accountNumber + ", balance=" + balance
        + ", isClosed=" + isClosed + ", accountStartDate=" + accountStartDate + ", accountEndDate="
        + accountEndDate + "]";

    }

    



  
    }

    





    
    

