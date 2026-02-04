class PenEq {
    String Brand;
    int Manyear;
    String inkcolour;
    public boolean equals(PenEq p)
    {
        return (this.Brand.equalsIgnoreCase(p.Brand) && this.Manyear==p.Manyear && this.inkcolour.equalsIgnoreCase(p.inkcolour));
    }
    public PenEq(String Brand,int Manyear,String inkcolour)
    {
        this.Brand=Brand;
        this.Manyear=Manyear;
        this.inkcolour=inkcolour;
    }
    public static void main(String[] args) {
        PenEq Doms = new PenEq("Doms",2020,"Black");
        PenEq Mons = new PenEq("doms",2020,"black");
        System.out.println(Doms.equals(Mons));
        
    }
}