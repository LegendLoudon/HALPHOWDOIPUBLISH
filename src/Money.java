import java.util.Scanner;
import java.text.*;

public class Money {
    
    private double changeEntered = 0.0;
    
    public double insertMoney(double mon) {
       
        int input;
        mon = changeEntered;
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("\nCredit: $" + df.format(changeEntered));
        System.out.println("1: One dollar bill");
        System.out.println("2: Quarter");
        System.out.println("3: Dime");
        System.out.println("4: Nickel");
        
        Scanner scanIn = new Scanner(System.in); 
        input = scanIn.nextInt();
        
            switch(input){
                case 0: 
                    return changeEntered;
                case 1:
                     changeEntered += 1.00;
                     break;
                case 2:
                    changeEntered += 0.25;
                    break;
                case 3: 
                    changeEntered += 0.10;
                    break; 
                case 4:
                    changeEntered += 0.05;
                     break;
                default:
                    System.out.println("Please enter a valid number for the coins listed");
                    break;                      
            }
        return changeEntered;
    }
}
