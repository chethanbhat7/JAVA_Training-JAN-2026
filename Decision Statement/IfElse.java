import java.util.Scanner;
class IfElse{
    public static void main(String[] args) {
        System.out.println("Enter an number");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        if(n>100)
        {
            System.out.println("Value greater than 100");
        }
        else if(n>50){
            System.out.println("Value Greater than 50");
        }
        else if(n>30){
            System.out.println("Value greater than 30");
        }
        else{
            System.out.println("Value less than 30");
        }
    }
}