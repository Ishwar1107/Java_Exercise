//write a program to print the odd number 1 to N 

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        for(int i = 1; i<=a; i++){
            if(i%2==1){
                System.out.println("Odd Number : "+i);
            }
        }
    }
}
