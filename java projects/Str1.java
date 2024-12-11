public class Str1 {
    public static void main(String[] args) {
         String rev=reverse("greeshma"); 
          System.out.println(rev);
    }
    public static String reverse(String s){
            if(s.isEmpty()){
                return s;
        }
        return reverse(s.substring(1))+s.charAt(0);
    }
}
