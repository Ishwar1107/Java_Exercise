//print following pattern 
/*
Enter Number : 3
* 
* *
* * *
Enter Number : 4
*     
* *   
* * * 
* * * *
 */
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a =sc.nextInt();
        for(int i=1; i<=a; i++){                    //j<=i;
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
}
