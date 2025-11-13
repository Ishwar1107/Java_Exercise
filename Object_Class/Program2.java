//Instance

class Demo {
    int x = 10;
    int y = 20;
    void fun(){
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
        Demo obj = new Demo();          //instance variable can not access without object 
        obj.fun();  //access method using object 

    }
}
