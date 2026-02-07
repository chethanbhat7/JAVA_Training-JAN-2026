class Parent{
    String name="John";
}
class Child extends Parent{
    String name="Jane";
    {
    System.out.println(super.name);
    System.out.println(name);
    }
}
class ExampleSuper{
    public static void main(String[] args) {
     Child a=new Child();      
    }
}