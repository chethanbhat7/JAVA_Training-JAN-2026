class Parent{

   public  Parent(){
        System.out.println("Parent");
    }
}

class Child extends Parent{

    {
    System.out.println("Child");
    }
}
 
class ExamplecallSuper {
    public static void main(String[] args) {
        Child a=new Child();
    }
}