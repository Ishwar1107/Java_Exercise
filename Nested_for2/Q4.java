/*
print following 
Enter number : 3
3 6 9
12 15 18
21 24 27
Enter number : 4
4 8 12 16 
20 24 28 32
36 40 44 48
52 56 60 64
 */
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        int num = 1;
        
        for(int i=1; i<=a; i++){
            for(int j=1; j<=a; j++){
                 num=num+a-1;
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
