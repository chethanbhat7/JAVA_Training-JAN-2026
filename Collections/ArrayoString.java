import java.util.ArrayList;
import java.util.Collection;

class ArrayoString {
    public static void main(String[] args) {
        ArrayList<String> arr= new ArrayList<String>();
        arr.add("Chethan");
        arr.add("Srinivas");
        System.out.println(arr);
        arr.addFirst("Ashith");
        arr.addLast("Chirag");
        System.out.println(arr);
    }
}
