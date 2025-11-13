public class Practice3 {
    static  int x =10;
    static {
        System.out.println("In Static Block");
    }
    static void fun(){
        System.out.println("In Static Method ");
    }
    public static void main(String[] args) {
        System.out.println(x);
        fun();

    }
}

//here order is = Static Block >> Static Variable >> Static Method  
