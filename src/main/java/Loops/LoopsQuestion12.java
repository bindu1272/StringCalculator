package Loops;
import java.util.Scanner;

public class LoopsQuestion12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        switch (ch){
            case 'm':
            case 'M':
                    System.out.println("Male");
                    break;
            case 'f':
            case 'F':
                    System.out.println("Female");
                    break;
            default:
                System.out.println("not Male not a female");
        }
    }
}
