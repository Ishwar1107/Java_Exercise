import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence : ");
        String str = sc.nextLine();
        System.out.println("Enter subsubtring to check : ");
        String str1 = sc.nextLine();
        if(str.toString().toLowerCase().contains(str1.toLowerCase())){
            System.out.println("Contain substring  ");
        }else{
            System.out.println("Not contain ");
        }
    }
}
