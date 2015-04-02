
import java.util.Scanner; 

public class CandyMachine {

    public static void main(String[] args) {
     
        int x = 0, input;
        double credit = 0.0;
        Money m = new Money();
        
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
                    m.insertMoney(credit);
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
}
