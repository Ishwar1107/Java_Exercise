

public class If_else2 {
    public static void main(String[] args) {
        
//Q1 _Write a program to check whether the given number is in the range of 1 to 1000 or not 
//input = 100; output = 100 is 1 to 100 || input = 0 output = 0 is not in the range from 1 to 1000 || input = -11 output = -11 is not in the range 1 to 1000
/*  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int a = sc.nextInt();
        if(a>=1 && a<=1000){
            int start = (((a-1)/100)*100 +1);
            int end = start + 99;
            System.out.println("The number is between :"+start +" to :" +end+ " range");
        }else if (a==0) {
            System.out.println("The number is not in range from 1 to 1000");
        }else{
            System.out.println("The number is not in range");
        }
*/

//Q2 _Write a program to check whether the given number is the table of 13 or not (Take a integer from user)
//input = 156 ; output = 156 is from 13 table
/*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int a = sc.nextInt();
        if(a%13==0){
            System.out.println(a+" is a table of 13");
        }else{
            System.out.println(a+" is not from 13 table");
        }
*/
//Q3 _Write a program to check whether the given character is vowel or consonant.(take hard coded values)
//input = 'a' ; output : a is vowel || input = 'D' ; output = D is consonanat
/* 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character :");
        char ch = sc.next().charAt(0);
        if(ch ==97 || ch== 101 || ch== 105 || ch==111 || ch==117 || ch==65 || ch==69 || ch==73 || ch==79 || ch==85){
            System.out.println(ch+" is vowel");
        }else{
            System.out.println(ch+" is consanant");
        }
*/

//Q4 _A student who has passed hia 12th exam, he thinks he might get marks up to 85 percent. suggest a better career filed depending upon mark assumption
//input = percentage >85.00% ; output = medical || input = percentage <=85.00 and percentage > 75.00 ; output : Engineering0
//input = percentage <=75.00 and percentage >= 65 ; output = pharmacy or bcs 
/*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Percentage :");
        double percentage = sc.nextDouble();
        if(percentage > 85.00){
            System.out.println("Medical");
        }else if(percentage <=85.00 && percentage >75.00){
            System.out.println("Engineering");
        }else if(percentage <=75.00 && percentage >65.00){
            System.out.println("Pharmacy or Bcs");
        }else if(percentage <=65 && percentage >= 50.00){
            System.out.println("BSc Agree");
        }else if(percentage< 50.00){
            System.out.println("Give Donation");
        }
*/

//Q5 _Write a program to check whether the given float value is divisible by 6 or not (take a user input)
//input = floatNum =120 ; output = 120 is divisible by 6 || input = floatNum = 89.96 ; output = 89.96 is not divisible by 6
/*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a float number : ");
        double floatNum = sc.nextDouble();
        if(floatNum==0)
        {
            System.out.println("the given number is not divisible by zero");
        }
        else if(floatNum%6 ==0){
            System.out.println(floatNum+" is divisible by 6 ");
        }else{
            System.out.println(floatNum+" is not divisible by 6");
        }
*/

//Q6 _Write a program to verify the age of the voter where the age should be positive, which means no negative values are allowes (take user input)
// Input = 21 ; output =valid age for voting || input = -21 ; output = invalid age for output 
/*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        int a = sc.nextInt();
        if(a>=0 && a<18){
            System.out.println(a+" is not allow");
        }
        else if(a>=18){
            System.out.println(a+" is Valid for voting");
        }else{
            System.out.println("Invalid for voting");
        }
*/

//Q7 _Write a program to calculate a profit or loss 
// Write a program that take the cost price and selling price and calculates its profit or loss (Take user input //selling price and cost price)
//input = selling price = 1200; cost price = 1000; output = profit = 200
/*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Selling Price : ");
        int a = sc.nextInt();
        System.out.print("Enter Cost Price : ");
        int b = sc.nextInt();
        if (a>b) {
            int profit=(a-b);
            System.out.println(profit+" is profit");
        }else if(a<b){
            int loss=(b-a);
            System.out.println(loss+" is loss");
        }else{
            System.out.println("No Loss");
        }
*/

//Q8 _Write a program to check whether the student passed with :
//first class with distinction, first class, second class, pass and fail according to his process grades (Take input from user)
//input = percent = 85.00; output = first class with distinction 
//input = 75.00 output = first class with distinction
/*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Selling Price : ");
        double a = sc.nextDouble();
        if(a>=85.00){
            System.out.println(a+" First class with Distinction");
        }else if(a>=70.00 && a<85.00){
            System.out.println(a+" First Class");
        }else if(a>=60 && a<70){
            System.out.println(a+" Second Class with Distinction");
        }else if(a>=40 && a<60){
            System.out.println(a+" Second Class");
        }else if(a>=35 && a<40){
            System.out.println(a+" Pass");
        }else{
            System.out.println("Fail");
        }
*/

//Q9 _Write a program in java to accept three numbers and check whether they are pythoagorean triplets or not (Take input user)
//input = a*a+b*b =c*c
//its pythagorean triplet else not else not a pythagoren triplet
/*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter c : ");
        int c = sc.nextInt();

        int ans= a*a+b*b;
        int result =c*c;

        if(result==ans){
            System.out.println("This is Pythogorean Triplet ");
        }else{
            System.out.println("This is not Pythogrean Triplet ");
        }
*/
    }
    
}
