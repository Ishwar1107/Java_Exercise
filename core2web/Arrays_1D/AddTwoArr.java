
import java.util.Scanner;

public class AddTwoArr {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter Size of Array 1 : ");

        int a = sc.nextInt();
        //First Array 
        int arr1[] = new int[a];

        System.out.println("Enter Data of First Array : ");
        for(int i= 0; i<a; i++){
            arr1[i]=sc.nextInt();
        }
       
        //Second Array 
        System.out.print("\nEnter Size of Array 2 : ");
        int b = sc.nextInt();
        int arr2[] = new int[b];

        System.out.println("Enter Data of Second Array : ");
        for(int i= 0; i<b; i++){
            arr2[i]=sc.nextInt();
        }
         System.out.print(" \nFirst Array : ");
        for(int i= 0 ; i<a; i++){
            System.out.print(arr1[i]+"    ");
        }
        System.out.print("\nSecond Array : \n");
        for(int i= 0 ; i<b ; i++){
            System.out.print(arr2[i]+"    ");
        }

        //Combine Array 
    
        int c= a+b;
        int arr[] = new int[c];
        //first array 
        for(int i= 0; i<a; i++){
            arr[i] = arr1[i];
        }
        //second array 
        for(int i= 0 ; i<b ; i++){
            arr[a+i]= arr2[i];
        }
        System.out.print("\nCombined Array : ");
        for(int i=0; i<c; i++){
            System.out.print(arr[i]+"   ");
        }
        System.out.print("\nReverse Array : ");
        for(int i = c-1; i>=0; i--){
            System.out.print(arr[i]+"   ");
        }
        sc.close();


    }
}
