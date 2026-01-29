import java.util.Scanner;

  class LeapYear {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year to check if it is a leap year:");
        int n=sc.nextInt();
        if((n%4==0 && n%100!=0) || n%400==0){
            System.out.println("Leap Year");
        }
        else
        System.out.println("Not Leap Year");
        }
  }