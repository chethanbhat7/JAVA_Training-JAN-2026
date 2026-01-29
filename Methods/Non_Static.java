class Non_Static {
    public static void main(String[] args) {
        NS ob=new NS(); 
        ob.NSMethod();
    }
}
class NS{
    public void NSMethod(){
        System.out.println("Hello this is NS Method");
    }
}