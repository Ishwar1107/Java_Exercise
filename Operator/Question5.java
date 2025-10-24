
//Write a program to demonstrate various assignment operators.
//   Your program should :
/*    Initialize two variable with numeric values
    Use compound assignment operators like +=, -=, *=, /=, %= to modify the values of the variables.
    Display the updated values after each operation 
    ex : Initial value of a = 10;
         Initial value of b = 5;

         After a+= 3, a= 13
         After b-= 2, b= 3
         After a*= 2, a= 26
         After b/= 3, b= 1
         After a%= 5, a= 1

*/
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter First Number :");
         int a = sc.nextInt();
         System.out.print("Enter Second Number :");
         int b = sc.nextInt();
         System.out.println("After Operator a+= 3 : "+(a+=3));
         System.out.println("After Operator b-= 2 : "+(b-=2));
         System.out.println("After Operator a*= 2 : "+(a*=2));
         System.out.println("After Operator b/= 3 : "+(b/=3));
         System.out.println("After Operator a%= 5 : "+(a%=5));
         sc.close();

    }
}
/*
 Output : 
        PS C:\Users\Admin\OneDrive\Desktop\Exercise\Data_Type\Operator> java Question5      
            Enter First Number :10
            Enter Second Number :5
            After Operator a+= 3 : 13
            After Operator b-= 2 : 3 
            After Operator a*= 2 : 26
            After Operator b/= 3 : 1 
            After Operator a%= 5 : 1    
 */
