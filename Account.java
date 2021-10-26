/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment12;

import javax.xml.crypto.Data;

/**
 *
 * @author USER
 */
public class Account 
{
   private int id;
   private double balance;
   private double annualInterestRate;
   private Data dataCreated;

    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Account(int id, double balance, double annualInterestRate, Data dataCreated) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dataCreated = dataCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Data getDataCreated() {
        return dataCreated;
    }

    public void setDataCreated(Data dataCreated) {
        this.dataCreated = dataCreated;
    }
    
   
   public double getMonthlyInterestRate()
   { 
       return (annualInterestRate/100)/12;
  
   }
   public void withdraw(double v)
   {
       this.balance-=v;
   }
    public void  deposit(double v)
    {
        this.balance+=v;
    }
}
