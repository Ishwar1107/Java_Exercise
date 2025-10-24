import  java.util.StringTokenizer;
import java.util.*;

public class StringTokenizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name, Father Name, Surname");
        String info =sc.nextLine();
        StringTokenizer sb = new StringTokenizer(info, " ");
        while (sb.hasMoreElements()) {
            System.out.println(sb.nextToken());
        }
    }
}
