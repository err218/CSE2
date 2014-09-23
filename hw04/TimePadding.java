/* Emma Resnick
    CSE2
    hw04- Program #4 */
   
   //import scanner
    import java.util.Scanner;
    
    //class
    public class TimePadding{
        
        //main method
        public static void main (String []arg){
            //declare scanner
            Scanner myScanner;
            
            myScanner=new Scanner (System.in);
            
            System.out.print("Enter an int representing the number of seconds: ");
            
            int seconds;
        
            // integer is entered
            if(myScanner.hasNextInt()){
               
                seconds=myScanner.nextInt();
                
                // seconds divided by 3600 equals hours place
                int hours= seconds / 3600;
                
                //The remainder of (seconds divided by 3600)
                int secondsRemainder3600= seconds % 3600;
                
                //remainder divided by 60 equals minutes place
                int minutes = (secondsRemainder3600) /60;
                
                //The remainder of (secondsRemainder3600/60) equals what goes in the seconds place
                int secondsPlace=(secondsRemainder3600) % 60;
                
                //positive integer is entered
                if(seconds>0){
                    
                    //%02d signifies how many leading zeros there can be in front of the digits 
                    System.out.printf("The time is "+"%02d"+":"+"%02d"+":"+"%02d"+".", hours, minutes,secondsPlace);
                }
                
                // what was entered was not a positive integer
                else{
                    System.out.println("You did not enter a positive integer.");
                }
            }
            
            //what was entered was not an integer
            else{
                System.out.println("You did not enter an integer.");
                return;
            }
        }
    }
                
                
            