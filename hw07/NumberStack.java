/* Emma Resnick
   CSE2
   hw07 */


import java.util.Scanner;

public class NumberStack {
    public static void main(String[] arg) {
        Scanner scan;
        scan = new Scanner(System.in);

        //prompts user to enter digit between 1 and 9
        System.out.print("Enter a digit between 1 and 9: ");

        //define variables
        int digit = scan.nextInt();
        int count = 0;
        int count1 = 0;
        int count2 = 0;

        System.out.println("Using a For Loop");

        //says which number is shown
        for (int numberShown = 0; numberShown <= digit; numberShown++) {

            //places number shown
            for (int column = 1; column <= numberShown; column++) {


                System.out.println("");
                //centers number shown
                for (int spaceLeft = 1; spaceLeft <= count1; spaceLeft++) {
                    System.out.print(" ");
                }
                //centers number shown
                for (int spaceRight = 9; spaceRight >= count2; spaceRight--) {
                    System.out.print(" ");
                }
                for (int line = 1; line < count; line++) {
                    System.out.print(numberShown);
                }

                System.out.println("");


            }
            //centers dashes
            for (int spaceLeft = 1; spaceLeft <= count1; spaceLeft++) {
                System.out.print(" ");
            }
            //centers dashes
            for (int spaceRight = 9; spaceRight >= count2; spaceRight--) {
                System.out.print(" ");
            }

            //count for adding more numbers/ dashes per designated row
            count = count + 2;
            //count for spaceLeft
            count1 = count1 - (digit - numberShown);
            //count for SpaceRight
            count2 = -(9 - numberShown);

            //prints dashes
            for (int d = 4; d <= count; d++) {
                System.out.print("-");
            }

        }

        count = 0;
        count1 = 0;
        count2 = 0;
        int numberShown = 0;
        int column = 0;
        int spaceLeft;
        int spaceRight;
        int line = 0;
        int d = 0;

        System.out.println("");
        System.out.println("");
        System.out.println("Using a While Loop");



        //says which number is shown
        while (numberShown <= digit) {
            column = 1;
            //places number shown
            while (column <= numberShown) {
                line = 1;


                System.out.println("");
                spaceLeft = 1;
                spaceRight = 9;
                //centers number shown
                while (spaceLeft <= count1) {
                    System.out.print(" ");
                    spaceLeft++;
                }
                //centers number shown
                while (spaceRight >= count2) {
                    System.out.print(" ");
                    spaceRight--;
                }
                while (line < count) {
                    System.out.print(numberShown);
                    line++;
                }

                System.out.println("");

                column++;
            }

            spaceLeft = 1;
            spaceRight = 9;

            //centers dashes
            while (spaceLeft <= count1) {
                System.out.print(" ");
                spaceLeft++;
            }
            //centers dashes
            while (spaceRight >= count2) {
                System.out.print(" ");
                spaceRight--;
            }

            //count for adding more numbers/ dashes per designated row
            count = count + 2;

            //count for spaceLeft
            count1 = count1 - (digit - numberShown);
            //count for SpaceRight
            count2 = -(9 - numberShown);

            d = 4;
            //prints dashes
            while (d <= count) {
                System.out.print("-");
                d++;
            }

            numberShown++;
        }


        count = 0;
        count1 = 0;
        count2 = 0;
        numberShown = 0;
        column = 0;
        spaceLeft = 0;
        spaceRight = 0;
        line = 0;
        d = 0;

        System.out.println("");
        System.out.println("");
        System.out.println("Using a Do While Loop");


            //says which number is shown
            do {
                column = 1;
                //places number shown
                do {
                    line = 1;


                    System.out.println("");
                    spaceLeft = 1;
                    spaceRight = 9;
                    //centers number shown
                    do {
                        System.out.print(" ");
                        spaceLeft++;
                    } while (spaceLeft <= count1);
                    //centers number shown
                    do {
                        System.out.print(" ");
                        spaceRight--;
                    } while (spaceRight >= count2);
                    do {
                        System.out.print(numberShown);
                        line++;
                    } while (line < count);

                    System.out.println("");

                    column++;
                } while (column <= numberShown);

                spaceLeft = 1;
                spaceRight = 9;
                //centers dashes

                do {
                    System.out.print(" ");
                    spaceLeft++;
                } while (spaceLeft <= count1);

                //centers dashes
                do {
                    System.out.print(" ");
                    spaceRight--;
                } while (spaceRight >= count2);

                //count for adding more numbers/ dashes per designated row
                count = count + 2;
                //count for spaceLeft
                count1 = count1 - (digit - numberShown);
                //count for SpaceRight
                count2 = -(9 - numberShown);

                d = 4;
                //prints dashes
                do {
                    System.out.print("-");
                    d++;
                } while (d <= count);

                numberShown++;
            } while (numberShown <= digit);

    }
}