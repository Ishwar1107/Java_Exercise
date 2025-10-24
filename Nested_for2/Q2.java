//print following pattern
/*
1 2 3 4
2 3 4 5
3 4 5 6
4 5 6 7
 */

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        for(int i =1; i<=a; i++){
            for(int j=i; j<=i+a; j++){
                System.out.print(j+" ");
            }System.out.println();
        }
    }
}
