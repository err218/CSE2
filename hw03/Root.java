/*Emma Resnick
CSE2
14 September 2014
Hw03
*/

//import Scanner class
import java.util.Scanner;

public class Root{
    public static void main(String [] arg){
        
        Scanner myScanner;
        
        myScanner =new Scanner (System.in);
        
        System.out.print("Enter an x value to find its cube root: ");
        double xValue=myScanner.nextDouble();
        
        //guesses
        double guess1= xValue/3;
        double guess2=((2*guess1*guess1*guess1+xValue)/(3*guess1*guess1));
        double guess3 =((2*guess2*guess2*guess2+xValue)/(3*guess2*guess2));
        double guess4 =((2*guess3*guess3*guess3+xValue)/(3*guess3*guess3));
        double guess5 =((2*guess4*guess4*guess4+xValue)/(3*guess4*guess4));
        
        //show guess5 cubed to see if guess was accurate
        double guess5Cubed=guess5*guess5*guess5;
        
        System.out.println("The first guess of the cube root is: " + guess1);
        System.out.println("The second guess of the cube root is: " + guess2);
        System.out.println("The third guess of the cube root is: " + guess3);
        System.out.println("The fourth guess of the cube root is: " + guess4);
        System.out.println("The fifth guess of the cube root is: " + guess5);
        
        System.out.println("The cube root is: "+ guess5);
        System.out.println(guess5+"*"+guess5+"*"+guess5+ "="+ guess5Cubed);
        
        
    }
    
    
}