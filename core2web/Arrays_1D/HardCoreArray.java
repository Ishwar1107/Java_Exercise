public class HardCoreArray {
    public static void main(String[] args) {
        int a[] = new int[]{10,15,20,30};
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+"    ");
        }
        
        System.out.print("\n");

        for(int i= 3; i>=0; i--){
            System.out.print(a[i]+"    ");
        }
    }
}
