class Program4 {
    Program4() 
    {
        System.out.println("No Argument Constructor ");
    }
    Program4(int x){
        System.out.println("One Argument Constructor");
    }
    Program4(int x, int y){
        System.out.println("Two Argument Constructor ");
    }
       
}
class Ishwar{
    public static void main(String[] args) {
        Program4 obj1 = new Program4();
        Program4 obj2 = new Program4(10);
        Program4 obj3 = new Program4(10,10);


    }
}
