import java.util.Scanner;
class Ex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ChiragGF[]=new String[4];
        for(int i=0;i<4;i++)
        {
            ChiragGF[i]=sc.next();
        }
        for(int i=0;i<4;i++)
        {
            System.out.println(ChiragGF[i]);
        }
        int lastIndex=ChiragGF.length;
        System.out.println(ChiragGF[lastIndex-2]);
    }
}