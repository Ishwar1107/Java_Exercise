public class Q2 {
    public static void main(String [] args){
//Write a program to print Remark according to their respective grades
//input = O output = Outstanding
        char a='F';
        switch(a){
            case 'O'->System.out.println("Outstanding");
            case 'P'->System.out.println("Pass");
            case 'A'->System.out.println("Grade A");
            case 'B'->System.out.println("Grdae B");
            case 'F'->System.out.println("Fail");
        }
    }
}
