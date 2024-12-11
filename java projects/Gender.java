import java.util.Scanner;

public class Gender {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("");
        char gender=sc.next().charAt(0);
        switch(gender){
            case 'm' :
            case 'M' :
            System.out.println("male");
            break;
            case 'f':
            case 'F':
            System.out.println("female");
            break;
            default:
            System.out.println("none of above");
        }


    }
}
