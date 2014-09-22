/*Emma Resnick
CSE2
Hw04-Program 1 */

//import scanner
import java.util.Scanner;

//define class
public class IncomeTax{
    //main method 
    public static void main(String []arg){
        //declare scanner
        Scanner myScanner;
        
        myScanner= new Scanner (System.in);
    
        //create variables for each tax rate and declare income
        int income;
        double taxPercent1=4.0;
        double taxPercent2=7.0;
        double taxPercent3=12.0;
        double taxPercent4=14.0;
        
        
        
        System.out.print("Enter an int giving the number of thousands: ");
        
       //continue if an int has been entered
        if(myScanner.hasNextInt()){
           
            income=myScanner.nextInt();
            
            //value of income in thousands
            int incomeThousands=income*10000;
            
            //amount of money each income has to pay for tax
            double tax1= incomeThousands*(taxPercent1/100);
            double tax2= incomeThousands*(taxPercent2/100);
            double tax3= incomeThousands*(taxPercent3/100);
            double tax4= incomeThousands*(taxPercent4/100);
            
            //end program if int is less than 0
            if(income<0){
                System.out.println("You did not enter an int greater than or equal to 0.");
                return;
            }
            
            //income less than 20,000
            if(income<20){
    
                System.out.println("The tax rate on $"+incomeThousands+" is: "+taxPercent1+ "%. The tax is: $"+tax1);
            }
            
            //income greater or equal to 20,000 and less than 40,000
            if(20<=income && income<40){
                System.out.println("The tax rate on $"+incomeThousands+" is: "+taxPercent2+ "%. The tax is: $"+tax2);
                
                
            }
            
            //income greater or equal to 40,000 and less than 78,000
            if(40<=income && income<78){
                System.out.println("The tax rate on $"+incomeThousands+" is: "+taxPercent3+ "%. The tax is: $"+tax3); 
                 
            }
            
            //income greater or equal to 78,000
            if(income>=78){
                System.out.println("The tax rate on $"+incomeThousands+" is: "+taxPercent4+ "%. The tax is: $"+(Math.floor(tax4*100)/100));
            }
        }
        
        //end program if int is not entered
        else{
            System.out.println("You did not enter an int.");
            return;
            
        }
    }
    
}