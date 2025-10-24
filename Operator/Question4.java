// Q4 _ Write a program to perform bitwise operation on two integers . 
/*
Your program should be : 
        Perform bitwise AND , bitwise OR , butwise XOR, left shift and right shift operation 
        Display the result of each operation 
        ex:  enter the first number = 5 ; 
             enter the second number = 3; 
        Bitwise AND : 5 & 3 = 1;
        Bitwise OR : 5 | 3 = 7 ;
        Bitwise XOR : 5 ^ 1 = 2;
        left shift : 5 << 1 = 10;
        right shift : 5 >> 1 =2

 */ 


public class Question4 {
    public static void main(String[] args) {
        int first_number = 5;
        int second_number = 3;
        int third_number = 1;
        int result1 = first_number & second_number;
        int result2 = first_number | second_number;

        int result3 = first_number ^ third_number;
        int result4 = first_number << third_number;
        int result5 = first_number >>third_number;

        System.out.println("Result of Operation : "+ result1);
        System.out.println("Result of Operation : "+ result2);
        System.out.println("Result of Operation : "+ result3);
        System.out.println("Result of Operation : "+ result4);
        System.out.println("Result of Operation : "+ result5);

        
    }
    
}
/*
 Output : 
            PS C:\Users\Admin\OneDrive\Desktop\Exercise\Data_Type\operator> javac Question4.java
            PS C:\Users\Admin\OneDrive\Desktop\Exercise\Data_Type\operator> java Question4      
                Result of Operation : 1
                Result of Operation : 7
                Result of Operation : 4
                Result of Operation : 10
                Result of Operation : 2
 */
