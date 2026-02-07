

class ConstructorLinking {
    int id;
    String Name;
    int age;
    long phonenum;
    public ConstructorLinking(int id)
    {
        this.id=id;
    }
    public ConstructorLinking(int id,String Name)
    {
        this(id);
        this.Name=Name;
    }
    public ConstructorLinking(int id,String Name,int age)
    {
        this(id,Name);
        this.age=age;
    }
    public ConstructorLinking(int id,String Name,int age,long phonenum)
    {
        this(id,Name,age);
        this.phonenum=phonenum;
    }

    public static void main(String[] args) {
        ConstructorLinking ICons=new ConstructorLinking(101);
        ConstructorLinking INCons=new ConstructorLinking(101,"John");
        ConstructorLinking INACons=new ConstructorLinking(101,"John",10);
        ConstructorLinking INAPCons=new ConstructorLinking(101,"John",10,9999999999L);

    }

}