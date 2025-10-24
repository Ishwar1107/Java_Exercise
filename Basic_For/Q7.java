//write a program to print a table for N where user input
//input N =17 output = 17 34 51 ...170 

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int a = sc.nextInt();
        for(int i =1; i<=10; i++){
            int table = i*a;
            System.out.println("Math Table : "+table);
        }
    }
}
