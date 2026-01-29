import java.util.Scanner;
class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
        Method ob=new Method();
        if(ob.CheckArmstrong(num)==num)
        {
            System.out.println("The Number is an Armstrong number");
        }
        else
        System.out.println("Not an Armstrong number");
    }
}
class Method{
    public int CheckArmstrong(int num){
        int digcount=0;
        int digcount_container=num;
        int summed=0;
        while(digcount_container>0){
            digcount++;
            digcount_container=digcount_container/10;
        }
        while(num>0)
        {
            int digit=num%10;
            int times=1;
            for(int i=0;i<digcount;i++)
            {
                times*=digit;
            }
            summed+=times;
            num/=10;
        }
        return summed;
        
    }
}