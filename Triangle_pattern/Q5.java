
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        int num =1;


//print following pattern 
/*
Enter Number : 5
1       2       3       4       5
        6       7       8       9
                10      11      12
                        13      14
                                15

1       2       3       4
        5       6       7
                8       9
                        10                          
 */

/*
        for(int i=1; i<=a; i++){
            for(int j=1; j<=a; j++){
                if(j<=i-1){
                    System.out.print("\t");
                }else{
                    System.out.print(num+"\t");
                    num++;
                }
            }System.out.println("");
        }
*/

//print following patter 
/*
Enter Number : 5
1
2       3
4       5       6
7       8       9       10
11      12      13      14      15
 */
/*
        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){            //j<=i
                System.out.print(num+"\t");
                num++;
            }System.out.println("");
        }
*/

//print following pattern 
/*
Enter Number : 5
1       2       3       4       5
6       7       8       9
10      11      12
13      14
15
 */

/*
        for(int i=1; i<=a; i++){
            for(int j=1; j<=a+1-i; j++){            //j<=a+1-i
                System.out.print(num+"\t");
                num++;
            }System.out.println("");
        }
*/


//print following pattern 
/*
Enter Number : 5
                                1
                        2       3
                4       5       6
        7       8       9       10
11      12      13      14      15

Enter Number : 6
                                        1
                                2       3
                        4       5       6
                7       8       9       10
        11      12      13      14      15
16      17      18      19      20      21
 */

        for(int i=1; i<=a; i++){
            for(int j=1; j<=a; j++){
                if(j<=a-i){
                    System.out.print("\t");
                }else{
                    System.out.print(num+"\t");
                    num++;
                }
            }System.out.println("");
        }

    }
}
