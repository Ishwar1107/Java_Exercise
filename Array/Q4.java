
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Size : ");
        int a = sc.nextInt();
        int arr1[]= new int[a];
        System.out.print("Enter Data : ");
        for(int i=0; i<a ; i++){
            arr1[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0; i<a; i++){
            if(arr1[i]%2==1){
                sum +=arr1[i];
            } System.out.println(arr1[i]+"    "); 
        }System.out.println("Sum of Odd Number : "+sum);
    }
}
