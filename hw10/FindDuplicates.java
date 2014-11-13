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
            // if (exactlyOneDup(num)) {
            //     out += "has ";
            // }
            // else {
            //     out += "does not have ";
            // }
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
    
    public static boolean hasDups(int x[]){
        int[] array;
        array = new int[x.length];
        
        for (int i=0; i<array.length; i++){
            for (int j=0; j<i; j++){
                if(array[i]==array[j]&&j!=0&&i!=0){
                    return true;
                }
                
                else {
                    return false;
                }
            }
        }
       return true | false;
    }
}

// Sample Output:

// Enter 10 ints- 1 23 1 3 4 5 6 7 8 9 
// The array {1, 23, 1, 3, 4, 5, 6, 7, 8, 9} has duplicates.
// The array {1, 23, 1, 3, 4, 5, 6, 7, 8, 9} has exactly one duplicate.
// Go again? Enter 'y' or 'Y', anything else to quit- y
// Enter 10 ints- 1 2 3 4 5 6 7 8 9 0
// The array {1, 2, 3, 4, 5, 6, 7, 8, 9, 0} does not have duplicates.
// The array {1, 2, 3, 4, 5, 6, 7, 8, 9, 0} does not have exactly one duplicate.
// Go again? Enter 'y' or 'Y', anything else to quit- y
// Enter 10 ints- 1 2 1 2 3 4 5 8 9 7
// The array {1, 2, 1, 2, 3, 4, 5, 8, 9, 7} has duplicates.
// The array {1, 2, 1, 2, 3, 4, 5, 8, 9, 7} does not have exactly one duplicate.
// Go again? Enter 'y' or 'Y', anything else to quit- n
