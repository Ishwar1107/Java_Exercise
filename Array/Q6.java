
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        char a= sc.next().charAt(0);
        char arr1[]= new char[a];
        System.out.print("Enter Data : ");   
        for(int i =0; i<a; i++){
            arr1[i]=sc.next().charAt(i);
        }
        for(int i =0; i<a; i++){
            System.out.println(arr1[i]+"    Char");
        }
    }
}
