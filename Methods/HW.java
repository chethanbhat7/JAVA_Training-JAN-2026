import java.util.Scanner;
class HW {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("1.Addition\n2.Subtraction\n3.Multiplication\4.Check Prime\n5.Check Positive or Negative\n\nEnter the operation you want to do:");
        int option=sc.nextInt();
        switch(option){
            case 1 ->{
                        System.out.print("Enter two values:");
                        int num1=sc.nextInt();
                        int num2=sc.nextInt();
                        System.out.println("sum of "+num1+" and "+num2+" = "+Sum(num1,num2));
            }
            case 2->{
                        System.out.print("Enter two values:");
                        int num1=sc.nextInt();
                        int num2=sc.nextInt();
                        System.out.println("Subtraction of "+num1+" and "+num2+" = "+Subtract(num1,num2));

            }
            case 3->{
                        System.out.print("Enter two values:");
                        int num1=sc.nextInt();
                        int num2=sc.nextInt();
                        System.out.println("Multiplication of "+num1+" and "+num2+" = "+Multiply(num1,num2));

            }
            case 4->{
                        System.out.print("Enter the value:");
                        int num1=sc.nextInt();
                        System.out.println("The Number "+num1+" is "+CheckPrime(num1));

            }
            case 5->{
                        System.out.print("Enter the value:");
                        int num1=sc.nextInt();
                        System.out.println("The Number "+num1+" is "+CheckPosNeg(num1));
                
            }
            default -> {
                        System.out.println("Invalid Option");
            }
        }
    }

    public static int Sum(int a,int b){
        return a+b;
    }
    public static int Subtract(int a,int b){
        return a-b;
    }
    public static int Multiply(int a,int b){
        return a*b;
    }
    public static String CheckPrime(int a){
        if(a<0)
        {
            return("Number lesser than 0");
        }
        else if((a==1))
        {
            return ("Number not prime");
        }
        else if((a==2))
        {
            return ("Number is prime");
        }
        else
        {
            for(int i=2;i<=a/2;i++)
            {
                if(a%i==0){
                    return "Not Prime";
                }
            }
            return "Prime";
        }
    }
    public static String CheckPosNeg(int a){
        if (a==0)
        return "Number is 0";
        else
        return a>0? "Positive" : "Negative";
    }
}
