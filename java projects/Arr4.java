public class Arr4 {
    public static void main(String[] args) {    
        //Initialize array     
        int [] arr = new int [] {1, 2, 3, 4, 5};     
        //n determine the number of times an array should be rotated.    
        int n = 3;    
           
        
            
        
        for(int i = 0; i < n; i++){    
            int j, last;    
           
            last = arr[arr.length-1];    
            
            for(j = arr.length-1; j > 0; j--){    
                
                arr[j] = arr[j-1];    
            }    
               
            arr[0] = last;    
        }    
        
        System.out.println();    
            
        
        for(int i = 0; i< arr.length; i++){    
            System.out.print(arr[i] + " ");    
        }    
    }    
}    
    

