package Arrays;

import java.util.Scanner;

public class ArraysQuestion6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Size of an array");
        int num = sc.nextInt();
        System.out.println("enter elements");
        int array[] = new int[num];
        int array1[] = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("elements are :");
        for (int i : array) {
            System.out.print(i + " ");
        }
        int j=0;
        for(int i : array){
            array1[j++] = i;
        }
        System.out.println("After copying the elements");
        for(int i : array1){
            System.out.print(i+ " ");
        }
    }
}
