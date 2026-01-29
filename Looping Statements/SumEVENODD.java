import java.util.Scanner;

class SumEVENODD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int foreven=0;
        int forodd=1;
        while(n>0)
        {
            int dig=n%10;
            if(dig%2==0)
            {
                foreven=dig+foreven;
            }
            else{
            forodd=dig*forodd;
            }
             n=n/10;
        }
        System.out.println("For Even:"+foreven+"\nFor Odd:"+forodd);
    }
}