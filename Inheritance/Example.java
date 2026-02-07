class ParentClass{
    static String name;
    static int age;
    static String address;
    
    static{
    System.out.println("HELLO PARENT");
    }
}

class ChildClass extends ParentClass{
    static String hobby;
    static{
    System.out.println("HELLO CHILD");
    }
}


class Example{
    public static void main(String[] args) {
        ChildClass child=new ChildClass();
        child.name="John";
        child.age=20;
        child.address="City";
        child.hobby="Body Building";
        System.out.println(child.hobby);
        ChildClass newchild= new ChildClass();
    }
}