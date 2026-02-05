import java.util.Scanner;


class RevString {
    static void getrev(String s){
        String arroString[]=s.split(" ");
        for(int i=arroString.length-1;i>=0;i--)
        {
            System.out.print(arroString[i]+" ");
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Line");
        String s=sc.nextLine();
        getrev(s);
    }
}