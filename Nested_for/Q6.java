import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        int num = 1;
        char ch =(char)(65);
        for(int i = 1; i<=a; i++){
            
            for(int j = 1 ; j<=a; j++){
                System.out.print(ch+""+num+" ");
                ch++;
                num++;
            }System.out.println();
        } 

    }
}

/*
 Enter number : 3
C1 C2 C3
C4 C5 C6
C7 C8 C9

Enter number : 5
A1 B2 C3 D4 E5
F6 G7 H8 I9 J10
K11 L12 M13 N14 O15
P16 Q17 R18 S19 T20
U21 V22 W23 X24 Y25
 */
