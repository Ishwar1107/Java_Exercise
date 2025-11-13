public class Practice2 {
    static  int x = 10;
    static {
        System.out.println("In Static Block ");
    }
    public static void main(String[] args) {
        System.out.println("In Main Method ");          //main madhla static static block sarvat adhi call hoto mg nanter che 
    }
    static {
        System.out.println("In Static Block Main ");  //static block adhi call hoto 
    }
}
