class Parent{
    String name="Ashith";
}
class Child extends Parent{
    String name="Chirag";
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