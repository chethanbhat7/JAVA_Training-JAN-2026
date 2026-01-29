import java.util.Scanner;
class ForEach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Names[]=new String[4];

        for (int i = 0; i < 4; i++) {
               Names[i]=sc.next();
        }
        for(String i : Names){
            System.out.println(i);
        }
    }
}