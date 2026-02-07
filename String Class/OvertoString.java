class Student{
    int id;
    String Name;
    int age;

    public Student(int id,String Name,int age) {
    this.id=id;
    this.Name=Name;
    this.age=age;
    }

    public String toString()
    {
    return (" Id:"+id+"  Name:"+Name+"  Age:"+age);
    }
}


class OvertoString {
    public static void main(String[] args) {
    Student student = new Student(101,"John",20);
    System.out.println(student.toString());  
    }
}