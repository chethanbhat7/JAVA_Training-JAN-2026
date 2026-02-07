class ParentClass{
     String name;
     int age;
     String address;
}

class ChildClass extends ParentClass{
     String hobby;
}


class ExamplewithNonStatic{
    public static void main(String[] args) {
        ChildClass child=new ChildClass();
        child.name="John";
        child.age=20;
        child.address="City";
        child.hobby="Body Building";
        System.out.println(child.hobby);
    }
}