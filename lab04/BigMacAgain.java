//Emma Resnick
//Lab04


import java.util.Scanner;

public class BigMacAgain{
    public static void main (String [] arg){
        
       Scanner myScanner;
       
       myScanner= new Scanner (System.in);
       
       System.out.print("Please enter the number of Big Macs: ");
       
       int numberOfBigMacs;
       double price=2.22;
       double priceFries=2.15;
       double totalCostOfBigMacs;
       double totalCostWithFries;
       String answer;
       
       //if an int is entered
       if(myScanner.hasNextInt()){
           numberOfBigMacs=myScanner.nextInt();
           
           totalCostOfBigMacs=numberOfBigMacs*price;
           totalCostWithFries=totalCostOfBigMacs*priceFries;
           
           //if int is positive
           if(numberOfBigMacs>0){
             
               System.out.printf("The cost of "+ numberOfBigMacs+ " Big Macs is "+numberOfBigMacs+"* $"+price+"="+"%.2f", totalCostOfBigMacs);
               
            
               System.out.print("\n Would you like fries with that? Y/y/N/n: ");
               answer=myScanner.next();
               
               if(answer.equals("Y")){
                 System.out.printf("Your total is: $"+"%.2f"+ "+" + priceFries+ "=" +"%.2f"+". Thank you and have a good day!", totalCostOfBigMacs,totalCostWithFries);
               }
               
               else if(answer.equals("y")){
                 System.out.printf("Your total is: $"+"%.2f"+ "+" + priceFries+ "=" +"%.2f"+". Thank you and have a good day!", totalCostOfBigMacs,totalCostWithFries);
               }
               
               
              else if(answer.equals("N")){
                 System.out.printf("Your total is: $"+ "%.2f"+". Thank you and have a good day!", totalCostOfBigMacs); 
                  
               }
               
              else if(answer.equals("n")){
                 System.out.printf("Your total is: $"+ "%.2f"+". Thank you and have a good day!", totalCostOfBigMacs); 
                  
               }
               
              else{
                  System.out.println("You did not enter Y/y/N/n.");
                  return;
              }
           }
           //if int is not positive
           else{
               System.out.println("You did not enter an int>0.");
               return;
              
           } 
       }
       //if what is entered is not an int
       else{
          System.out.println("You did not enter an int.");
          return;
       }
        
   
    }
    
    
}