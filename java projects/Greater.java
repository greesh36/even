import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a:");
        int a=sc.nextInt();
        System.out.println("enter b:");
        int b=sc.nextInt();
        System.out.println("enter c:");
        int c=sc.nextInt();
        if(a<b&&b<c){
            System.out.println(c + " is the greatest number");
            }
        else if(a<b){
                System.out.println(b+ "is the greatest number");
            }
        
        else
        {
            System.out.println(a + " is the greatest number");
        }

    }
    
}
