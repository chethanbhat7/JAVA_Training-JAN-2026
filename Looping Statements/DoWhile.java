import java.util.Scanner;
class DoWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value till where you want to print:");
        int n=sc.nextInt();
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<n);
    }
}