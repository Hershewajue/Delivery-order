import java.util.Scanner;

public class DeliveryOrder {
	public static void main(String[] args) {
    int numOfComputers;
    float totalAmount = 0; 
    boolean expressDeliveryRequired;
    final int DISCTHR1 = 20; 
    final int DISCTHR2 = 50; 
    final float DISCOUNT1 = 0.1F;
    final float DISCOUNT2 = 0.2F;
    final float PRICE = 300.0F;
    final float EXPRDELIVPRICE = 7.50F;
    Scanner in = new Scanner(System.in);
    System.out.println("How many comupters: ");
    numOfComputers = in.nextInt();
    System.out.println("Is express delivery required (enter True or False): ");
    expressDeliveryRequired = in.nextBoolean();
    if(numOfComputers < DISCTHR1){
    	totalAmount = numOfComputers * PRICE;
    }
    else if(numOfComputers < DISCTHR2){
    	totalAmount = numOfComputers * (PRICE - PRICE * DISCOUNT1);
    }
    else{
    	totalAmount = numOfComputers * (PRICE - PRICE * DISCOUNT2);
    }
    	
    
    if(expressDeliveryRequired){
    	totalAmount += EXPRDELIVPRICE;
    }
    
    System.out.println("The total order cost is " + totalAmount + " pounds");
    
    
		
		
	}
}


