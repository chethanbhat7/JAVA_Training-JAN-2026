import java.util.Scanner;
class PassMultipleINT {

    
    public static void main(String[] args) {
        System.out.println("Enter the numbers to add");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=10;
        int c=50;
        int sum=getSUM(a,b,c);
        System.out.println(sum);
    }

    public static int getSUM(int... a)
    {
        int sum=0;
        for(Integer x:a)
        {
            sum+=x;
        }
        return sum;
    }
}