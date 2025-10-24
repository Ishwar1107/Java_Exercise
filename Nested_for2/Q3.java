//print following pattern 
/*
1 4 27 16
125 36 343 64
729 100 1331 144
2197 196 3375 256    first cube second square 
 */
import java.util.Scanner;

class Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a= sc.nextInt();
        int num=1;
   
        for(int i = 1; i<=a; i++){
            for(int j=1; j<=a; j++){
                if(j%2!=0){
                    System.out.print(num*num*num+" ");
                }else{
                    System.out.print(num*num+" ");
                }
                num++;
            }System.out.println();
        }
    }
}