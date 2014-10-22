/* Emma Resnick lab07 */



import java.util.Scanner;

public class LoopTheLoop{
    public static void main(String [] arg){
        Scanner myScanner;
        myScanner= new Scanner (System.in);
        
        int nStars=10;
        int nStarsStart=0;
        int i=0;
        while(nStarsStart>=0&&nStarsStart<nStars){
            while(i<nStarsStart+ 1){
              System.out.print("*");  
              i++;
            }
            System.out.println();
            nStarsStart++;
            
        }
    }
}

// for (int j = 0; j < n && j < 40; j++) {
//             for (int k = 0; k < j + 1; k++) {
//                 System.out.print('*');
//             }
//             System.out.println();
//         }