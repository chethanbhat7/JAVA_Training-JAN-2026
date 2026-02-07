import java.util.ArrayList;
import java.util.Collection;

class ArrayoString {
    public static void main(String[] args) {
        ArrayList<String> arr= new ArrayList<String>();
        arr.add("John");
        arr.add("Alice");
        System.out.println(arr);
        arr.addFirst("Bob");
        arr.addLast("Charlie");
        System.out.println(arr);
    }
}
