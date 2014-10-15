/* Emma Resnick lab07 */



import java.util.Scanner;

public class LoopTheLoop{
    public static void main(String [] arg){
        Scanner myScanner;
        myScanner= new Scanner (System.in);
        
        int nStars=10;
        int nStarsStart=0;
        String star="*";
        while(nStarsStart<nStars){
            System.out.println(star);
            nStarsStart++;
            star++;
            // while(nStarsStart==3){
            //     System.out.println(star+star+star);
            // }
        }
    }
}