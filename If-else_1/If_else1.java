


public class If_else1 {
    public static void main(String [] args){

//Q1 _ Write a program to check whether the given number is Positive or Negative 
/// input = 5 ; output : 5 is Positive number .
/*
        int a = 0; 
        if(a>0){
            System.out.println(a+" is Positive Number ");
        }else if(a==0){
            System.out.println(a+" is not psitive nor negative");

        }else{
            System.out.println(a+ " is Negative number "); 
        }
*/


// Q2 _ Write a program to check whether the given number is even or odd
//user input
// input num = 8; output :  8 is even number 
// input num = 13 ; output : 13 is odd number 
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if (a%2==0){
            System.out.println(a+" is a Even Number");
        }else{
            System.out.println(a+" is Odd Number");
        }
        sc.close();

*/

//Q3 _ Write a program to check whether the given number is less than 10 or greater than 10 
// input num=13;  output : 13 is greater than 10
// input num = 8 ; output : 8 is less than 10 
/*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a =sc.nextInt();
        if(a>10){
            System.out.println(a+" is a greater than 10");
        }else if(a==10){
            System.out.println(a+" is equal to 10");

        }else{
            System.out.println(a+" is a less than 10");
        }
*/

//Q4 _ Write a program to check whether a the given character is in UPPERCASE or LOWERCASE use a hardcode value 
//input ch = 'a'; output : a is lowercase
// input ch = 'A' ; output : A is uppercase

/*
       char ch ='[';
       if(ch>=97 && ch<=122){
        System.out.println(ch+" is Lower Case");
       }else if (ch>=65 && ch<=90) {
           System.out.println(ch+" is Upper case");
           
       }else{
        System.out.println(" Is not Applicable");
       }
*/


//Q5 _ Write a program to check whether the given number is divisible by 3 or 7 
//input = 15; output : 15 is divisible by 3 
//input = 28; output : 28 is divisible by 7 
//input = 20; output : 20 is not divisible by 3 and 7 
/*
        int a = 7;
        if(a%3== 0 && a%7==0){
            System.out.println(a+" is divsible by 3 or 7 ");
        }
        else if(a%3==0){
            System.out.println(a+ " is divisible 3");
        }else if(a%7==0){
            System.out.println(a+" is divisible by 7");
        }else{
            System.out.println("The numner is not divisible by 3 or 7 ");
        }
*/

//Q6 _ Write a program to check whether the given number divisible by 7 or not 
//input : 105; output : divisible by 7 
//input : 31 ; output : not divisible by 7 

/*
        int a = 31; 
        if(a%7==0){
            System.out.println(a+" is divisible by 7");
        }else{
            System.out.println(a+" is not divisible by 7");
        }
*/

//Q7 _ Write a program to check if the given number is 2,5 and 10 or not , if not print message " is not divisible by 2, 5 and 10"
//input = 10; output: 10 is divisible 2,5 and 10 
//input = 15; output: 15 is not divisible by  2,5 and 10
/*
        int a = 10;
        if(a%2==0 && a%5==0 && a%10==0){
            System.out.println(a+" is divisible by 2,5 and 10");
        }else{
            System.out.println(a+" is not divisible by 2, 5 and 10");
        }
*/

//Q8 _Write a program to find the maximum between two distinct number 
//input a=5 b=9 output = 9 is maximum number 
/*
        int a = 5;
        int b = 9;
        if(a>b){
            System.out.println(a+" is Maximum number ");
        }else{
            System.out.println(b+" is Maximum number ");
        }
*/

//Q9 _Write a program to check the day number(1-7) and print the correspondinf day 
//input =1 output = Monday || input = 7 output = Sunday || input = 8 output = Day number must be between 1 to 7!!!
/*
        int a =10 ;
        if(a==1){
            System.out.println("Monday");
        }else if (a==2){
            System.out.println("Tuesday");
        }else if (a==3){
            System.out.println("Wednesday");
        }else if (a==4){
            System.out.println("Thursday");
        }else if (a==5){
            System.out.println("Friday");
        }else if (a==6){
            System.out.println("Saturday");
        }else if (a==7){
            System.out.println("Sunday");
        }else{
            System.out.println("Day number must between 1 to 7");
        }
*/

//Q10 _Write a program to print a month according to month number 
//input = 1; output = January || input = 2 ; output = February || input = 13 outout = Invalid input for month 

        int a =14 ;
        if(a==1){
            System.out.println("January");
        }else if (a==2){
            System.out.println("February");
        }else if (a==3){
            System.out.println("March");
        }else if (a==4){
            System.out.println("April");
        }else if (a==5){
            System.out.println("May");
        }else if (a==6){
            System.out.println("June");
        }else if (a==7){
            System.out.println("July");
        }else if (a==8){
            System.out.println("August");
        }else if (a==9){
            System.out.println("September");
        }else if (a==10){
            System.out.println("October");
        }else if (a==11){
            System.out.println("November");
        }else if (a==12){
            System.out.println("December");
        }else{
            System.out.println("Invalid input for month ");
        }
  }
}
