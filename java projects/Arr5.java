public class Arr5 {
  public static void main(String[] args) {
     int a[]={2,3,4,5,6,7,8};
      int count =0;
      int ocount=0;
     for(int i=0;i<a.length;i++){
        if(a[i]%2==0){
            
            System.out.print(a[i]+"is a even");
            count++;
        }
        else{
            System.out.print(a[i]+"is a odd"); 
            ocount++; 
        }
       
     }
     System.out.println(count);
     System.out.println(ocount); 
  }
}
