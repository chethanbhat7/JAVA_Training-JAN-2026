
public class Person implements Comparable<Person>
{
    String name;
    int age;
    double salary;

    public Person(String name, int age, double salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return "Name: " + name + " Age: " + age + " Salary: " + salary;
    }

    // @Override
    @Override
    public int compareTo(Person other)
    {
        return Integer.compare(this.age, other.age);
    }
    
}