public class Arr6 {
    public static void main(String[] args) {
        int a[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("before transpose");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        int b[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               b[j][i]=a[i][j];
               
            }
            
        }
        System.out.println("After transpose");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
