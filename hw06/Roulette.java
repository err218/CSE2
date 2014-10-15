/*Emma Resnick
  CSE2
  hw06 Program #1 */
  
  import java.util.Scanner;
  
  public class Roulette{
      public static void main (String [] arg){
          Scanner myScanner;
          myScanner= new Scanner (System.in);
          
          
          
          //variables
          int myNumber= (int)(Math.random()*38)+1;
          int winnings=0;
          int counterSpin=0;
          int counterRep=0;
          int stopCounterSpin=100;
          int stopCounterRep=1000;
          int totalWinnings=0;
          int roundsWithProfit=0;
          int roundsWithLoss=0;
          
              //while the number of spins in one repetition is less than 100
              while(counterSpin<stopCounterSpin){
                  
                //random end number to be compared with the random number you're betting on
                  int endNumber=(int)(Math.random()*38)+1;
                  
                  //if end number and my number are the same, you win that round
                  if(myNumber==endNumber){
                      winnings+=36;
                      
                  } 
            
                  //add one to the counter up to (not including) 100
                  counterSpin++;
    
                  //once counter gets to the last spin (while still being within 1000 repetitions)
                  if (counterSpin==99 && counterRep<stopCounterRep){
                    //reset info for next repetition of 100 spins
                    myNumber=(int)(Math.random()*38)+1; 
                    counterRep++;
                    counterSpin=0;
                    totalWinnings+=winnings;
                    
                    //indicate profit
                    if(winnings>=108){
                        roundsWithProfit++;
                      }
                    //indicated loss
                    else if (winnings==0){
                      roundsWithLoss++;
                    }
                    //reset winnings
                     winnings=0;
                     
                  
                    
                
                }  
                
                
                
                 
              }
              
          
        //   Prints out total winnings from 100,000 spins, how many repetitions had losses and profits
        
         System.out.println("Total winnings: $"+totalWinnings);
         System.out.println("There were "+roundsWithLoss+" repetitions of 100 spins that resulted in a complete loss.");
         System.out.println("There were "+roundsWithProfit+" repetitions of 100 spins that resulted in a profit.");
        
         
      }
  }