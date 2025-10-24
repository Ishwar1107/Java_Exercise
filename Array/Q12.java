import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter Row Size : ");
        int a = sc.nextInt();
        System.err.println("Enter Column Size : ");
        int b = sc.nextInt();
        int arr1[][] = new int[a][b];
        System.out.println("Enter Data : ");
        for(int i = 0; i<a ; i++){
            for(int j=0; j<b; j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<a ; i++){
            for(int j=0; j<b; j++){
                System.out.print(arr1[i][j]+"     ");
            }
            System.out.println();
        }
    }
}
