/*WAP to check if is any vowel in the array of character if present then print its index ,
  where you have to take the size and element from the user 
    input = size - 5 element - arEKO : output 1) vowel a found at index 0 
                                              2) vowel E found at index 2 
                                              3) vowel O found at index 4
 */

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Size : ");
       int a=sc.nextInt();
       char arr1[] = new char[a];
       System.out.print("Enter Data : ");
       for(int i=0; i<a; i++){
        arr1[i]=sc.next().charAt(0);
       }
       for(int i=0; i<a; i++){
        char ch = arr1[i];
        if(ch==65 || ch==69 || ch==73 || ch==79 || ch==85 || ch==97 || ch==101 || ch==105 || ch==111 || ch==117){
            System.out.println("Vowel "+ch+" found at Index : "+i);
        }
       }
    }
}
