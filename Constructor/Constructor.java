class Constructor {
    int x = 10;
    static int y = 20;
    static{
        System.out.println("In Static Block ");
    }
    {
        System.out.println("In Instance Block ");
    }
    Constructor(){
        System.out.println("In Constructor");
    }
    void fun(){
        System.out.println("Instance Method");
    }   
    static void run(){
        System.out.println("Static Method");
    } 
    public static void main(String[] args) {
        Constructor obj = new Constructor();
        run();
        obj.fun();
        System.out.println(y);
        System.out.println(obj.x);
        
    }
}
/*
Byte Code 


 * class Constructor {
  int x;

  static int y;

  Constructor();
    Code:
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: bipush        10
         7: putfield      #7                  // Field x:I
        10: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
        13: ldc           #19                 // String In Instance Block
        15: invokevirtual #21                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        18: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
        21: ldc           #27                 // String In Constructor
        23: invokevirtual #21                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        26: return

  void fun();
    Code:
         0: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
         3: ldc           #29                 // String Instance Method
         5: invokevirtual #21                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         8: return

  static void run();
    Code:
         0: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
         3: ldc           #31                 // String Static Method
         5: invokevirtual #21                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         8: return

  public static void main(java.lang.String[]);
    Code:
         0: new           #8                  // class Constructor
         3: dup
         4: invokespecial #33                 // Method "<init>":()V
         7: astore_1
         8: invokestatic  #34                 // Method run:()V
        11: aload_1
        12: invokevirtual #37                 // Method fun:()V
        15: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
        18: getstatic     #40                 // Field y:I
        21: invokevirtual #43                 // Method java/io/PrintStream.println:(I)V
        24: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
        27: aload_1
        28: getfield      #7                  // Field x:I
        31: invokevirtual #43                 // Method java/io/PrintStream.println:(I)V
        34: return

  static {};
    Code:
         0: bipush        20
         2: putstatic     #40                 // Field y:I
         5: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
         8: ldc           #46                 // String In Static Block
        10: invokevirtual #21                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        13: return
}
 */