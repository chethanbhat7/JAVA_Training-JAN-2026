class Objects{
    int rollno;
    String Name;
    int age;
    public static void main(String[] args) {
        Objects Chirag=new Objects();
        Chirag.rollno=10;
        Chirag.Name="Chirag";
        Chirag.age=100;

        Objects Ashith=new Objects();
        Ashith.rollno=11;
        Ashith.Name="Ashtih";
        Ashith.age=420;

        System.out.println(Chirag.Name+"\t"+Chirag.age+"\t"+Chirag.rollno);
        System.out.println(Ashith.Name+"\t"+Ashith.age+"\t"+Ashith.rollno);
    }
}