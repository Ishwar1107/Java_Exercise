//Write program to print following pattern
/*
input = 3 ;
 9 8 7
 6 5 4 
 3 2 1

 input = 4
 16 15 14 13
 12 11 10 9 
 8 7 6 5
 4 3 2 1


 */

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        int num = a*a;
        for(int i = 1; i<=a; i++){
            for(int j =1 ; j<=a; j++){
                System.out.print(num+" ");
                num--;
            }System.out.println();
        }

    }
} 
 
