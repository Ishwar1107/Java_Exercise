import java.util.*;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next();

        StringBuffer st = new StringBuffer(str);
        StringBuffer str1 =st.reverse();
        str1.toString();
        if(str.equals(str1)){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not Palindrom");
        }

    }
}
