import java.util.Scanner;

class HappyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int half=number/2;
        if (half*2==number){
            System.out.println("true");
        }
    }
}   