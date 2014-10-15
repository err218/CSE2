/*Emma Resnick
  CSE2
  hw06 Program #2 */
  
  import java.util.Scanner;
  
  public class Root{
      public static void main (String [] arg){
          Scanner myScanner;
          myScanner= new Scanner (System.in);
          
          System.out.print("Enter a double greater than zero that you would like to find the square root of: ");
          //variables
          double myNumber=0.00;
          double lowerInterval=0.00;
          double middleInterval=0.00;
          double upperInterval=0;
          
          
          if (myScanner.hasNextDouble()){
              myNumber=myScanner.nextDouble();
              upperInterval=myNumber+ 1.00;
              middleInterval=(upperInterval+lowerInterval)/2.00;
              
              
              if(myNumber>0.00){
                 
                 //tolerance is .0000001
                    while(upperInterval-lowerInterval>(0.0000001*upperInterval)){
                    middleInterval=(upperInterval+lowerInterval)/2.00;
                    
                      if(lowerInterval*lowerInterval<myNumber&&upperInterval*upperInterval>myNumber){
                          
                          //if middle squared is less than my number, than middle becomes the lower limit
                          if(middleInterval*middleInterval<myNumber){
                             lowerInterval=middleInterval; 
                          }
                          
                          //if middle squared is more than my number, than middle becomes the upper limit
                          if(middleInterval*middleInterval>myNumber){
                             upperInterval=middleInterval; 
                          }
                          
                         
                     }
                   
                    
                }
                
                
               
              }
              //if a double less than 0 is entered
              else{
                  System.out.println("You did not enter a double greater than zero.");
                  return;
              }
          }
              
             //if a double isn't entered
              else{
              System.out.println("You did not enter a double.");
              return;
              }
              
              //prints out square root
              System.out.println("The square root of your double is: "+middleInterval);  
           
          }
          
      }
  