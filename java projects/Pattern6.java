public class Pattern6 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            if(i%2==0){
                int num=1;
                for( int j=num;j<5;j++){
                    System.out.print(num);
                    num = (num == 0)? 1 : 0;  

                }
            }
            else {
                int num=0;
                for( int j=num;j<4;j++){
                    System.out.print(num);
                    num = (num == 0)? 1 : 0;
            }
        }
        System.out.println();    
    }
     
}
}
