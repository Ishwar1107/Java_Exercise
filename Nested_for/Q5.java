import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
       
        for(int i =1; i<=a; i++){
            char ch = (char)(64+a);
            for(int j = 1; j<=a; j++){
                System.out.print(ch+""+i+" ");
                
            }
            System.out.println();
        }

    }
}
/*
output : 3
c3 c3 c3
c2 c2 c2
c1 c1 c1 
*/