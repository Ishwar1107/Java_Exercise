
import java.util.Scanner;

//Write a program to print the even number from 1 to N where N is user given number 
//input N = 100 output = 2,4,6,8....100
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a =sc.nextInt();

        for(int i =1; i<=a; i++){
            if(i%2==0){
                System.out.println("Even number : "+i);
            }
        }
    }
}
