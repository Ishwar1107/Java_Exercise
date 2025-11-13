public class Practice1 {
    int x =10 ;
    int y = 20 ;
    void  fun(){
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
        Practice1 pr = new Practice1();
        pr.fun();           //accessing instatance variable using non static method and object 
    }
}
