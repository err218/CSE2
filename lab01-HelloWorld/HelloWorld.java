//Emma Resnick
//CSE2
//Lab01
//Hello World Java Program

// first compile the program
//  javac HelloWorld.java
//run the program
// java HelloWorld//

// define a class
import java.util.Scanner;
public class HelloWorld {

    //add main method
    public static void main(String[] args) {

        // print the statement with box around it
        // System.out.println("########################");
        // System.out.println("########################");
        // System.out.println("#                      #");
        // System.out.println("#  Hello World 2014!!  #");
        // System.out.println("#                      #");
        // System.out.println("########################");
        // System.out.println("########################");
        // System.out.println("test");

        //test/testtest


        //1
        //         int i = 0;
        // int j = 1;
        // //number of times 123test happens
        // for(i = 1; i<4; i++){

        //     //lets it go to the next number
        // for(j = 1; j<3; j++){
        //     //gets numbers to go up by 1
        // 	for (int k = 0; k<j; k++) {
        // 		System.out.println( (int)(k + j) );
        // 	}
        // }
        // // goes up by 1, then goes up by 1 again, so it's 3. Only goes twice
        // i++;
        // 	System.out.println( "test" );
        // }



        // 6666
        // 666
        // 66
        // 6
        // 555
        // 55
        // 5
        // 44
        // 4
        // 3
        // 2
        // 1


        //2*
        // //goes from 6 to 1
        // for (int i = 6; i >= 0; i--) {

        //     //how many rows
        //     for (int j =-2; j < i-2; j++) {
        //         //how many of each number is in each row
        //         for( int k=i-3; k>=j; k--){

        //         System.out.print(i);
        //       }

        //         System.out.println("");
        //     }
        // }





        // for(int x=3; x<=3; x++) {

        // 	for(int y=3; y>=0; y--){
        // 		System.out.println( "[" + y + "]" );

        // 	}
        // }



        // [START]
        // [31]
        // [26]
        // [21]
        // [16]
        // [11]
        // [6]
        // [END]

        // for( int i=31; i>=6; i-=5){

        //     if(i==31){
        //       System.out.println("[Start]");  

        //     }

        //     System.out.println("["+i+ "]");

        //     if(i==6){
        //         System.out.println("[END]");

        //     }
        // }

        // b
        // bb
        // b
        // bb
        // bbb
        // b
        // bb
        // bbb
        // bbbb

        //between second pattern and fourth pattern
        // makes pyramid go multiple times
        // for (int l=1; l<4; l++){

        //     for(int i=0; i<l+1;i++){
        //         for(int j=0; j<i+1; j++){
        //         System.out.print("b");
        //         }
        //         System.out.println("");
        //     }


        // }


        // 0
        // 11
        // 222
        // 3333
        // 44444
        // 55555
        // 6666
        // 777
        // 88
        // 9


        //     for (int i = 0; i <= 4; i++) {
        //         for (int j = -1; j < i; j++) {
        //             System.out.print(i);
        //         }
        //         System.out.println("");
        //     }

        //     for (int i = 5; i <= 9; i++) {
        //         for (int j = 10; j > i; j--) {
        //             System.out.print(i);
        //         }
        //         System.out.println("");
        //     }


        // }




        // for(int x=7; x<12; x+=2) {

        //     System.out.println(x);
        // } 

        // int end =6;

        // for(int i=1; i<=end; i++){


        //     for(int j=0; j<i; j++){

        //         System.out.print(i);

        //     }
        //     System.out.println( );
        // }


        //  int start=0;

        // int eq=0;

        // for(int i=1; i<=4; i++){
        //     int equation = start+ (int)Math.pow(i,i);

        //     eq=eq+equation;
        // }

        //   System.out.print(eq);
        // }


           Scanner scan = new Scanner(System.in);
      int OddCount = 0;
      int EvenCount = 0;
      String s = null;
      System.out.println("Enter a list of integers.");
       if(!s.equals("\\n") ){
      do{
         int n = scan.nextInt();
         if (n%2 == 0){
            EvenCount++;
            }
         else{
            OddCount++;
            }
         s = scan.next();
        
      } while(true);
       }
       
       else{
           break;
       }
     
      
      System.out.println("Even Count: " + EvenCount);
      System.out.println("Odd Count: " + OddCount);
   

}




}