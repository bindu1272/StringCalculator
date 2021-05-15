package Arrays;
import java.util.Scanner;

public class ArraysQuestion8 {
    public static void main(String args[]) {
        int max = 0;
        int min = Integer.MAX_VALUE;
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
        for(int i : array){
            if(i>max){
                max = i;
            }
            if(i<min){
                min = i;
            }
        }
        System.out.println("Maximum element : "+ max);
        System.out.println("Minimum element :" +min);
    }
}
