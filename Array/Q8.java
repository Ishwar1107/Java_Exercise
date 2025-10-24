
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Size : ");
     int a = sc.nextInt();
     int arr1[] = new int[a];
     System.out.println("Enter Data : ");   
     for(int i=0; i<a ; i++){
        arr1[i]=sc.nextInt();
     }
     int count = 0;
     for(int i=0 ; i<a; i++){
        System.out.println(arr1[i]);
        count++; 
    }
     System.out.println("Count : ");
     System.out.println(count);
    }
}
