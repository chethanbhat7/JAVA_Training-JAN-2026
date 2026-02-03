class Parent{

    void Dance(){
        System.out.println("I am a DJ Dancer");
    }
}

class Child  extends Parent{
   
    void Dance(){
        System.out.println("I am a Classical Dancer");
    }

}


class ExampleOveriding {

    public static void main(String[] args) {
    Child newChild=new Child(); 
    newChild.Dance();   
    }
}