import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {

        //System.out.println("Hello World");
/* 
//unary code

        int x = 13;
        int result = ++x;  // pre-increment
        System.err.println(result); //14
        System.out.println(x); //14

        int a = 14;
        int result1 = a++;  // post-increment
        System.out.println(a);    // 15
        System.out.println(result1);  //14

        int z = 20;
        int result2 = z--;  //post-decrement
        System.err.println(z);  // 19
        System.out.println(result2); //20

        int b = 20;
        int result3 = --b; //pre-increment
        System.err.println(b); //19
        System.out.println(result3); //19


*/

/* 
//binary operator

        int a = 7;
        int result = ++a + ++a;  //a=7 then incre a =8 store in result , result = 8 then a = 8 ,
                                        //again incr a= 9 again store result 9 and then add both value
        System.out.println(a);

        System.out.println(result);



 //logical operator 

        int d = 10;
        int e = 15;
        boolean result1 = (++d < --e) || (d++ < --e);
        System.out.println(d);
        System.out.println(e);
        System.out.println(result1);

*/

//bitwise operator

/*

        int a = 7 ;
        int b = 8 ;
        System.out.println(a&b);        
        //and
        System.out.println(a|b);        //or
        System.out.println(a^b);        // uper
        System.out.println(a<<2);       //left shift
        System.out.println(a>>2);       //right shift

*/


//if

/* 
        int x = 10;
        int y = 9 ;
        System.out.println(" sts 1");
        if (--x <= ++y){
                System.out.println("sts 2");
        }
        System.out.println("sts3");

        // boolean cant converted int into boolean
        int a = 10 ;
        int b = 9 ;
        System.out.println("sts 1");
        if(x=y){
                System.out.println("sts 2 ");
        }
        System.out.println("sts 3");        // O/P = Error 


        int c = 10 ;
        int d = 9 ;
        System.out.println("sts 1");
        if(x!=y){
                System.out.println("sts 2 ");
        }
        System.out.println("sts 3");

*/


//if - else

/* 
        boolean a = false ;
        boolean b = true ;
        System.out.println("sts 1");
        if(a=b){
                System.out.println("sts 2 ");
        }
        else{
                System.out.println("sts 3 ");
        }
        System.out.println("sts 4");


        int a= 8;
        int b =9 ;
        if(a>b){
                System.out.println(a +" Is greater ");
        }else{
                System.out.println(b + " Is greater ");
        }
*/

//if- elseif -else

/* 

        int a = 9;
        int b= 10;
        int c= 15;

        if(a>b && a>c){
                System.out.println(a + " Is Greater ");
        }
        else if(b>a && b>c){                                 //else if(b>c) correct 

                System.out.println(b + " Is greter");
        }
        else{
                System.out.println(c + " Is greater ");
        }

*/

//Switch case 

     
/*
        int a =4;
        switch(a){
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                default:System.out.println("Invalid Id");
        }

*/


//switch with String (without break function) support version 17 using   " -> "


/*
        String cnName = "Microsoft";
        switch (cnName) {
            case "Apple" -> System.out.println("Steve Jobs");
            case "Microsoft" -> System.out.println("Bill Gates");
            case "Tesla" -> System.out.println("Elon Musk");
            default->System.out.println("Exit Case");
        }


*/

//Loops (basic code for understanding)

        // For Loop (even number)

        /* 
        for(int i= 1; i<=10; i++){
                if(i %2==0){
                System.out.println(i);
                }
        }

        */

//divisible by 3 

        

        for(int i =0; i<10; i++){
               
                        System.out.println(i);
                
        }



//divisible by 2 and 3 

        /* 
        for(int i = 1; i<=30; i++){
                if(i%2==0 && i%3==0){
                        System.out.println(i);
                }
        }
        */

//odd even

        /* 
        for(int i = 1; i<10; i++){
                if(i%2==0){
                        System.out.println(i+ " This is Even ");
                }else{
                        System.out.println(i+" This is Odd");
                }
        }

        */


//for user input  MathTable

        /*
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();

        for(int i=1; i<=20; i+=2){   
                System.out.println((number*i));            
        }

        sc.close();

        */

//while loop  --same as for loop 
/*
        int i = 1;
        while(i<=10){
                System.out.println("Hello " +i);
                i++;
        }
*/

// same as for create a mathtable using user input

/*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int i = 1;
        while(i<=10){
                System.out.println(num*i);
                i++;
        }

*/

// do while loop --exit control loop





  
}    
}
