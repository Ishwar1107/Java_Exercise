class Program2{
    static int x =10;
    static int y =20;
    static void fun(){
        System.out.println("In fun");
    }
    public static void main(int args) {         //Argument Constructor 
        System.out.println("In Integer Cache");
        
        //two main in same code 

        /*
        1) main method 2 chalta fakt parameter same nakoy 
        2) parameter cha use ha user kadun value ghenya sathi hoto 
         */

    }
    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(y);
        fun();
        main(10);

    }
}