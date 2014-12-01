import java.util.Arrays;

public class Ragged {
    public static void main(String[] arg) {

        System.out.println("Before Sorting: ");
        int[][] ragged = new int[5][0];

        for (int i = 0; i < ragged.length; i++) {
            ragged[i] = new int[i * 3 + 5];

            for (int j = 0; j < i * 3 + 5; j++) {
                ragged[i][j] = (int)(Math.random() * 39);
            }
            System.out.println(Arrays.toString(ragged[i]));
        }

        System.out.println("After Sorting: ");

        int k = 0;
        while (k < ragged.length) {
            for (int m = 0; m < (k * 3 + 5); m++) {
                Arrays.sort(ragged[k]);
            }
            System.out.println(Arrays.toString(ragged[k]));
            k++;
        }
    }
}