class Pen{
     String name;
     int price;
     String Model;
     Boolean isBallpoint;
     Boolean isGellPen;

    private Pen(String name,int price , String Model,Boolean isBallpoint,Boolean isGellPen)
    {
        setter(name,price,Model,isBallpoint,isGellPen);
    }
    public void setter(String name,int price , String Model,Boolean isBallpoint,Boolean isGellPen)
    {
            this.name=name;
            this.price=price;
            this.Model=Model;
            this.isBallpoint=isBallpoint;
            this.isGellPen=isGellPen;
    }

    public String toString()
    {
        return "Name:"+name+" price:"+price+" Model:"+Model+" isBallPoint:"+isBallpoint+" isGellPen:"+isGellPen;
    }

    public static Pen Helper(String name,int price , String Model,Boolean isBallpoint,Boolean isGellPen){
            return new Pen(name,price,Model,isBallpoint,isGellPen);
        }

    public static void main(String[] args) {
        System.out.println(Helper("Doms", 10, "Fast", true, false));
    }
}
