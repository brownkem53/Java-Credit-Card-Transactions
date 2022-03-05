
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kemon Brown
 */
public class Visa extends CreditCard{

    public Visa(String name, double balance, double creditLimit) {
        super(name, balance, creditLimit);
    }

    @Override
    public double calcBonusPoints() {
        
        double bonusPoints = (balance *.005);
        return bonusPoints;        
    }

    @Override
    public String addPurchase(double purchase) {
        String output = "Purchase Declined -- Over Credit Limit";
        double order =  balance + purchase;
       if(order > creditLimit){
           System.out.println(output);
       }else {
           balance += purchase;
           output = "Purchase Approved";
       }
        return output;
    }

    @Override
    public void makePayment(double payment) {
        balance = balance - payment;
    }

    @Override
    public double getBalance() {
        
        return balance;
        
    }

    @Override
    public double getCreditCardLimit() {
        
        return creditLimit;
        
    }

    @Override
    public String getName() {
        
        return name;
        
    }
    
}
