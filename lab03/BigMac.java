//Emma Resnick
//CSE2
//10 September 2014
//Lab 03

/*This program uses the scanner class to see how many Big Macs there are, 
the cost per Big Mac, and the sales tax. It also displays the final cost.
*/

//import class
import java.util.Scanner;

public class BigMac {
    public static void main(String [] arg){
        
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        System.out.print("Enter the number of Big Macs (an integer >0): ");
        
        int nBigMacs =myScanner.nextInt();
        
        System.out.print("Enter the cost per Big Mac as" + 
        " a double (in the form xx.xx): ");
        
        double bigMac$= myScanner.nextDouble();
        
        System.out.print ("Enter the percent tax as a whole number (xx): ");
        
        double taxRate = myScanner.nextDouble();
        taxRate/=100; //user enters percent, but I want proportion
        
        double cost$;
        
        /*Whole dollar amount and storing digits
        to the right of the decimal place for cost$
        */
        int dollars,
            dimes,
            pennies;
            
        cost$=nBigMacs*bigMac$*(1+taxRate);
        
        //get whole amount, dropping decimal fraction
        
        dollars= (int) cost$;
        /* get dimes amount, e.g.
        (int) (6.73*10) % 10 -> 67%10 -> 7
        where the % (mod) operator returns the remainder
        after the division: 583%100 -> 83, 27%5 -> 2
        */
        
        dimes=(int)(cost$*10)%10;
        pennies=(int)(cost$*100)%10;
        
        System.out.println("The total cost of " +nBigMacs+ 
        " BigMacs, at $"+bigMac$+ " per BigMac, with a" +" sales tax of"+ 
        (int)(taxRate*100)+"%, is $"+ dollars+'.'+dimes+pennies);
        
        
    }
}