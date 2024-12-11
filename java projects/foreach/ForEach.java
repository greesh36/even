package foreach;

public class ForEach {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        for(int i=0;i<a.length;i++){

            System.out.println(i+":"+a[i]);
        }
        for(int b:a){
            System.out.println(b);
        }
    }
}
