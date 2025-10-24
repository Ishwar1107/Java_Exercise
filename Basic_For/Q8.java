//write a program to print a table in reverse order where N is user input 
//input N = 14 output = 140,126, 112...14

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a =sc.nextByte();

        for(int i =10; i>=1; i--){
            int rtable = i*a;
            System.out.println("Reverse table : "+rtable);
        }
    }
}
