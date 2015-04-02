import java.util.Scanner;

public class Money extends CandyMachine {
    
    private double changeEntered = 0.0;
    
    public double insertMoney(double mon) {
       
        int input;
        mon = changeEntered;
        
        System.out.println("Credit: $" + changeEntered);
        System.out.println("1: Quarter");
        System.out.println("2: Dime");
        System.out.println("3: Nickel");
        System.out.println("4: Penny");
        
        Scanner scanIn = new Scanner(System.in); 
        input = scanIn.nextInt();
        
            switch(input){
                case 0: 
                    return changeEntered;
                case 1:
                     changeEntered += 0.25;
                     break;
                case 2:
                    changeEntered += 0.10;
                    break;
                case 3: 
                    changeEntered += 0.05;
                    break; 
                case 4:
                    changeEntered += 0.01;
                     break;
                default:
                    System.out.println("Please enter a valid number for the coins listed");
                    break;                      
            }
        return changeEntered;
    }
}
