import java.util.Scanner;

public class Tri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            } 
             System.out.println("");
        } 
        for(int i=3;i>0;i--){
            for(int j=i-1;j>0;j--){
                System.out.print("*");
            } 
             System.out.println("");
        } 

    }
    
}
