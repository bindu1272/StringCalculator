package Loops;
import java.util.Scanner;

public class LoopsQuestion13 {
    public static void main(String args[]){
        System.out.println("enter three digits");
        Scanner sc = new Scanner(System.in);
        int num1 = 10,num2 = 20,num3 = 30;
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
