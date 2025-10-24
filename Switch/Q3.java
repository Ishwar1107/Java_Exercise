public class Q3 {
    public static void main(String[] args) {

//Write a program to print long-form cloth sizes according to their acronym
//input = S output = Small || input = XL output = Extra Large

        String a="XL";
        switch(a){
            case "S"->System.out.println("Small");
            case "XL"->System.out.println("Large");
            case "X"->System.out.println("Large");
            case "M"->System.out.println("Medium");
        }
    }
}
