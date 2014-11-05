/* Emma Resnick
    CSE2
    11/1/14
*/

/* This program uses several methods to first take in a user's input, and make sure that it is a int between 1-9 inclusively.
After testing this, more methods are called to create a number stack pyramid, first by creating the lines with 
the correct numbers and spaces, then creating blocks from those lines.*/

import java.util.Scanner;
public class BlockedAgain {
    public static void main(String[] s) {
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt();
        allBlocks(m);
    }

    public static int getInt() {
        int userNum = 0, userNumInt = 0;
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.print("Please enter an int between 1-9: ");

        userNum = checkInt(scan);


        return userNumInt;
    }

    public static int checkInt(Scanner scan) {
        int num = 0, numCheck = 0;
        if (scan.hasNextInt()) {
            num = scan.nextInt();
            numCheck = checkRange(num);
        }

        else {
            System.out.print("You did not enter an int, try again. ");
            num = getInt();
        }

        return numCheck;

    }

    public static int checkRange(int checkNum) {

        if (1 <= checkNum && checkNum <= 9) {
            // this is where you call allBlocks
            return allBlocks(checkNum);
        }

        else {
            System.out.print("You did not enter an int in the range [1,9]. Try again. ");
            checkNum = getInt();
        }

        return checkNum;
    }

    public static int allBlocks(int x) {
        int b = block(x); //solves b


        return b;

    }

    public static int block(int x1) {

        int b1 = line(x1); //solves b1


        /* I understand that the blocking has to be done in this method, but I did not understand how to split up just the lines
        into one method and then the blocking into another*/


        return x1;

    }

    public static int line(int x2) {
        //solves b1a

        int count1 = 0;
        int count2 = 0;

        if (x2 >= 1 && x2 <= 9) {



            //what number is being printed
            for (int i = 0; i <= x2; i++) {


                //how many rows are being printed
                for (int row = 1; row <= i; row++) {

                    //centers number shown
                    for (int spaceLeft = 1; spaceLeft <= count1; spaceLeft++) {
                        System.out.print(" ");
                    }
                    //centers number shown
                    for (int spaceRight = 9; spaceRight >= count2; spaceRight--) {
                        System.out.print(" ");
                    }



                    //how many numbers in each row are being printed
                    for (int num = row - (2 * i) + 2; num <= row; num++) {
                        System.out.print(i);
                    }

                    System.out.println("");


                }


                if (i >= 1) {
                    
                     //centers dashes shown
                    for (int spaceLeft = 1; spaceLeft <= count1; spaceLeft++) {
                        System.out.print(" ");
                    }
                    //centers dashes shown
                    for (int spaceRight = 9; spaceRight >= count2; spaceRight--) {
                        System.out.print(" ");
                    }
                    
                    for (int d = i - (2 * i) + 2; d <= i; d++) {
                        System.out.print("-");
                    }
                }

               
                System.out.println("");


                //count for spaceLeft
                count1 = count1 - (x2 - i);
                //count for SpaceRight
                count2 = -(9 - i);
            }
        }

        return x2;
    }


}