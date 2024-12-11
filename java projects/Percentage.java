import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter telugu:");
        int a=sc.nextInt();
        System.out.println("enter maths:");
        int b=sc.nextInt();
        System.out.println("enter social:");
        int c=sc.nextInt();
        int total =a+b+c;
        System.out.println(total);
        double result;
            result=total/3;
System.out.println(result);
if(total>=90){
System.out.println("A");
}
else if(total>=80){
    System.out.println("B");
    }
    else{
        System.out.println("F");
    }
    sc.close();
        }


    }

