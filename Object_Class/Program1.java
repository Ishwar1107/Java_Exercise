//Non-Static / Instance 
class Demo {
int x = 10; 
void fun(){
    System.out.println("Hello World ");
} 
public static void main(String[] args) {
    Demo obj = new Demo();
    System.out.println("IShwar Ghuge ");
    obj.fun();
    System.out.println(obj.x);
}   
}
