class ChiragGF{
    int id;
    String Name;
    int age;

    public ChiragGF(int id,String Name,int age) {
    this.id=id;
    this.Name=Name;
    this.age=age;
    
    }

    
    public String toString()
    {
    return (" Id:"+id+"  Name:"+Name+"  Age:"+age);
    }
}


class OvertoString {
    public static void main(String[] args) {
    ChiragGF Ashith = new ChiragGF(101,"Ashith",60);
    System.out.println(Ashith.toString());  
    }
}