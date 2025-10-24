//write a program to print a sum of odd number where N is user input 
// input N = 10 output = 5

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        int sum=0;
        int ct =0;
        for(int i =1; i<=a; i++){
            if(i%2!=0){
                sum =sum+i;
                ct++;
            }
        }System.out.println("Sum : "+sum);
        System.out.println("Count : "+ct);
    }
}
