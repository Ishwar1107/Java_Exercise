import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");

        int a = sc.nextInt();
        int arr[] = new int[a];

        System.out.println("Enter Data : ");

        for(int i= 0; i<a; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Array : ");

        for(int i=0; i<a; i++){
            System.out.println(arr[i]);
        }
        
        System.out.println("Reverse Array : ");
        
        for(int i=a-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}