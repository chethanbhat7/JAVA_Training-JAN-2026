import java.util.Scanner;

class SwitchEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an Number(1-9):");
        int n=sc.nextInt();
        switch(n){
            case 1 -> System.out.println("Number is One");
            case 2 -> System.out.println("Number is two");
            case 3 -> System.out.println("Number is three");
            case 4 -> System.out.println("Number is four");
            case 5 -> System.out.println("Number is five");
            case 6 -> System.out.println("Number is six");
            case 7 -> System.out.println("Number is seven");
            case 8 -> System.out.println("Number is eight");
            case 9 -> System.out.println("Number is nine");
        }

    }
}