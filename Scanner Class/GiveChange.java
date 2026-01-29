import java.util.Scanner;
class GiveChange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value:");
        int Value=sc.nextInt();
        int TwoThousand=0;
        int Thousand=0;
        int Hundred=0;
        int Ten=0;
        int Two=0;
        int One=0;

        while(Value>0)
        {
            while(Value>=2000)
            {
                TwoThousand++;
                Value-=2000;
            }
            while(Value>=1000)
            {
                Thousand++;
                Value-=1000;
            }
            while(Value>=100)
            {
                Hundred++;
                Value-=100;
            }
            while(Value>=10)
            {
                Ten++;
                Value-=10;
            }
            while(Value>=2)
            {
                Two++;
                Value-=2;
            }
            while(Value>=1)
            {
                One++;
                Value-=1;
            }
        }
        System.out.println("Two Thousand:"+TwoThousand+"\nThousand:"+Thousand+"\nHundred:"+Hundred+"\nTen:"+Ten+"\nTwo:"+Two+"\nOne:"+One);
    }
}