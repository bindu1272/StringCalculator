package Arrays;
import java.util.Scanner;

public class ArraysQuestion5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Size of an array");
        int num = sc.nextInt();
        System.out.println("enter elements");
        int array[] = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("enter the key element");
        int key = sc.nextInt();
        System.out.println("elements are :");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

}
