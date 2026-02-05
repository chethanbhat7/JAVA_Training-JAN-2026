class AshithGF{
    String name;
    int age;

    public boolean equals(AshithGF gf)
    {
    if (this.age==gf.age && this.name==gf.name){
        return true;
    }   
    return false;
    }

    public AshithGF(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
}


class OverideEquals {
    public static void main(String[] args) {
        AshithGF Fathima = new AshithGF("Fathima",20);
        AshithGF Gathima = new AshithGF("Fathima",20);
        System.out.println(Fathima.equals(Gathima));
    }
}
