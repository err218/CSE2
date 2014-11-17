/* Emma Resnick lab07 */



import java.util.Scanner;

public class LoopTheLoop {
    public static void main(String[] arg) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);

        int nStars = 10;
        int nStarsStart = 0;
        int i = 0;
        while (nStarsStart >= 0 && nStarsStart < nStars) {
            while (i < nStarsStart + 1) {
                System.out.print("*");
                i++;
            }
            nStarsStart++;

        }

        System.out.println("");
        for (int k = 0; k < nStars; k++) {
            for (int j = 0; j <= k; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        

       
        System.out.print("Please enter an int between 1 and 15: ");
         int input = myScanner.nextInt();
        if (input <= 15 && input >= 1) {
            while (nStarsStart >= 0 && nStarsStart < input) {
                while (i < nStarsStart + 1) {
                    System.out.print("*");
                    i++;
                }
                nStarsStart++;

            }

            System.out.println("");
            for (int k = 0; k < input; k++) {
                for (int j = 0; j <= k; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }


        }
    }
}
