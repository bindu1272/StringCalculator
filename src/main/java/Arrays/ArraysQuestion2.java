package Arrays;
import java.util.Scanner;

public class ArraysQuestion2 {
    public static void main(String args[]) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Size of an array");
        int num = sc.nextInt();
        System.out.println("enter elements");
        int array[] = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("elements are :");
        for (int i : array) {
            System.out.print(i + " ");
        }
        for (int i : array) {
            sum = sum + i;
        }
        System.out.println("Average of integers is : " + sum / num);
    }
}
