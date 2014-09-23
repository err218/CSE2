/* Emma Resnick
    CSE2
    hw04- Program #2 */
   
   //import scanner
    import java.util.Scanner;
    
    //class
    public class Month{
        
        //main method
        public static void main (String []arg){
            //declare scanner
            Scanner myScanner;
            
            myScanner=new Scanner (System.in);
            
            System.out.print("Enter an int giving the number of the month (1-12): ");
            
            int month;
            //for February
            int year;
            int numberOfDays1=30;
            int numberOfDays2=31;
            int numberOfDays3=28;
            int leapYearDays=29;
            
            if(myScanner.hasNextInt()){
               
                month=myScanner.nextInt();
              
                if (month<1){
                    System.out.println("You did not enter an int from 1-12.");
                }
                
                //April,June,September,November
                if (month==4||month==6||month==9||month==11){
                    System.out.println("The month has "+ numberOfDays1+" days.");
                }
                
                //January,March,May,July,October,December
                if (month==1||month==3||month==5||month==7||month==10||month==12){
                    System.out.println("The month has "+ numberOfDays2+" days.");
                }
                
                //February
                if(month== 2){
                   System.out.print("Enter a year: ");
                   
                   if(myScanner.hasNextInt()){
                       year=myScanner.nextInt();
                       
                       //equation for Leap Year
                       if((year % 4==0 && (year % 100 != 0)) || (year %400 ==0)){
                        System.out.println("The month has "+ leapYearDays+" days.");
                       }
                       
                       //not a leap year
                       else{
                        System.out.println("The month has "+ numberOfDays3+" days.");
                        return;
                       }
                       
                   }
                   //if a year is not entered
                   else{
                       System.out.println("You did not type in a proper year.");
                       return;
                   }
                   
                
                    
                }
                
                //if int is greater than 12
                if(month>12){
                    System.out.println("You did not enter an int from 1-12.");
                }
                
                
            }
            //if anything other than an integer is entered
            else{
                System.out.println("You did not enter an int.");
                return;
            
            }
        }
    }