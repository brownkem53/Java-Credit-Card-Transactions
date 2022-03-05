
/**
 *
 * @author Kemon Brown
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        CreditCard[] card = {new Visa("Rich", 1999.99, 2000), new Visa("Lori", 100.22, 1500), new VisaGold("Aiko", 900.43, 1000)};
          
        for(int i=0; i<card.length; i++){
            System.out.println("Card belongs to: " + card[i].getName());
            System.out.println("Current balance owing: " + card[i].getBalance());
            System.out.println("Bonus Point: " + card[i].calcBonusPoints());
            System.out.println("Making purchase of $100: " + card[i].addPurchase(100));
            System.out.println("Paying off credit card");
            double payBill = card[i].getBalance();
            card[i].makePayment(payBill);
            System.out.println("New Balance: " + card[i].getBalance());
            System.out.println("");
        }
    }
    
}