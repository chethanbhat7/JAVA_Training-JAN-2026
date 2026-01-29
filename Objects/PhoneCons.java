import java.util.Scanner;
class PhoneCons {
        String Brand;
        String Model;
        String colour;
        int Cam_Pixel;
    public PhoneCons(String Brand,String Model,String colour,int Cam_Pixel){
        this.Brand=Brand;
        this.Model=Model;
        this.colour=colour;
        this.Cam_Pixel=Cam_Pixel;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Phone 1 Details");
        System.out.println("Enter Phone Brand");
        String Brand1=sc.next();
        System.out.println("Enter Phone Model");
        String Model1=sc.next();
        System.out.println("Enter the Phone Colour");
        String colour1=sc.next();
        System.out.println("Enter the Phone  Camera Mega Pixel");
        int Cam_Pixel1=sc.nextInt();
        PhoneCons Phone1=new PhoneCons(Brand1,Model1,colour1,Cam_Pixel1);


        System.out.println("Enter Phone 2 Details");
        System.out.println("Enter Phone Brand");
        String Brand2=sc.next();
        System.out.println("Enter Phone Model");
        String Model2=sc.next();
        System.out.println("Enter the Phone Colour");
        String colour2=sc.next();
        System.out.println("Enter the Phone  Camera Mega Pixel");
        int Cam_Pixel2=sc.nextInt();
        PhoneCons Phone2=new PhoneCons(Brand2,Model2,colour2,Cam_Pixel2);
        


        System.out.println("Enter Phone 3 Details");
        System.out.println("Enter Phone Brand");
        String Brand3=sc.next();
        System.out.println("Enter Phone Model");
        String Model3=sc.next();
        System.out.println("Enter the Phone Colour");
        String colour3=sc.next();
        System.out.println("Enter the Phone  Camera Mega Pixel");
        int Cam_Pixel3=sc.nextInt();
        PhoneCons Phone3=new PhoneCons(Brand3,Model3,colour3,Cam_Pixel3);
    }

}
