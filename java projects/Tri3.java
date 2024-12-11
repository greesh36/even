public class Tri3 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
                for(int k=10-i;k>0;k--){
                    System.out.print("* "); 
                    
            }
            System.out.println("");
                
        }
        for(int i=1;i<9;i++){
            for(int j=9-i;j>0;j--){
                System.out.print(" ");
            } 
            for(int k=0;k<i+1;k++){
                System.out.print("* "); 
                
        }
        System.out.println("");
    }
}
}
