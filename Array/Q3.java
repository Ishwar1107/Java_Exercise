import java.util.Scanner;

class Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int a = sc.nextInt();
        int arr1[] = new int[a];
        System.out.print("Enter Data : ");
        for(int i = 0; i<a ; i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Even Number : ");
        for(int i=0; i<a ; i++){
            if(arr1[i]%2==0){
                System.out.print(+arr1[i]+"     ");
            }
        }
    }
}