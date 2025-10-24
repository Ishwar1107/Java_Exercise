import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row Size : ");
        int a = sc.nextInt();
        System.out.println("Enter Column Size : ");
        int b = sc.nextInt();
        int arr1[][]= new int[a][b];
        System.out.println("Enter Data : ");
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                arr1[i][j]=sc.nextInt();
            }
        }int sum=0;
        System.out.println("Array Is : ");
        for(int i= 0; i<a; i++){
            for(int j=0; j<b; j++){
                sum +=arr1[i][j];
                System.out.print(arr1[i][j]+"       ");
            }System.out.println();
        }System.out.println("Sum  : "+sum);
    }
}
