//Write program to print following pattern
/*1 4 9
  16 25 36
  49 64 81
 */
public class Q2 {
    public static void main(String[] args) {
        int num = 1;
        for(int i = 0; i<3 ; i++){
            for(int j = 0; j<3 ; j++){
                System.out.print(num * num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
//error
