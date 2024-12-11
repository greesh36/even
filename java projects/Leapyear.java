import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a year:");
        int a =sc.nextInt();
        if(a%4==0){
            System.out.println(a+ "is a leap year");
        }
        else{
            System.out.println(a+ "is  not leap year");
        }
        sc.close();
    }
}
