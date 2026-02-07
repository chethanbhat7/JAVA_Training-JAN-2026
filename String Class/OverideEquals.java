class EqualsPerson{
    String name;
    int age;

    public boolean equals(EqualsPerson person)
    {
    if (this.age==person.age && this.name==person.name){
        return true;
    }   
    return false;
    }

    public EqualsPerson(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
}


class OverideEquals {
    public static void main(String[] args) {
        EqualsPerson person1 = new EqualsPerson("John",20);
        EqualsPerson person2 = new EqualsPerson("John",20);
        System.out.println(person1.equals(person2));
    }
}
