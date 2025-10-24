
import java.util.Scanner;

//print following pattern 
/* Input = 3
 A B C 
 D E F 
 G H I 
 */
public class Q7 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        char ch = 65;
        for(int i = 1; i<=a; i++){
            for(int j= 1; j<=a; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
