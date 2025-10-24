//print pattern
/*
input = 4
 d c b a
 d c b a
 d c b a
 d c b a
 
 */

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();  //only for input upto 4
        
        for(int i =1; i<=a; i++){
            char ch = 100;
            for(int j=1; j<=i; j++){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
    
}
