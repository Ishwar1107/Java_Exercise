
import java.util.Scanner;



public class ScannerDemo {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Society Name : ");    
        String socName = sc.next();

        System.out.print("Enter Society Wing : ");    
        char socWing = sc.next().charAt(0);

        System.out.print("Enter Society Flat No : ");    
        int socNo = sc.nextInt();

        System.out.print("Enter Rent : ");
        float socRent = sc.nextFloat();

        System.out.println("Society Name : "+socName);
        System.out.println("Society Wing : "+socName);
        System.out.println("Society Flat Number : "+socNo);
        System.out.println("Society Rent : "+socRent);


    }
    
}
