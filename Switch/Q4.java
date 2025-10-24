import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
    
//Write a program to create a calculator(+ ||- ||* ||/ ||%)
//input a = 5 b = 6 operation = + output = 11

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second number : ");
        int b = sc.nextInt();
        int add = a+b;
        int multiplication=a*b;
        int sub= a-b;
       System.out.println(add+" Addition ");
       System.out.println(multiplication+" Multiplication ");
       System.out.println(sub+" Substraction ");
       sc.close();

    }
}
