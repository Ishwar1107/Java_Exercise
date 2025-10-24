
import java.util.Scanner;

//print following pattern 
/*
Enter Number : 5
x x x x x 
  x x x x 
    x x x 
      x x 
        x

Enter Number : 6
x x x x x x 
  x x x x x
    x x x x
      x x x
        x x
          x
 */

public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        for(int i=1; i<=a; i++){                //condition for space and formula for space j<=i-1
            for(int j=1; j<=a; j++){
                if(j<=i-1){
                    System.out.print("  ");
                }else{
                    System.out.print("x ");
                }
            }System.out.println("");
        }
    }
}
