/*Emma Resnick
  CSE2
  Lab05*/
  
  import java.util.Scanner;
  
  public class RandomGames{
      public static void main (String [] arg){
          Scanner myScanner;
          myScanner= new Scanner (System.in);
          
          System.out.print("Please enter R or r for Roulette, C or c for Craps, or P or p for Picking a random card from a deck: ");
          
          char game;
          char [] charArray= {'R','r','C','c','P','p'};
          
        
              game=myScanner.next().charAt(0);
              
              switch(game){
                  case 'R':
                      int number=(int)(Math.random()*38)+1;
                      System.out.println("Roulette"+ number);
              }
          
      }
      
  }