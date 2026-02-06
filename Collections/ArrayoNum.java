import java.util.ArrayList;
import java.util.Collection;
class ArrayoNum {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<Integer>();
        arr.add(100);
        arr.add(200);
        arr.add(300);
        System.out.println(arr);
        arr.add(0,1000);
        System.out.println(arr);

    }
}