
//Reverse String 


public class Q6 {
    public static void main(String[] args) {
        String str = new String("Java");
        StringBuffer str1 = new StringBuffer(str);
        System.out.println(str1);
        str1.reverse();
        str = str1.toString();
        System.out.println(str);

    }
}
