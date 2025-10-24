//print array taking user input with scanner class

import java.util.Scanner;


class Arr1{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Size : ");

       //Enter Size

       int size = sc.nextInt();  
       int arr[] = new int[size];       //Enter Data According to size
        
       System.out.println("Enter Data : "); 
       for(int i = 0; i<size; i++){                //for loop return data  
        arr[i] =sc.nextInt();       
       }                         //print array 
         System.out.println("array is : ");
       for(int i= 0; i<size; i++){
         System.out.println(arr[i]);
       }
    }

    }
