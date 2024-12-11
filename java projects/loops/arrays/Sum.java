package loops.arrays;

import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] b = { { 1, 2, 3 }, { 4, 5, 6 } };
        
        
        int[][] arr = new int[a.length][];
        for (int i = 0; i < a.length; i++) {
            arr[i] = new int[a[i].length];
            for (int j = 0; j < a[i].length; j++) {
                arr[i][j] = a[i][j] + b[i][j];

            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

    }

}
