package loops.arrays;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        System.out.println("enter array size:");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("enter row values:");
        int sum=0;
        double average=0;
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();

        }
        for(int j=0;j<arr.length;j++){
            sum=sum+arr[j];
            average=sum/arr.length;
        }
        System.out.println(sum);
        System.out.println(average);
        sc.close();
    }
}
