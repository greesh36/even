import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        int a= 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age:");
         a =sc.nextInt();
         int age = a >=18?0:1;
         switch(age){
            case 0:
         System.out.println("elegiable to vote");
         break;
         case 1:
         System.out.println("not elagable");
        }

    }
}
