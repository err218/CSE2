/* Emma Resnick
    CSE2
    hw04- Program #3 */
   
   //import scanner
    import java.util.Scanner;
    
    //class
    public class CourseNumber{
        
        //main method
        public static void main (String []arg){
            //declare scanner
            Scanner myScanner;
            
            myScanner=new Scanner (System.in);
            
            //define each semester type
            int spring = 10;
            int summer1=20;
            int summer2=30;
            int fall=40;
            int season=spring|summer1|summer2|fall;
           
          
            
            
            System.out.print("Enter a six digit number giving the Course Semester: ");
            
            if(myScanner.hasNextInt()){
             
                int semester=myScanner.nextInt();
                int year=((semester-season)/100)+1;
                
                
                    
                    //If the six digit number ends in 10
                    if(semester==(year*100)+spring){
                        
                        System.out.println("The course was offered in the Spring semester of "+year);
                        
                    }
                    
                    //If the six digit number ends in 20
                    else if(semester==(year*100)+summer1){
                        
                        System.out.println("The course was offered in the Summer 1 semester of "+year);
                        
                    }
                    
                    //If the six digit number ends in 30
                    else if(semester==(year*100)+summer2){
                        
                        System.out.println("The course was offered in the Summer 2 semester of "+year);
                      
                    }
                    
                    //If the six digit number ends in 40
                    else if(semester==(year*100)+fall){
                        
                        System.out.println("The course was offered in the Fall semester of "+year);
                        
                    }
                    
                    //if a proper semester is not entered
                    else if (semester!= ((year*100)+season)){
                        System.out.println(semester-(year*100)+ " is not a legitimate semester.");
                    }
    
                    //if a semester is entered from too far into the past/future
                   if(semester<186510||semester>201440){
                        System.out.println("You did not enter a semester in the range [186510,201440].");
                    }
                    
                    
                    
                
            }
            
            
            
            //if what is entered is not an int.    
            else{
                System.out.println("You did not enter a proper semester. Please enter a six digit integer.");
                return;
            }
        }
    }
            
            