
import java.util.Scanner;

//Parameter Constructor
class Program3 {
    int empId;
    String empName;

    public Program3(int empId, String empName  /*local variable*/  ) {
        this.empId = empId;         //this can store the data into instance variable
        this.empName = empName;
    }
    void empInfo(){
        System.out.println("Employee Id : "+empId);
        System.out.println("Emplyoee Name : "+empName);

    }
    
}
class Client{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            //user input 

        System.out.print("Enter Id : ");
        int empId = sc.nextInt();       //take user input 

        System.out.print("Enter EmpName : ");
        String empName = sc.next();     //single string 

        Program3 obj = new Program3(empId, empName);        //create object of parent class
        obj.empInfo();      //call method 
    }
}