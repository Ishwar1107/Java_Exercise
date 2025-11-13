class Demo {
    int x =10;
    static int y = 20;
    void fun(){
        System.out.println("In fun");
    }
    public static void main(String[] args) {
        Demo obj = new Demo();
        System.out.println(obj.x);   
        System.out.println(y);
        obj.fun();   
    }
}


/*
    Compiled from "Program6.java"
class Demo {
  int x;

  static int y;

  Demo();
    Code:
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: bipush        10
         7: putfield      #7                  // Field x:I
        10: return

  static void fun();
    Code:
         0: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
         3: ldc           #19                 // String In fun
         5: invokevirtual #21                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         8: return

  public static void main(java.lang.String[]);
    Code:
         0: new           #8                  // class Demo
         3: dup
         4: invokespecial #27                 // Method "<init>":()V
         7: astore_1
         8: aload_1
         9: pop
        10: invokestatic  #28                 // Method fun:()V
        13: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
        16: aload_1
        17: getfield      #7                  // Field x:I
        20: invokevirtual #31                 // Method java/io/PrintStream.println:(I)V
        23: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
        26: getstatic     #34                 // Field y:I
        29: invokevirtual #31                 // Method java/io/PrintStream.println:(I)V
        32: return

  static {};
    Code:
         0: bipush        20
         2: putstatic     #34                 // Field y:I
         5: return
}
 * 
 */