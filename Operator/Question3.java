// Q3 _ Write a program to demonstrate logical operation 
/* Perform logical AND , logical OR, and Logical NOT operation on the given boolean values
    Display the results of each Operation 
    Ex: first boolean value (true/ false) : true
        second boolean value (true/false) : false

    Logical AND : true &&  false = false,
    Logical OR : true || false = true ,
    Logical NOT : for the first value  : !true = false,
    Logical Not : for the second value : !false = true
 */

public class Question3 {
    public static void main(String[] args) {
        boolean first_value = true;
        boolean second_value = false;
        boolean result1 = first_value && second_value;
        boolean result2 = first_value || second_value;
        boolean result3 = !first_value;
        boolean result4 = !second_value;
        System.out.println("Result of Operation : "+ result1);
        System.out.println("Result of Operation : "+ result2);
        System.out.println("Result of Operation : "+ result3);
        System.out.println("Result of Operation : "+ result4);
    }
    
}
/*
 output: 
        PS C:\Users\Admin\OneDrive\Desktop\Exercise\Data_Type\operator> java Question3
            Result of Operation : false
            Result of Operation : true 
            Result of Operation : false
            Result of Operation : true 
 */
