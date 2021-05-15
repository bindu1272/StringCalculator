package Loops;
import java.util.Scanner;
public class LoopsQuestion10 {
    public boolean palindrome(int num){
        int r,p=0;
        int m = num;
        while(num > 0){
            r = num%10;
            num = num/10;
            p = (p*10) + r;
        }
        if(p==m) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        LoopsQuestion10 res = new LoopsQuestion10();
        System.out.println(res.palindrome(num));

    }
}
