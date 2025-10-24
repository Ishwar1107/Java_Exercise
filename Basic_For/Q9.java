//Write a program to print the sum of first N natural numbers where N is user input 
//

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        int sum =0;
        for(int i =1; i<=a; i++){
            sum = sum+i;
          
        }  System.out.println("Sum : "+sum);
    }
}
