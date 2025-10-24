import java.io.*;
public class BasicArray {
    public static void main(String[] args) throws IOException {

    //int arr[] = new int[];       //error arry dimension missing

    //int arr[] = new int[5];         //no error  array with size 5 is created 

    //int arr[] = new int[5] {10,20,30, 40};      //error: array creation with both dimension expression and initialization is illegal

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter size : ");
    int size = Integer.parseInt(br.readLine());

    int arr[] = new int[size];

    System.out.println("Enter data : ");

    for(int i =0 ; i<size ; i++){
        arr[i] = Integer.parseInt(br.readLine());
    }
    System.out.println("User Input : ");

    for(int i =0 ; i<size; i++){
        System.out.println(arr[i]);     //print total array 
    }


    }
}
