class Car{
    private String Make;
    private String Name;
    private String Colour;
    private int horsepower;
    private int no_tyers;
    private int no_seats;
    private double price;
    private double rating;
    private String Enginetype;
    private String Type;

    public Car(String Make,String Name,String Colour,int horsepower,int no_tyers,int no_seats,double price,double rating,String Enginetype,String Type)
    {
        Setter(Make,Name,Colour,horsepower,no_tyers,no_seats,price,rating,Enginetype,Type);
    }

    public void  Setter(String Make,String Name,String Colour,int horsepower,int no_tyers,int no_seats,double price,double rating,String Enginetype,String Type)
    {
        this.Make=Make;
        this.Name=Name;
        this.Colour=Colour;
        this.horsepower=horsepower;
        this.no_tyers=no_tyers;
        this.no_seats=no_seats;
        this.price=price;
        this.rating=rating;
        this.Enginetype=Enginetype;
        this.Type=Type;

    }
}