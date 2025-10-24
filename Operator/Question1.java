// Q1 _ Write a Program to perform basic arithmetic operation on two number s. 
// first number = 10 , second number = 5 : 
// Addition , Substraction , Multiplication , Division .

class Question1{
   public static void main(String[] args){

        int first_number = 10 ;
        int second_number = 5 ;
       int result1 =  first_number+second_number;
       int result2 =  first_number-second_number;
       int result3 =  first_number*second_number;
       int result4 =  first_number/second_number;
        System.out.println("Addition of Two number : "+result1);
        System.out.println("Substraction of Two number : "+result2);
        System.out.println("Multiplication of Two number : "+result3);
        System.out.println("Division of Two number : "+result4);


    }
} 

/*
 Output :
        PS C:\Users\Admin\OneDrive\Desktop\Exercise\Data_Type\operator> javac Question1.java
        PS C:\Users\Admin\OneDrive\Desktop\Exercise\Data_Type\operator> java Question1
            Addition of Two number : 15
            Substraction of Two number : 5   
            Multiplication of Two number : 50
            Division of Two number : 2     
 */