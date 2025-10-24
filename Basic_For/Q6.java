//write a program to print the number in reverse order from N to 10 where N is user input 
//input = 80 output = 80,79,78,77.....10

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        for(int i = a ; i>=10; i--){
            System.out.println("Revere Order : "+i);
        }
    }
}
