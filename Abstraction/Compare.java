import java.util.Arrays;

class Compare {
    public static void main(String[] args) {
        
    
    Person arr[]={new Person("Alice",21,10000),new Person("Bob",20,20000)};

    Arrays.sort(arr);
        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
