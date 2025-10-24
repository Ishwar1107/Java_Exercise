
import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");

        int size =sc.nextInt();
        int arr[] =new int[size];

        System.out.println("Enter Data : ");
        for(int i= 0; i<size; i++){
            arr[i]= sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i<size; i++){
            sum+=arr[i];
        }System.out.println("Sum : "+sum);
            
        }

    }

