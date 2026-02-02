class SetRadius {
    public static void main(String[] args) {
        Circle r=new Circle(10.0);
        double area=Utility.area(r);
        double diameter=Utility.diameter(r);
        System.out.println("Area:"+area+"\nDiameter"+diameter);
    }
    
}
class Circle{
    double radius;

    private void setter(double r)
    {
        if(r>0)
        {
        this.radius=r;
        }
        else
        System.out.println("Cant create the circle");
    }
    public Circle(double r)
    {
        this.setter(r);
    }
    public double getter()
    {
        return this.radius;
    }
}
class Utility{
    public static double area(Circle r)
    {
        double radius=r.getter();
        return 3.14*radius*radius;
    }
    public static double diameter(Circle r)
    {
        double radius=r.getter();
        return 2*3.14*radius;
    }

}