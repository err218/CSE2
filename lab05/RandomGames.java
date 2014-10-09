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
          int number=(int)(Math.random()*38)+1;
        
              //game=myScanner.next().charAt(0);
              
              switch(game=myScanner.next().charAt(0)){
                  case 'R':
                      
                      switch(number){
                        case 38:
                          System.out.println("Your number is: "+ 00);
                          break;
                        default:
                          System.out.println("Your number is: "+ number);
                          break;
                      }
                      break;
                  case 'r':
                      
                      switch(number){
                        case 38:
                          System.out.println("Your number is: "+ 00);
                          break;
                        default:
                          System.out.println("Your number is: "+ number);
                          break;
                      }
                      break;
                  case 'C':
                      System.out.println("Craps has not been implemented yet.");
                      break;
                  case 'c':
                      System.out.println("Craps has not been implemented yet.");
                      break;
                  case 'P':
                      System.out.println("Pick a card has not been implemented yet.");
                      break;
                  case 'p':
                      System.out.println("Pick a card has not been implemented yet.");
                      break;
              }
                      
          
      }
      
  }