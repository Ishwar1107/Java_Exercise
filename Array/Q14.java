
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int arr1[]=new int[a];
        for(int i =0; i<a; i++){
            arr1[i]=sc.nextInt();
        }for(int i=0; i<a; i++){
            System.out.println(arr1[i]);
        }
    }
}
