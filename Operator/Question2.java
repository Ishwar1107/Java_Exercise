//Q2 _ Write a program to compare two number using relational operators.
/* Your program should : 
   compare whether first number is greater than , less than equal to , not equal to , greater than , or equal to and 
   less than equal to the second number .
   Display the comparison  result .

   first number = 7 ;
   second number = 5;

   7>5 : true,
   7<5 : false,
   7==5 : false,
   7!=5 : true, 
   7>=5 : true,
   7<=5 : false.
 */

public class Question2 {
    public static void main(String[] args) {
        
        int first_number = 7;
        int second_number = 5;
        boolean result1 = first_number > second_number;
        boolean result2 = first_number < second_number;
        boolean result3 = first_number == second_number;
        boolean result4 = first_number != second_number;
        boolean result5 = first_number >= second_number;
        boolean result6 = first_number <= second_number;
        System.out.println("Result of Comparison : " + result1);
        System.out.println("Result of Comparison : " + result2);
        System.out.println("Result of Comparison : " + result3);
        System.out.println("Result of Comparison : " + result4);
        System.out.println("Result of Comparison : " + result5);
        System.out.println("Result of Comparison : " + result6);
        
    }
    
}
/*
 Output : 
        PS C:\Users\Admin\OneDrive\Desktop\Exercise\Data_Type\operator> javac Question2.java
        PS C:\Users\Admin\OneDrive\Desktop\Exercise\Data_Type\operator> java Question2      
            Result of Comparison : true
            Result of Comparison : false
            Result of Comparison : false
            Result of Comparison : true
            Result of Comparison : true
            Result of Comparison : false            
 */