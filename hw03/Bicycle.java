/*Emma Resnick
CSE2
14 September 2014
hw03
*/

/*This program allows users to enter number of counts and number of seconds in which
the counts occur. It will also print the total distance and the average speed
*/

//import scanner
import java.util.Scanner;

public class Bicycle {
   public static void main(String [] arg){
       Scanner myScanner;
       
       myScanner= new Scanner (System.in);
       
       System.out.print("Enter the number of seconds: ");
       
       int nSeconds=myScanner.nextInt();
       
       System.out.print("Enter the number of counts on the Cyclometer: ");
       
       int nCounts=myScanner.nextInt();
       
       double wheelDiameter= 27.0,
       PI= 3.14159,
       feetPerMile=5280,
       inchesPerFoot=12,
       secondsPerMinute=60;
       
       double distance = nCounts*wheelDiameter*PI/(inchesPerFoot*feetPerMile);
       double averageMPH= distance/((nSeconds/secondsPerMinute)/60);
       
       System.out.printf("The distance was "+ "%.2f"+ " and took "+ nSeconds/secondsPerMinute + " minutes. \n", distance);
       System.out.printf("The average mph was " +"%.2f", averageMPH);
   } 
    
    
    
    
}