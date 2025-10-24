
import java.util.Scanner;

//Write a program to print the first N whole numbers. Wheres N is user given number 
//input n = 100 output = 0,1,2,3,4,5...100

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        for(int i = 0; i<=a ; i++){
            System.out.println("Whole number : "+i);
        }
    }
}
