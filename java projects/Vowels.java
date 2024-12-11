import java.util.Scanner;

public class Vowels {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character:");
        char n = sc.next().charAt(0);
        if(n == 'a'||n=='i'||n=='e'||n=='o'||n=='u'){
System.out.println(n + "is a vowel");
        }else
System.out.println(n+ " is constant");
sc.close();
        }
        

    }
    

