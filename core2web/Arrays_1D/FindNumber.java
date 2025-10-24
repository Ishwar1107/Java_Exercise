
import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        boolean flag = false;

        System.out.println("Enter Data : ");
        for(int i=0 ; i<a; i++){
            arr[i]=sc.nextInt();
        }
    
        System.out.println("Enter number to Search : ");
        int num =sc.nextInt();
        for(int i =0; i<a;i++){
            if(num==arr[i]){
                flag = true;
                break;
            }
            }
            if(flag == false){
                System.out.println("Not Present");
            }else{
                System.out.println("Present ");
            }
        }
    }

