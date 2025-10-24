//print following pattern 
/*
Enter Number : 3
* * * 
* *
*
 Enter Number : 4
* * * * 
* * *
* *
*
Enter Number : 5
* * * * * 
* * * *
* * *
* *
*
 */

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a =sc.nextInt();
        for(int i=1; i<=a; i++){
            for(int j=1; j<=a+1-i; j++){             //j<=a+1-i
                System.out.print("* ");
            }System.out.println("");
        }
    }
}
