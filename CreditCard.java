
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kemon
 */
public abstract class CreditCard implements CCFunctions{
    
    protected String name;
    protected double balance;
    protected double creditLimit;
    
    private CreditCard[] card = new CreditCard[10];

    public CreditCard(String name, double balance, double creditLimit) {
        this.name = name;
        this.balance = balance;
        this.creditLimit = creditLimit;
    }
    
    @Override
    public abstract String addPurchase(double purchase);
    
    
    @Override
    public abstract void makePayment(double payment);
    
    
    @Override
    public abstract double getBalance();    
    
    
    @Override
    public abstract double getCreditCardLimit();
    
    
    @Override
    public abstract String getName();
    
    
     public abstract double calcBonusPoints();
}
