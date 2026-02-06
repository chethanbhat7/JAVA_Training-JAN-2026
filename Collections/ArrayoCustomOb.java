import java.util.ArrayList;
import java.util.Collection;
public class ArrayoCustomOb {
    public static void main(String[] args) {
    
    ArrayList<Person> arr=new ArrayList<>();
    Person Chethan=new Person("Chethan",20,"VCET");
    Person Dhethan=new Person("Dhethan",21,"CVET");
    Person Ehethan=new Person("Ehethan",22,"ECVT");
    Person Fhethan=new Person("Fhethan",23,"TCEV");

    arr.add(Chethan);
    arr.add(Dhethan);
    arr.add(Ehethan);
    arr.add(Fhethan);
    System.out.println(arr);
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
