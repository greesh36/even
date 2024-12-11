import java.util.Scanner;

public class Howmanyeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a:");
        int a= sc.nextInt();
        if (a%5 == 0 && a%11 == 0){
            System.out.println(a+ "yes it is divisable ");
        }
        else{
            System.out.println(a+ "not it is divisable "); 
        }sc.close();
    }
}
