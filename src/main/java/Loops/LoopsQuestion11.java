package Loops;
import java.util.Scanner;
public class LoopsQuestion11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num%2){
            case 0 :
                    System.out.println("even");
                break;
            case 1 :
                    System.out.println("odd");
        }
    }
}
