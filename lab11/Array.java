import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] arg) {
        Scanner scan;
        scan = new Scanner(System.in);

        final int numOfDigits = 10;
        int[] digits;
        digits = new int[numOfDigits];
        //int index = 0;
        int min = digits[0];
        int max = digits[0];
        int sum = 0;
       

        System.out.print("Enter 10 ints: ");


        for (int j = 0; j < digits.length; j++) {
            digits[j] = scan.nextInt();



            if (digits[j] > max) {
                max = digits[j];
            }

            if (digits[j] < min) {
                min = digits[j];

            }


            sum = sum + digits[j];



        }



        System.out.println("The lowest entry is: " + min);
        System.out.println("The highest entry is: " + max);
        System.out.println("The sum is: " + sum);


        for (int k = 0; k < digits.length; k++) {
            for (int l = 0; l < k; l++) {
                if ((digits[k] < digits[l]) && (k != l)) {
                    int temp = digits[l];
                    digits[l] = digits[k];
                    digits[k] = temp;
                }
                else
                    continue;
            }

        }
         System.out.println(Arrays.toString(digits));
    
    
    for (int m = 9; m>1-digits.length; m--) {
            for (int n = 0; n < m; n++) {
                if ((digits[m] > digits[n]) && (m != n)) {
                    int temp = digits[n];
                    digits[n] = digits[m];
                    digits[m] = temp;
                }
                else
                    continue;
            }

        }
         System.out.println(Arrays.toString(digits));
    }
    
    
    
    
    
    }