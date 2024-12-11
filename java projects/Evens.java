import java.util.Scanner;

class Evens{
    public static void main(String[] args) {
     
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x :");
        int x= sc.nextInt();
        
        if(x%2==0){
            System.out.println(x +" is a even");
        }
        else
        System.out.println(x +"is a odd");
        sc.close();
    }
}