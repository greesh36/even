import java.util.Scanner;

public class Squareroot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("square root of a number:");
        double a =sc.nextDouble();
        System.out.println("square root of a number:");
        double b =sc.nextDouble();
        System.out.println("square root of a number:");
        double c =sc.nextDouble();
        double root1,root2;
        double formula=b*b-4*a*c;
        if(formula>0)
        {
        root1= (-b + Math.sqrt(formula)) / (2 * a);
        root2 = (-b - Math.sqrt(formula)) / (2 * a);
        System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        }
        else if(formula==0){
            root1=root2=-b/(2*a);
       System.out.println(root1);
        }
        else{
    double real ,imaginary;
    real=-b/(2*a);
    imaginary=Math.sqrt(formula) / (2 * a);
    System.out.format("root1 = %.2f+%.2fi", real, imaginary);
    System.out.format("root1 = %.2f+%.2fi", real, imaginary);
   }
    }
}
