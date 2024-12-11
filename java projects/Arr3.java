public class Arr3 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int n=3;
        int last;
        int j;
        for ( int i=0;i<n;i++){
            last=a[0];
          for( j=0;j<a.length-1;j++){
               
                a[j]=a[j+1];
                
            
            
                
          
        }
        a[j]=last;
        System.out.println();  
    }
        //Displays resulting array after rotation  
        System.out.println("Array after left rotation: ");  
        for(int k = 0; k< a.length; k++){  
            System.out.print(a[k] + " ");  

        
           

        
    }
}
}
