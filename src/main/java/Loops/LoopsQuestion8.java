package Loops;
import java.util.Scanner;

public class LoopsQuestion8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int res,m=num;
        while(num>0) {
            res = num % 10;
            num = num / 10;
            sum = sum + (res*res*res);
        }
        if(sum == m){
            System.out.println("armstrong");
        }else{
            System.out.println("not an armstrong");
        }
    }
}
