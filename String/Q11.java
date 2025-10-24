import java.util.*;
import java.util.StringTokenizer;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String info = sc.nextLine();
        StringTokenizer str = new StringTokenizer(info, " ");
        while(str.hasMoreTokens()){
            System.out.println(str.nextToken());
        }
    }
}
