/*Emma Resnick
CSE2
14 September 2014
Hw03
*/

//import scanner
import java.util.Scanner;

//class
public class FourDigits{
    //main method
    public static void main (String []arg){
        //define variable
        Scanner myScanner;
        
        myScanner= new Scanner (System.in);
        
        System.out.print("Enter a double and I will display the first four digits to the right of the decimal point: ");
        
        //allows user to enter a double 
        double myDouble=myScanner.nextDouble();
        
        //This allows for only the digits after the decimal place to be multiplied by 10000.
        double firstFour= (myDouble-Math.floor(myDouble))*10000;
        
        System.out.printf("The first four digits to the right of the decimal point are: "+ "%.0f",firstFour);
    }
}