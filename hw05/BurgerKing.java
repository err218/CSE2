/* Emma Resnick
CSE2
hw05- Program #1 */

import java.util.Scanner;

public class BurgerKing{
    public static void main (String []arg){
        Scanner myScanner;
        myScanner= new Scanner (System.in);
        
        //original choices of foods/drinks
        System.out.print("Enter a letter to indicate a choice of:"+ "\n Burger (B or b)" + "\n Soda (S or s)" + " \n Fries (F or f): ");
        char choice;
        char [] charArray1 = {'B','b','S','s','F','f'};
       
        
        //toppings for burgers
        char topping;
        char [] charArray2= {'A','a','C','c','N','n'};
        
        //Soda Choices
        char sodaChoice;
        char [] charArray3= {'P','p','C','c','S','s','M','m'};
        
        //Fry Size
        char frySize;
        char [] charArray4= {'L','l','S','s'};
        
        switch (choice= myScanner.next(".").charAt(0)) {
            //burger
            case 'B': 
                System.out.print("What would you like on your burger?"+ "\n Enter A or a for all the fixins"
                +"\n Enter C or c for cheese"+ "\n Enter N or n for none of the above: ");
             
                
                //toppings
                switch (topping= myScanner.next(".").charAt(0)){
                    case 'A':
                       System.out.println("You ordered a burger with all the fixins! Yum!");
                       break;
                    case 'a':
                       System.out.println("You ordered a burger with all the fixins! Yum!");
                       break;
                    case 'C':
                        System.out.println("You ordered a burger with cheese! Delicious!");
                        break;
                    case 'c':
                        System.out.println("You ordered a burger with cheese! Delicious!");
                        break;
                    case 'N':
                        System.out.println("You ordered a plain burger! Tasty!");
                        break;
                     case 'n':
                        System.out.println("You ordered a plain burger! Tasty!");
                        break;
                    default:
                        System.out.println("You did not enter a proper topping");
                        break;
                }
            break;
            //burger
            case 'b': 
                System.out.print("What would you like on your burger?"+ "\n Enter A or a for all the fixins"
                +"\n Enter C or c for cheese"+ "\n Enter N or n for none of the above: ");
              
                
                //toppings
                switch (topping= myScanner.next(".").charAt(0)){
                    
                    case 'A':
                       System.out.println("You ordered a burger with all the fixins! Yum!");
                       break;
                    case 'a':
                       System.out.println("You ordered a burger with all the fixins! Yum!");
                       break;
                    case 'C':
                        System.out.println("You ordered a burger with cheese! Delicious!");
                        break;
                    case 'c':
                        System.out.println("You ordered a burger with cheese! Delicious!");
                        break;
                    case 'N':
                        System.out.println("You ordered a plain burger! Tasty!");
                        break;
                     case 'n':
                        System.out.println("You ordered a plain burger! Tasty!");
                        break;
                    default:
                        System.out.println("You did not enter a proper topping");
                        break;
                }
            break;
            //soda
            case 'S':
                System.out.print("Would you like Pepsi (P or p)"+"\n Coke (C or c)"
                + "\n Sprite (S or s)"+ "\n or Mountain Dew (M or m): ");
                
                
                //soda choice
                switch (sodaChoice= myScanner.next(".").charAt(0)){
                    case 'P': 
                        System.out.println("You order a Pepsi! Fantastic!");
                        break;
                     case 'p': 
                        System.out.println("You order a Pepsi! Fantastic!");
                        break;
                     case 'C': 
                        System.out.println("You order a Coke! Wonderful!");
                        break;
                     case 'c': 
                        System.out.println("You order a Coke! Wonderful!");
                        break;
                     case 'S': 
                        System.out.println("You order a Sprite! Woohoo!");
                        break;
                    case 's': 
                        System.out.println("You order a Sprite! Woohoo!");
                        break;
                    case 'M': 
                        System.out.println("You order a Mountain Dew! Good Job!");
                        break;
                    case 'm': 
                        System.out.println("You order a Mountain Dew! Good Job!");
                        break;
                    default:
                        System.out.println("You did not enter a proper soda");
                        break;
                }
                break;
                //soda
                 case 's':
                System.out.print("Would you like Pepsi (P or p)"+"\n Coke (C or c)"
                + "\n Sprite (S or s)"+ "\n or Mountain Dew (M or m): ");
                
                
                //soda choice
                switch (sodaChoice= myScanner.next(".").charAt(0)){
                    case 'P': 
                        System.out.println("You order a Pepsi! Fantastic!");
                        break;
                     case 'p': 
                        System.out.println("You order a Pepsi! Fantastic!");
                        break;
                     case 'C': 
                        System.out.println("You order a Coke! Wonderful!");
                        break;
                     case 'c': 
                        System.out.println("You order a Coke! Wonderful!");
                        break;
                     case 'S': 
                        System.out.println("You order a Sprite! Woohoo!");
                        break;
                    case 's': 
                        System.out.println("You order a Sprite! Woohoo!");
                        break;
                    case 'M': 
                        System.out.println("You order a Mountain Dew! Good Job!");
                        break;
                    case 'm': 
                        System.out.println("You order a Mountain Dew! Good Job!");
                        break;
                    default:
                        System.out.println("You did not enter a proper soda");
                        break;
                }
                break;
                //fries
                case 'F':
                    System.out.print("What size Fries would you like? Enter L or l for Large, or S or s for Small: ");
                    
                  
                    //fry size
                    switch(frySize= myScanner.next(".").charAt(0)){
                        case 'L':
                            System.out.println("You ordered large fries! Good choice!");
                            break;
                        case 'l':
                            System.out.println("You ordered large fries! Good choice!");
                            break;
                        case 'S':
                            System.out.println("You ordered small fries! Very Smart!");
                            break;
                        case 's':
                            System.out.println("You ordered small fries! Very Smart!");
                            break;
                        default:
                        System.out.println("You did not enter a proper fry size");
                        break;
                        
                    }
                    break;
                    //fries
                    case 'f':
                    System.out.print("What size Fries would you like? Enter L or l for Large, or S or s for Small: ");
                    
                   
                    //fry size
                    switch(frySize= myScanner.next(".").charAt(0)){
                        case 'L':
                            System.out.println("You ordered large fries! Good choice!");
                            break;
                        case 'l':
                            System.out.println("You ordered large fries! Good choice!");
                            break;
                        case 'S':
                            System.out.println("You ordered small fries! Very Smart!");
                            break;
                        case 's':
                            System.out.println("You ordered small fries! Very Smart!");
                            break;
                        default:
                        System.out.println("You did not enter a proper fry size");
                        break;
                        
                    }
                    break;
                    //if a different letter is entered
                    default:
                        System.out.println("You did not enter a proper choice.");
                        break;
        }
    }
}