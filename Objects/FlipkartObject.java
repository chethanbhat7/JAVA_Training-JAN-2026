import java.util.Scanner;
class FlipkartObject {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of customers");
        int num_customers=sc.nextInt();
        FlipkartEndUser cus[]= new FlipkartEndUser[num_customers];
        for(int i=0;i<num_customers;i++)
        {
            cus[i]= new FlipkartEndUser();
            System.out.print("Enter the customer name");
            String customer_name=sc.next();
            cus[i].name=customer_name;
            System.out.print("Enter the customer age:");
            cus[i].age=sc.nextInt();
            System.out.print("Enter the customer total:");
            cus[i].total=sc.nextInt();
            System.out.print("Enter the customer Address ");
            cus[i].Address=sc.next();
            
        }

        System.out.println("All Records");

        for (int i = 0 ;i < num_customers; i++){
                    System.out.println(cus[i].name+"\t"+cus[i].age+"\t"+cus[i].total+"\t"+cus[i].Address);
        }
            
        
    }
    
}

class FlipkartEndUser{
    String name;
    int age;
    int total;
    String Address;
    
    public FlipkartEndUser(){
    }
}