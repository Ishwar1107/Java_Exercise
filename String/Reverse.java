public class Reverse {
    public static void main(String[] args) {
        String str = "Ishwar";
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        str = sb.toString();
        System.out.println(str);


    }
}
