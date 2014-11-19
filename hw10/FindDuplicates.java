/*Emma Resnick
  CSE2
  HW10
  Program #1
  
  This program takes 10 user-inputed ints and decides if any of the ints were duplicated, 
  and if there is only one pair of duplicates in the set of ints.
  This continues over and over again until the user does not enter Y or y, quitting the program.

*/




import java.util.Scanner;
public class FindDuplicates {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int num[] = new int[10];
        String answer = "";
        do {
            System.out.print("Enter 10 ints- ");
            for (int j = 0; j < 10; j++) {
                num[j] = scan.nextInt();
            }
            String out = "The array ";
            out += listArray(num); //return a string of the form "{2, 3, -9}"   
            if (hasDups(num)) {
                out += "has ";
            }
            else {
                out += "does not have ";
            }
            out += "duplicates.";
            System.out.println(out);
            out = "The array ";
            out += listArray(num);
            if (exactlyOneDup(num)) {
                out += "has ";
            }
            else {
                out += "does not have ";
            }
            out += "exactly one duplicate.";
            System.out.println(out);
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer = scan.next();
        } while (answer.equals("Y") || answer.equals("y"));
    }

    public static String listArray(int num[]) {
        String out = "{";
        for (int j = 0; j < num.length; j++) {
            if (j > 0) {
                out += ", ";
            }
            out += num[j];
        }
        out += "} ";
        return out;
    }

    public static boolean hasDups(int[] x) {

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                //if i !=j and the spots in array x equal each other, there is a duplicate
                if (x[i] == x[j] & i != j) {
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean exactlyOneDup(int[] x) {
        int counter = -1;
        int i=0;

        for ( i = 0; i < x.length; i++) {

            for (int j = 0; j < x.length; j++) {
                if (x[i] == x[j] & i != j) {
                    //counter is used to see how many times a pair shows up
                    counter++;
                }
                
                else{
                    counter=counter;
                }
                
                
            }

           

        }
        
        //exactly one pair
          if (i == x.length & counter == 1) {
                return true;
            }

        //no pairs
            else if (i == x.length & (counter == -1)) {
                return false;
            }

        // more than one pair
           else if (i == x.length & (counter >=2)) {
                return false;
            }
            
        return true;
    }

}
