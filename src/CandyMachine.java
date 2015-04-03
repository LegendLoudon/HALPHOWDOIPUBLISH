
import java.text.DecimalFormat;
import java.util.Scanner; 

public class CandyMachine {
    
    public static double credit = 0.0;
    public static int quarters = 0, dimes = 0, nickels = 0;

    public static void main(String[] args) {
     
        int input;
        
        System.out.println("Credit: " + credit);
        System.out.println("1: Insert Money");
        System.out.println("2. Reccess Pieces $1.00");
        System.out.println("3. Abba Zabba $1.50");
        System.out.println("4. Sour Patch Kids $0.95");
        System.out.println("5. Change Return");
        System.out.printf("Selection: ");
        
        Scanner scanIn = new Scanner(System.in);
        input = scanIn.nextInt();
            
        while(input != 0){ 
     
            switch (input){

                case 1:
                    insertMoney();
                    break; 
                case 2:
                    System.out.println("fk u, this isn't implemented yet");
                    break;               
                case 3:
                    System.out.println("fk u, this isn't implemented yet");
                    break;
                case 4:
                    System.out.println("fk u, this isn't implemented yet");
                    break;
                case 5:
                    System.out.println("fk u, this isn't implemented yet");
                    break;
                default:
                    System.out.println("Enter in a value between 0 - 4 please. "
                                       + "Thanks!");
                    break;
            }   
        }
    }
    public static double insertMoney() {
       
        int input;

        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("\nCredit: $" + df.format(credit));
        System.out.println("1: One dollar bill");
        System.out.println("2: Quarter");
        System.out.println("3: Dime");
        System.out.println("4: Nickel");
        
        Scanner scanIn = new Scanner(System.in); 
        input = scanIn.nextInt();
        
            switch(input){
                case 1:
                     credit += 1.00;
                     break;
                case 2:
                    credit += 0.25;
                    quarters++;
                    break;
                case 3: 
                    credit += 0.10;
                    dimes++;
                    break; 
                case 4:
                    credit += 0.05;
                    nickels++;
                    break;
                default:
                    System.out.println("Please enter a valid number for the coins listed");
                    break;        
            }
            return credit;
    }
}
    
          

