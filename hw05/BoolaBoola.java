/*Emma Resnick
  CSE2
  hw05 Program #2 
  
  This program takes three random variables and randomly pairs them with one of four 
  possible operator sets. The user is given the particular set and has to enter if the value of
  what is given to them is true or false.*/
  
  //import scanner and Random
 import java.util.Scanner;
 import java.util.Random;
 
 public class BoolaBoola{
     public static void main (String [] arg){
         Scanner myScanner;
         Random myRandom= new Random ();
         myScanner= new Scanner (System.in);
         
         //variables
         boolean variable1= myRandom.nextBoolean(); 
         boolean variable2= myRandom.nextBoolean();
         boolean variable3= myRandom.nextBoolean();
         
         //different outcomes of variables and operators
         boolean outcome1= variable1 && variable2 &&  variable3;
         boolean outcome2= variable1 && variable2 ||  variable3;
         boolean outcome3= variable1 || variable2 &&  variable3;
         boolean outcome4= variable1 || variable2 ||  variable3;
         
         //allows for a random case to be chosen
         Random randNumber= new Random();
         int randomDigit= randNumber.nextInt(4)+1;
         
       
         String question;
         String choice1=("Does " +variable1+" && "+variable2+" && "+variable3+ " have the value True (T or t) or False (F or f)? ");
         String choice2= ("Does " +variable1+" && "+variable2+" || "+variable3+ " have the value True (T or t) or False (F or f)? ");
         String choice3= ("Does " +variable1+" || "+variable2+" && "+variable3+ " have the value True (T or t) or False (F or f)? ");
         String choice4= ("Does " +variable1+" || "+variable2+" || "+variable3+ " have the value True (T or t) or False (F or f)? ");
         String [] questionChoices ={choice1,choice2,choice3,choice4};
        
        //enters arandom question out of the four above choices
         Random randQuestionChoice= new Random();
         question= questionChoices [randQuestionChoice.nextInt(questionChoices.length)];
         
         System.out.print(question);
         
         char answer= myScanner.next(".").charAt(0);
         
         
         switch(randomDigit){
             case 1:
                 
                 if((outcome1==true)&&(answer=='T')){
                     System.out.println("Correct");
                 }
                 
                 else if((outcome1==false)&&(answer=='F')){
                     System.out.println("Correct");
                 }
                 
                 else if(answer!='T'||answer!='t'||answer!='F'||answer!='f'){
                     System.out.println("You did not enter true or false.");
                 }
                 
                 else{
                     System.out.println("Wrong; Try Again");
                     return;
                 }
                 
                 break;
            
            case 2:
                
                 if((outcome2==true)&&(answer=='T')||(answer=='t')){
                     System.out.println("Correct");
                 }
                 else if((outcome2==false)&&(answer=='F')||(answer=='f')){
                     System.out.println("Correct");
                 }
                 else if(answer!='T'||answer!='t'||answer!='F'||answer!='f'){
                     System.out.println("You did not enter true or false.");
                 }
                 else{
                     System.out.println("Wrong; Try Again");
                     return;
                 }
                 break;
            
            case 3:
                
                 if((outcome3==true)&&(answer=='T')||(answer=='t')){
                     System.out.println("Correct");
                 }
                 else if((outcome3==false)&&(answer=='F')||(answer=='f')){
                     System.out.println("Correct");
                 }
                 else if(answer!='T'||answer!='t'||answer!='F'||answer!='f'){
                     System.out.println("You did not enter true or false.");
                 }
                 else{
                     System.out.println("Wrong; Try Again");
                     return;
                 }
                 break;
            
            case 4:
                
                 if((outcome4==true)&&(answer=='T')||(answer=='t')){
                     System.out.println("Correct");
                 }
                 else if((outcome4==false)&&(answer=='F')||(answer=='f')){
                     System.out.println("Correct");
                 }
                 else if(answer!='T'||answer!='t'||answer!='F'||answer!='f'){
                     System.out.println("You did not enter true or false.");
                 }
                 else{
                     System.out.println("Wrong; Try Again");
                     return;
                 }
                 break;
                 
            default:
                System.out.println("You did not enter true or false");
                break;
         }
         
         
         
        
     }  
 }