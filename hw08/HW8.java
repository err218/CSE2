/* Emma Resnick
    CSE2
    hw08
    10/28/14*/

/*
This program first takes a char from a user. If the user enters one char that is either C or c, the program moves on. 
If not (such as the user entered more than one char or the char wasn't C or c), the user is prompted again for C or c.
Once C or c is entered, the user is brought to the next step, where they have to enter a char that is either y, Y, n, N. If the 
char entered is not one of those for chars, the user is given 5 tries to get the right char, then the program gives up. If one 
of the four chars is entered, the user is brought to the final step, in which they are prompted to enter a char of the digits
from 0 through 9, and then their char is displayed.
*/




import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
public class HW8 {
    public static void main(String[] arg) {
        char input;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
        input = getInput(scan, "Cc");
        System.out.println("You entered '" + input + "'");
        System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
        input = getInput(scan, "yYnN", 5); //give up after 5 attempts
        if (input != ' ') {
            System.out.println("You entered '" + input + "'");
        }
        input = getInput(scan, "Choose a digit.", "0123456789"); //0123456789
        System.out.println("You entered '" + input + "'");
    }

    //first section of code/ first prompt for user
    public static char getInput(Scanner scanInput, String letter) {

            for (int i = 0; i <= letter.length(); i++) {
              String c= scanInput.next();
                    //isolates first char in string
                    if (c.charAt(0) == letter.charAt(i)) {
                        return letter.charAt(i);

                    }
                    
                    //isolates second char in string
                    if (c.charAt(0) == letter.charAt(i + 1)) {
                        return letter.charAt(i + 1);
                    }

                    //if char other than ones used in string are used
                    else {
                        
                        
                        if (c.length() > 1) {
                        System.out.print("You should type only one character. Try again :");
                      
                        }
                        
                        else{
                             System.out.print("You did not enter from the list " + letter);
                        }
                        
                    }

    

               

            }
            return scanInput.next(".").charAt(0);
        }
        //second section of code/ second prompt for user
    public static char getInput(Scanner scanInput, String letter, int attempts) {
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < letter.length(); i++) {


            if (scanInput.next(".").charAt(0) == letter.charAt(i)) {
                return letter.charAt(i);
            }
            
             else {
               

                    System.out.print("You did not enter from the list " + letter + " try again: ");


                   
            }

            if (scanInput.next(".").charAt(0) == letter.charAt(i + 1)) {
                return letter.charAt(i + 1);
            }
             else {
             

                    System.out.print("You did not enter from the list " + letter + " try again: ");


            }

            if (scanInput.next(".").charAt(0) == letter.charAt(i + 2)) {
                return letter.charAt(i + 2);
            }
            
             else {
             
                    System.out.print("You did not enter from the list " + letter + " try again: ");


            }

            if (scanInput.next(".").charAt(0) == letter.charAt(i + 3)) {
                return letter.charAt(i + 3);
            }

            //gives attempts if input does not match what is asked for
            else {
                for (int j = 0; j <= attempts; j++) {

                    System.out.print("You did not enter from the list " + letter + " try again: ");


                    if (i == j && scanInput.next(".").charAt(0) != letter.charAt(i)) {
                        System.out.print("You failed after " + attempts + " tries");
                        System.exit(0);

                    }
                    
                }
            }
            

            if (scanInput.next(".").charAt(0) > letter.charAt(i)) {
                System.out.print("You should type only one character: ");

            }

        }


        return scanInput.next(".").charAt(0);

    }



    public static char getInput(Scanner scanInput, String command, String list) {
        System.out.print(command);
        System.out.println("Enter one of: '" + list.charAt(0) + "' '" + list.charAt(1) + "' '" + list.charAt(2) + "' '" + list.charAt(3) + "' '" + list.charAt(4) + "' '" + list.charAt(5) + "' '" + list.charAt(6) + "' '" + list.charAt(7) + "' '" + list.charAt(8) + "' '" + list.charAt(9) + "'");
        if (scanInput.hasNext(".")) {
            System.out.print("You entered: " + scanInput.next("."));
            System.exit(0);
        }
        
        /*
        I know why this section allows any char in here. See above in first method, I just did not have time to implement it. If char is
        greater than 1, then it cannot be taken and the user is prompted to try again
        */
        
        return scanInput.next(".").charAt(0);
    }

}
