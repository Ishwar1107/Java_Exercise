import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        
//Write a program that takes a number from 0 to 5 and prints its spelling , if the enterd number is greater than 5 print the entered number is greater than 5 
//input = 3 output = three || input = 6 output = greater than 5

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        switch (a) {
            case 0->System.out.println(a+" Zero");
            case 1->System.out.println(a+" One");
            case 2->System.out.println(a+" Two");
            case 3->System.out.println(a+" Three");
            case 4->System.out.println(a+" Four");
            case 5->System.out.println(a+" Five");
            default->System.out.println(a+" Greater than 5");
        }
    }
}
