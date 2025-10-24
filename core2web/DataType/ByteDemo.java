


public class ByteDemo {

    public static void main(String[] args) {
        byte x = 17;            //range -128 to 127 ;
        System.out.println(x);

        int a = 852963;             // range -2147483648 to 2147483647
        System.out.println(a);

        long b = 2147483648L;       //for write a larger number use long and write L to last
        System.out.println(b);

        char name ='\u0906';  //character IN marathi use
        System.out.println(name);

        double c = 10.5;
        System.out.println(c);

        byte h = 0b00001010;
        System.out.println(h);

        byte k = (byte)0b11110100;
        System.err.println(k);
    }
    
}
