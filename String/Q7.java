


//count vowel 

public class Q7 {
    public static void main(String[] args) {
        String str = new String("Education");
        int cnt =0;
        String str1 = "";
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch==65 || ch==69 || ch==73 || ch==79 || ch==85 || ch==97 || ch==101 || ch==105 || ch==111 || ch==117){
                str1 = str1+ch+"    ";
                cnt++;
        }
        

    }
    System.out.println(str1);
    System.out.println(cnt);

}
}

