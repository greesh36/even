import java.util.Scanner;

public class Posnegzero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a:");
        int a=sc.nextInt();
        if(a>0){
            System.out.println(a+ " is positive");
        }
        else if(a<0)
        {
            System.out.println(a+ " is negatuve");
    }
    else{
        System.out.println(a+ " is zero");
    }
}
}