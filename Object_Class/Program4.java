class Demo{
    static int x = 10;
    static {
        System.out.println("In Static");
    }    
    public static void main(String[] args) {
        System.out.println("In main method ");
        System.out.println(x);
    }
    static {
        System.out.println("In static block ");
    }
}
/*//byte code 


 * class Demo {
  static int x;

  Demo();
    Code:
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return

  public static void main(java.lang.String[]);
    Code:
         0: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: ldc           #13                 // String In main method
         5: invokevirtual #15                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         8: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
        11: getstatic     #21                 // Field x:I
        14: invokevirtual #27                 // Method java/io/PrintStream.println:(I)V
        17: return

  static {};
    Code:
         0: bipush        10
         2: putstatic     #21                 // Field x:I
         5: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
         8: ldc           #30                 // String In Static
        10: invokevirtual #15                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        13: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
        16: ldc           #32                 // String In static block
        18: invokevirtual #15                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        21: return
}
 */