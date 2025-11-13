class Program7 {
    int x = 10;
    int y = 20;
    void fun(){
        System.out.println("In Fun");
    }    
    static void run(){
        System.out.println("In Run");
    }public static void main(String[] args) {
        Program7 obj = new Program7();
        System.out.println(obj.x);
        System.out.println(obj.y);
        obj.fun();
        run();

    }
}


/*
 * byte code 
 * class Program7 {
  int x;

  int y

 *  Program7();
    Code:
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: bipush        10
         7: putfield      #7                  // Field x:I
        10: aload_0
        11: bipush        20
        13: putfield      #13                 // Field y:I
        16: return

  void fun();
    Code:
         0: getstatic     #16                 // Field java/lang/System.out:Ljava/io/PrintStream;
         3: ldc           #22                 // String In Fun
         5: invokevirtual #24                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         8: return

  static void run();
    Code:
         0: getstatic     #16                 // Field java/lang/System.out:Ljava/io/PrintStream;
         3: ldc           #30                 // String In Run
         5: invokevirtual #24                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         8: return

  public static void main(java.lang.String[]);
    Code:
         0: new           #8                  // class Program7
         3: dup
         4: invokespecial #32                 // Method "<init>":()V
         7: astore_1
         8: getstatic     #16                 // Field java/lang/System.out:Ljava/io/PrintStream;
        11: aload_1
        12: getfield      #7                  // Field x:I
        15: invokevirtual #33                 // Method java/io/PrintStream.println:(I)V
        18: getstatic     #16                 // Field java/lang/System.out:Ljava/io/PrintStream;
        21: aload_1
        22: getfield      #13                 // Field y:I
        25: invokevirtual #33                 // Method java/io/PrintStream.println:(I)V
        28: aload_1
        29: invokevirtual #36                 // Method fun:()V
        32: invokestatic  #39                 // Method run:()V
        35: return
}
 */