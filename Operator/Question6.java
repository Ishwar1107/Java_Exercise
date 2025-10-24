// write a output in notebook {from Q7 to Q10}



public class Question6 {
    public static void main(String[] args) {
        //Q7
        int x = 19;
        int result1= x++ + ++x; //19+21
        System.out.println(result1); //     O/p : 40

        ///Q8
        int b =19;
        int result2 = ++b + b++ + ++b; //20+20+22
        System.out.println(result2); //      O/p : 62 
        
        //Q9
        int c = 14;
        int d = 22;
        int result3 = d++ + ++c + ++c;
        System.out.println(result3); //     O/p : 53


    }
    
}
