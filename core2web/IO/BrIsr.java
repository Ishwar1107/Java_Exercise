import java.io.*;

public class BrIsr {
    public static void main(String[] args)throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        //readLine() reads all data as string therefor use a typecast called as Wrapper class

        System.out.print("Enter Society Name : ");
        String socName = br.readLine();             //read String
        
        System.out.print("Enter Society Wing : ");
        char socWing = br.readLine().charAt(0);         //char use only one character 

        System.out.print("Enter Flat Number : ");
        int socNo = Integer.parseInt(br.readLine());        //read interger value using typecasting //Wrapper class

        System.out.println("Enter Rent : ");
        float socRent = Float.parseFloat(br.readLine());

        System.out.println("Society Name :"+socName);
        System.out.println("Society Wing :"+socWing);
        System.out.println("Society FlatNumber :"+socNo);
        System.out.println("Society FlatNumber :"+socRent);


  
    }

    
}
