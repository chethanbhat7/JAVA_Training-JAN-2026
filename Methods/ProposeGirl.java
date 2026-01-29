import java.util.Scanner;
class ProposeGirl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name of the girl:");
        String Gname=sc.next();
        String Reply=Propose(Gname);
        System.out.println(Reply);
    }
    public static String Propose(String Gname){
        return "I Love You "+Gname;
    }
}