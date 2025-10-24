
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int arr1[]= new int[a];
        System.out.println("Enter Data : ");
        for(int i=0; i<a; i++){
            arr1[i]= sc.nextInt();
        }System.out.println("Divisible by 4 : ");
        for(int i= 0; i<a; i++){
            if(arr1[i]%4==0 && arr1[i] !=0){
                System.out.println(arr1[i]);
            }
        }
    }
}
