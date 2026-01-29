

class Book {
    int Bookid;
    String Bookname;
    String Author;
    String Publisher;
    int YearofPublish;
    int NumberofPages;

    public static void main(String[] args) {
        Book Brabus= new Book();

        Brabus.Bookid=101;
        Brabus.Bookname="Brabus";
        Brabus.Author="Mahesh";
        Brabus.Publisher="MB";
        Brabus.YearofPublish=2020;
        Brabus.NumberofPages=100;

        Book Ferrari= new Book();

        Ferrari.Bookid=102;
        Ferrari.Bookname="Ferrari";
        Ferrari.Author="Ashith";
        Ferrari.Publisher="AB";
        Ferrari.YearofPublish=2020;
        Ferrari.NumberofPages=150;

        Book Lamborghini =new Book();

        Lamborghini.Bookid=103;
        Lamborghini.Bookname="Lamborghini";
        Lamborghini.Author="Chirag";
        Lamborghini.Publisher="CB";
        Lamborghini.YearofPublish=2021;
        Lamborghini.NumberofPages=150;

        System.out.println(Brabus.Bookid+"\t"+Brabus.Bookname+"\t"+Brabus.Author+"\t"+Brabus.Publisher+"\t"+Brabus.YearofPublish+"\t"+Brabus.NumberofPages);
        System.out.println(Ferrari.Bookid+"\t"+Ferrari.Bookname+"\t"+Ferrari.Author+"\t"+Ferrari.Publisher+"\t"+Ferrari.YearofPublish+"\t"+Ferrari.NumberofPages);
        System.out.println(Lamborghini.Bookid+"\t"+Lamborghini.Bookname+"\t"+Lamborghini.Author+"\t"+Lamborghini.Publisher+"\t"+Lamborghini.YearofPublish+"\t"+Lamborghini.NumberofPages);
    }
}
