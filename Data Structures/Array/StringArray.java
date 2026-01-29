import java.util.Scanner;
class StringArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Names[]=new String[5];
        for(int i=0;i<Names.length;i++)
        {
            System.out.println("Enter the name at index"+i);
            Names[i]=sc.next();
        }
        for (String Name : Names) {
            System.out.println(Name);
        }
        
    }
}