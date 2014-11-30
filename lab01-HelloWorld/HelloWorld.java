//Emma Resnick
//CSE2
//Lab01
//Hello World Java Program

// first compile the program
//  javac HelloWorld.java
//run the program
// java HelloWorld//

// define a class
import java.util.Arrays;
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

        //   int x[]={3, 12, 15, 6, 0, 0, 0, 0, 0};
        //     System.out.println(Arrays.toString(print(x)));

        // String x[]={"one", "two", "to", "fifteen", "three"};
        // System.out.println(Arrays.toString(range(x)));

        //System.out.println(Arrays.toString(makeZero(10)));
        // int[] array = {
        //     4, 4, 5, 65, 34, 1
        // };
        // computeAvgs(array);

        //  int [] x={1,10,3,7};
        // int [] y={2,3,4,5,10,6}; 

        // System.out.print(Arrays.toString(overlap(x,y)));


        double[] A = {
            2.0, 3.0, 3.4
        };
        double[] B = {
            1.2, 3.2, 7.3
        };

        double[] D = new double[A.length + B.length];

        double temp = 0;

        for (int i = 0; i < A.length; i++) {
            D[i] = A[i];

            if (i == A.length - 1) {
                for (int j = 0; j < B.length; j++) {
                    D[j + A.length] = B[j];
                }
            }
        }

        for (int k = 0; k < D.length; k++) {
            for (int m = 0; m < k; m++) {
                    if (D[k] < D[m]) {
                        temp = D[m];
                        D[m] = D[k];
                        D[k] = temp;

                    }
                }
                // if(D[k]>D[k+1]){
                //     min=D[k+1];
                // }
        }

        System.out.print(Arrays.toString(D));


    }

    // public static int [] overlap(int [] a, int []b){
    //     int [] array= new int [a.length];
    //     int counter =0;

    //     for(int i=0; i<a.length; i++){
    //         for(int j=0; j<b.length; j++){
    //             if(a[i]==b[j]){
    //                 array[i]=a[i];
    //                 counter ++;
    //             }
    //         }
    //     }

    //     array[0]=counter;
    //     return array;
    // }





    // public static void computeAvgs(int[] x) {
    //     double sumEven = 0;
    //     double sumOdd = 0;
    //     int counterE = 0;
    //     int counterO = 0;
    //     for (int i = 0; i < x.length; i++) {
    //         System.out.print(x[i] + " ");

    //         if (x[i] % 2 == 0) {
    //             sumEven =x[i]+sumEven;
    //             counterE++;
    //         }

    //         if (x[i] % 2 == 1) {
    //             sumOdd = x[i]+sumOdd;
    //             counterO++;
    //         }
    //     }

    //     System.out.println(" ");
    //     System.out.println(sumEven);
    //     System.out.println(sumOdd);


    //     System.out.println("Avg Even: " + ((sumEven) / (counterE)));
    //     System.out.println("Avg Odd: " + ((sumOdd) / (counterO)));
    // }
}

//   public static int [] makeZero(int x){
//       int [] array= new int [x];

//       for(int i=0; i<array.length; i++){
//           array[i]=0;
//       }

//       return array;
//   }

//not finished
// public static String [] range(String a []){
//     String min="";
//     for (int i=0; i<=a.length; i++){

//         if(a[i].length()==a[i+1].length()){
//             i++;

//         }


//         if(a[i].length()>a[i+1].length()){
//             min=a[i+1];
//             System.out.println("ok1"+min);

//         }

//          if(a[i].length()<a[i+1].length()){
//             min=a[i];
//              System.out.println("ok2"+min);
//         }


//     }

//      return a;




// public static int [] print(int a[]){
// int aNew []= new int [a[0]];
// int b=0;


// for(int i=1; i<a.length; i++){
//     if(a[0]>a.length-1){
//     System.out.println("ERRORRRRRR");
//     return a;
//     }

//     if(a[i]!= 0){
//       aNew[b]=a[i]; 
//       b++;
//     }

//     if(a[i]==0){
//         break;
//     }
// }


// return aNew;
// }
