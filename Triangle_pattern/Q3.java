//print following pattern 
/*
 Enter number : 4
      x 
    x x
  x x x
x x x x
Enter number : 5
        x 
      x x
    x x x
  x x x x
x x x x x
 */
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);             /*formula  a*(a+1)/2 */
        System.out.print("Enter number : ");            /*formula for space a-i */
        int a = sc.nextInt();
        for(int i =1; i<=a; i++){
            for(int j=1; j<=a; j++){
                if(j<=a-i){
                    System.out.print("  ");
                }else{
                System.out.print("x ");
                }
            }System.out.println("");
        }
    }
}
