
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int a= sc.nextInt();
        System.out.print("Enter Data : ");
        int arr1[] = new int[a];
        for(int i=0 ; i<a; i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0; i<a; i++)
        if(arr1[i]<10){
            System.out.println(arr1[i]);
        }
    }
}
