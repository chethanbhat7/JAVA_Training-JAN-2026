
public class AshithGF implements Comparable<AshithGF>
{
    String name;
    int age;
    double salary;

    public AshithGF(String name, int age, double salary)
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
    // public int compareTo(AshithGF other)
    // {
    //     return this.name.compareToIgnoreCase(other.age);
    // }


    @Override
    public int compareTo(AshithGF other)
    {
        return Integer.compare(this.age, other.age);
    }
    
}