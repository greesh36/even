import java.util.Arrays;

public class Arr1 {
    public static void main(String[] args) {
        int arr[]={1,3,4,5};
        int brr[]=new int[3];
       
        
        direct(arr, brr);
        System.out.println(Arrays.toString( brr));
       
        inDirect(arr, brr);
        System.out.println(Arrays.toString( brr));

    }

        public  static void direct(int[] arr, int[] brr){
                        System.arraycopy(arr,1,brr,0,2);
                 
        
        }
        public static void inDirect(int[] arr, int[] brr) {
            for (int i = 0; i < arr.length; i++) {
                brr[i] = arr[i];  
            
        }
                
        
            }
        
        }         

