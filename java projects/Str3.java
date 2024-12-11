public class Str3 {
    public static void main(String[] args) {
        String s1="greeshma";
        String s2=s1;
        String s3= new String("greeshma");
        String s4="greeshma";
        String s5=s3;
        String s6= new String("greeshma");
        if(s1==s2){
            System.out.println(s2);
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        if(s1==s3){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        if(s1==s4){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        if(s3==s5){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        if(s3==s6){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
