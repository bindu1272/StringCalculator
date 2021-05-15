package Loops;
import java.util.Scanner;

public class LoopsQuestion5 {
    public static void main(String args[]){
        int num1,num2,num3;
        System.out.println("enter three digits");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.println("Largest Number is : "+ num1);
        }
        else if(num2 > num3){
            System.out.println("Largest Number is : "+ num2);
        }else{
            System.out.println("Largest Number is : "+num3);
        }
    }
}
