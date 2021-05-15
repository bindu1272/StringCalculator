package JavaBasics;
import java.util.Scanner;

public class BasicCalling {
     static  int x = 20;
     static {
         System.out.println("Global Variable :"+x);
     }
    public static void main(String args[]){
        int x = 10;
        BasicCalling basicCalling = new BasicCalling();
        System.out.println("hi this is Bindu");
        //This is single line Comment
        /*this is Multiline comment */
        System.out.println("Local Variable :" +x);

        int num = 20;
        char c = 'a';
        Boolean b = true;
        float f = 5.5f;
        double d = 209.45678;
        System.out.println("  int:"+num+"  char:" +c+"  boolean:"+b+"  float:"+f+"  double:"+d);
        //Calling the Function
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(basicCalling.callingName(str));
    }
    public String callingName(String str){
        return  str;
    }
}
