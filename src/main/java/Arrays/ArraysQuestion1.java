package Arrays;
import java.util.Scanner;

public class ArraysQuestion1 {
    public static void main(String args[]){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Size of an array");
        int num = sc.nextInt();
        System.out.println("enter elements");
        int array[] = new int[num];
        for(int i=0;i<num;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("elements are :");
        for(int i : array){
            System.out.print(i+" ");
        }
        System.out.println("After adding the integers sum is : ");
        for(int i : array){
            sum = sum + i;
        }
        System.out.print(sum);

    }
}
