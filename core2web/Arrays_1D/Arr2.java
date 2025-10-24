//using io package print array 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arr2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Size : ");
        int aSize = Integer.parseInt(br.readLine());

        int arr[] =new int[aSize];

        System.out.println("Enter Data : ");

        for(int i=0; i<arr.length; i++){
            arr[i] =Integer.parseInt(br.readLine());
        }
        System.out.println("Enter Array : ");
        for(int i=0 ; i<aSize; i++){
        }System.out.println(arr[5]); // print ONE VALUE

    }
}
