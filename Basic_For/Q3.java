
import java.util.Scanner;

//Write a program to print the first N 3 digit number. Where N is user input 
//input N = 10 output = 100,101,102...109
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
         a +=100;
        for(int i = 100; i<=a; i++){
            System.out.println("3 Digit number : "+i);
        }
    }
}
