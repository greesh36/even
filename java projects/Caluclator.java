import java.util.Scanner;

public class Caluclator {
    public static void main(String[] args) {
        int a,b;
        char c;
        Scanner sc=new Scanner(System.in);
        System.out.println("+,-,*,/ enter any of them:");
        c= sc.next().charAt(0);
        System.out.println(" enter 1:");
            a=sc.nextInt();
            System.out.println(" enter 2:");
            b=sc.nextInt();
        switch(c){
            case '+':
            
            System.out.println("addition="+(a+b));
            break;
            case '-' :
            
            System.out.println("subtraction="+(a-b));
            break;

            case '*':
            
            System.out.println("multiplication="+(a*b));
            break;

            case '/':
            
            System.out.println("divition="+(a/b));
            break;

            default:
            System.out.println("no value found! please try again");
        } 
        sc.close();
    }
}
