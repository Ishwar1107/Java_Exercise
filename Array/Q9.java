
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter Size : ");
        int a = sc.nextInt();
        int arr1[] = new int[a];
        System.out.println("Enter Data : ");
        for(int i= 0 ; i<a ; i++){
            arr1[i] = sc.nextInt();
        }System.out.println("Odd Index Number : ");
        for(int i= 0; i<a; i+=2){
            System.out.println(arr1[i]);
        }
    }
}
