//print following pattern 
/*
Enter Number : 3
1 4 7
10 13 16
19 22 25

Enter Number : 4
1 5 9 13 
17 21 25 29
33 37 41 45
49 53 57 61
 */
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a =sc.nextInt();
        int num = 1;
        for(int i=1; i<=a; i++){
            for(int j=1; j<=a; j++){
                System.out.print(num+" ");
                num+=a;
            }System.out.println();
        }

    }
}
