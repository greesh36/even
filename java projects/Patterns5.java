public class Patterns5 {
    public static void main(String[] args) {
        for(int i=1;i<5;i++){
            for(int j=1;j<i+1;j++){
                
                System.out.print(" ");
            } 
            for(int k=i;k<5;k++){
                System.out.print(" "+k);
            }
            System.out.println("");
        }

            for(int i=1;i<4;i++){
                for(int j=5;j>i+1;j--){
                    
                    System.out.print(" ");
                } 
                for(int k=4-i;k<=4;k++){
                    System.out.print(" "+k);
                }
            System.out.println("");
           
           
                
               
    }
}
}