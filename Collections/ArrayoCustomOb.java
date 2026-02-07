import java.util.ArrayList;
import java.util.Collection;
public class ArrayoCustomOb {
    public static void main(String[] args) {
    
    ArrayList<Person> arr=new ArrayList<>();
    Person person1=new Person("John",20,"City1");
    Person person2=new Person("Alice",21,"City2");
    Person person3=new Person("Bob",22,"City3");
    Person person4=new Person("Charlie",23,"City4");

    arr.add(person1);
    arr.add(person2);
    arr.add(person3);
    arr.add(person4);
    System.out.println(arr);
    System.out.println(arr.size());
    }
}

 class Person{
    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name:"+name+" Age:"+age+" Address"+address;
    }
    
}
