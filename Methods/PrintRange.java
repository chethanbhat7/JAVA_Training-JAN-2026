import java.util.Scanner;
class PrintRange {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter the start number :");
     int start=sc.nextInt();
     System.out.println("Enter the Ending number :");
     int end=sc.nextInt();  
     PrintRange(start,end);
    }   
    public static void PrintRange(int start,int end)
    {
        for(int i=start;i<=end;i++)
        {
            System.out.println(i);
        }
    }
}