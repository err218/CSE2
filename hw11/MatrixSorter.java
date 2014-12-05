/*Emma Resnick
  CSE2
  HW 11 
  5 Dec. 2014
  Program 2/ HW 12
    
    This program creates a 3D array and splits it into slabs that grow longer in length. 
    THe minimum value of the entire array is formed, and then the 3 slab is sorted in each row, and is supposed to
    be sorted by the first member in each column.
*/

import java.util.Arrays;
public class MatrixSorter {
    public static void main(String arg[]) {
        int mat3d[][][];
        mat3d = buildMat3d();
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is " +
            findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);
        show(mat3d);
    }

    public static int[][][] buildMat3d() {
        int[][][] array = new int[3][0][0];
        for (int i = 0; i < array.length; i++) {
            //creates first dimension of array
            array[i] = new int[3 + 2 * i][0];

            for (int j = 0; j < 3 + 2 * i; j++) {
                //creates second dimension of array
                array[i][j] = new int[i + j + 1];
               
                for (int k = 0; k < i + j + 1; k++) {
                    //creates third dimension of array and fills it with random numbers
                 
                    array[i][j][k] = (int)((Math.random() * 99) + 1);

                }
            }

        }
        return array;
    }

    public static String show(int[][][] x) {

        for (int i = 0; i < x.length; i++) {
            //arrays don't form triangles, I'm not sure why
            System.out.println("----------------------------Slab " + (i + 1));
            System.out.println(Arrays.deepToString(x[i]));
            System.out.println("");


        }
        System.out.print(" ");
        return "";
    }

    public static int findMin(int[][][] x) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < 3 + 2 * i; j++) {
                for (int k = 0; k < i + j + 1; k++) {
                    if (x[i][j][k] < min) {
                        //goes through every single aspect of the array and finds the lowest value
                        min = x[i][j][k];
                    }
                }
            }

        }
        return min;
    }

    public static int[][] sort(int[][] x) {
        //what length works?
       int []temp= new int [0];
       
       
        
        
        for ( int i = 0; i < x.length; i++) {
                   
                    //this doesn't work and idk why
                    // if((x[i][0])>(x[i+1][0]){
                    //     temp=x[i];
                    //     x[i]=x[i+1];
                    //     x[i+1]=temp;
                       
                    // }
                    
                    Arrays.sort(x[i]);
                    
                    
                    
        }
        
        return x;
    }
    

}