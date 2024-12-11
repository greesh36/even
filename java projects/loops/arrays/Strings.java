package loops.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        System.out.println("enter array size:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String arr1[] = new String[a];
        System.out.println("enter row1 values:");
        for (int i = 0; i < a; i++) {
            arr1[i] = sc.next();

        }
        String arr2[] = new String[a];
        System.out.println("enter row2 values:");
        for (int i = 0; i < a; i++) {
            arr2[i] = sc.next();
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        String[] arr3 = new String[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i + arr1.length] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
        sc.close();
    }
}
