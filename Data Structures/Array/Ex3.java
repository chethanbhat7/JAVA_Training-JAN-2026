import java.util.Scanner;
class Ex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String names[]=new String[4];
        for(int i=0;i<4;i++)
        {
            names[i]=sc.next();
        }
        for(int i=0;i<4;i++)
        {
            System.out.println(names[i]);
        }
        int lastIndex=names.length;
        System.out.println(names[lastIndex-2]);
    }
}