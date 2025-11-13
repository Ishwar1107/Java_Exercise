class Program5 {
    static int x =10;
    static{
        System.out.println("In Static Block");
    }
    static void fun(){
        System.out.println("In Static mehtod : Fun()");
    }
    public static void main(String[] args) {
        System.out.println(x);
        fun();
    }   
}

/* output 
In Static Block
10
In Static mehtod : Fun()
 */

 /*
  byte code 


  class Program5 {
  static int x;

  Program5();
    Code:
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return

  static void fun();
    Code:
         0: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: ldc           #13                 // String In Static mehtod : Fun()
         5: invokevirtual #15                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         8: return

  public static void main(java.lang.String[]);
    Code:
         0: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: getstatic     #21                 // Field x:I
         6: invokevirtual #27                 // Method java/io/PrintStream.println:(I)V
         9: invokestatic  #30                 // Method fun:()V
        12: return

  static {};
    Code:
         0: bipush        10
         2: putstatic     #21                 // Field x:I
         5: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
         8: ldc           #33                 // String In Static Block
        10: invokevirtual #15                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        13: return
}

  */
